package integradora;

public class Producto {
    public String Nombre;
    public int ID, Unidades, Ventas;
    
    public Producto(int id, String nombre, int unidades, int ventas){
        ID = id;
        Nombre = nombre;
        Unidades = unidades;
        Ventas = ventas;
    }
    
    public String toString(){
        return Unidades + " unidades \n" + Ventas + " ventas";
    }
}
