/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integradora.MenuInventario;

import integradora.Main;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author DELL
 */
public class AgregarProducto extends javax.swing.JFrame {
    public MenuInventario menu;
    
    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto() {
        initComponents();
        
        Nombre.setColumns(8);
        Unidades.setColumns(8);
        Ventas.setColumns(8);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CerrarBoton = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Unidades = new javax.swing.JTextField();
        Ventas = new javax.swing.JTextField();
        VentasLabel = new javax.swing.JLabel();
        UnidadesLabel1 = new javax.swing.JLabel();
        ConfirmarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CerrarBoton.setText("Cancelar");
        CerrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarBotonActionPerformed(evt);
            }
        });

        NombreLabel.setText("Nombre");

        VentasLabel.setText("Ventas");

        UnidadesLabel1.setText("Unidades");

        ConfirmarBoton.setText("Confirmar");
        ConfirmarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ConfirmarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CerrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnidadesLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VentasLabel)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CerrarBoton)
                    .addComponent(NombreLabel)
                    .addComponent(VentasLabel)
                    .addComponent(UnidadesLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarBoton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarBotonActionPerformed
        Cerrar();
    }//GEN-LAST:event_CerrarBotonActionPerformed

    private void ConfirmarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarBotonActionPerformed
        String nombre = "";
        int unidades = 0, ventas = 0;
        
        try {
            nombre = Nombre.getText().toString();
        } catch (Exception e) {
            System.out.println("Hubo un error al intentar acceder el nombre");
            showMessageDialog(null, "Hubo un error al intentar acceder el nombre", "Error", ERROR_MESSAGE);
            return;
        }
        
        try {
            unidades = Integer.parseInt(Unidades.getText());
        } catch (Exception e) {
            System.out.println("Hubo un error al intentar acceder las unidades");
            showMessageDialog(null, "Hubo un error al intentar acceder las unidades", "Error", ERROR_MESSAGE);
            return;
        }
        
        try {
            ventas = Integer.parseInt(Ventas.getText());
        } catch (Exception e) {
            System.out.println("Hubo un error al intentar acceder las unidades");
            showMessageDialog(null, "Hubo un error al intentar acceder las unidades", "Error", ERROR_MESSAGE);
            return;
        }
        
        menu.EjecutarUnComandoALaBaseDeDatos("insert into inventario(nombre,unidades,ventas) values ('" + nombre + "', '" + unidades + "', '" + ventas + "');");
        
        Main.ObtenerOActualizarLosProductos();
        menu.ObtenerListaDeProductos();
        menu.ActualizarTexto();
        Cerrar();
    }//GEN-LAST:event_ConfirmarBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    private void Cerrar(){
        setVisible(false);
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarBoton;
    private javax.swing.JButton ConfirmarBoton;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField Unidades;
    private javax.swing.JLabel UnidadesLabel1;
    private javax.swing.JTextField Ventas;
    private javax.swing.JLabel VentasLabel;
    // End of variables declaration//GEN-END:variables
}
