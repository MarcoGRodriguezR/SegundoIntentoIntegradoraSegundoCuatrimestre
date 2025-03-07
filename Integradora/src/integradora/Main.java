package integradora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Main {

    /**
     * Donde se guardaran los valores de la base de datos, note que probablemente no se actualicen los valores y tenga que llamar "ObtenerLosProductos" cada vez que quiera hacer un cambio
     */
    public static ArrayList<Producto> Inventario = new ArrayList();
    
    public static void main(String[] args) {
        if (!ObtenerOActualizarLosProductos()) return;
        
        // 2025 Mar 05: Simplemente de prueba para ver si se han obtenido los productos correctamente
        //System.out.println("\n- - > Inventario");
        //for (Producto producto : Inventario) System.out.println(producto);
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
    }
    
    public static boolean ObtenerOActualizarLosProductos(){
        String url = "jdbc:mysql://localhost:3306/servikino",
                usuario = "root",
                contraseña = "";
        
        Inventario.clear();
        
        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)){
            System.out.println("\n- - > Inicio de coleccion \n");

            // Un query es una consulta
            String query = "select * from inventario";


            try (PreparedStatement stmt = conn.prepareStatement(query)){
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int unidades = rs.getInt("unidades"),
                    ventas = rs.getInt("ventas");

                System.out.println("ID: " + id + "; Nombre: " + nombre + "; unidades: " + unidades + "; ventas: " + ventas);
                Inventario.add(new Producto(id, nombre, unidades, ventas));
                }
            } catch (SQLException e){
                System.out.println("Error al ejectutar la consulta: \n" + e.getMessage());
                return false;
            }
            
            System.out.println("\n- - > Fin de coleccion \n");
        } catch (SQLException e){
            System.out.println("Error al conectar a la base de datos: \n" + e.getMessage());
            return false;
        }
        
        return true;
    }

}
