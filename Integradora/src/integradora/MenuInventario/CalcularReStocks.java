/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integradora.MenuInventario;

import integradora.Producto;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author DELL
 */
public class CalcularReStocks extends javax.swing.JFrame {
    public MenuInventario menu;
    public Producto producto;

    /**
     * Creates new form CalcularReStocks
     */
    public CalcularReStocks() {
        initComponents();
    }
    /**
     * Creado para visibilar este elemento y hacer unos calculos que no puedo agregar en la creacion del objeto
     */
    public void Iniciar(){
        setVisible(true);
        RestablecerValores();
        Unidades.setColumns(12);
        Ventas.setColumns(12);
    }
    private void RestablecerValores(){
        Unidades.setText(Integer.toString(producto.Unidades));
        Ventas.setText(Integer.toString(producto.Ventas));
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
        UnidadesLabel = new javax.swing.JLabel();
        Unidades = new javax.swing.JTextField();
        VentasLabel = new javax.swing.JLabel();
        Ventas = new javax.swing.JTextField();
        Reinicar = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoPrincipal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CerrarBoton.setText("Cerrar");
        CerrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarBotonActionPerformed(evt);
            }
        });

        UnidadesLabel.setText("Unidades en inventario (editable)");

        Unidades.setText("jTextField1");
        Unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadesActionPerformed(evt);
            }
        });

        VentasLabel.setText("Ventas por hoy (editable)");

        Ventas.setText("jTextField1");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });

        Reinicar.setText("Restablecer Valores");
        Reinicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinicarActionPerformed(evt);
            }
        });

        Calcular.setText("Calcular tiempo para rebastecer");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        TextoPrincipal.setEditable(false);
        TextoPrincipal.setColumns(20);
        TextoPrincipal.setRows(5);
        jScrollPane1.setViewportView(TextoPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CerrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnidadesLabel)
                            .addComponent(Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VentasLabel)
                            .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reinicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CerrarBoton)
                    .addComponent(UnidadesLabel)
                    .addComponent(VentasLabel)
                    .addComponent(Reinicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarBotonActionPerformed
        Cerrar();
    }//GEN-LAST:event_CerrarBotonActionPerformed

    private void ReinicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinicarActionPerformed
        RestablecerValores();
    }//GEN-LAST:event_ReinicarActionPerformed

    private void UnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadesActionPerformed
        try { int text = Integer.valueOf(Unidades.getText());}
        catch (Exception e) { Unidades.setText("0"); }
    }//GEN-LAST:event_UnidadesActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        try { int text = Integer.valueOf(Unidades.getText());}
        catch (Exception e) { Unidades.setText("1"); }
    }//GEN-LAST:event_VentasActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        int unidades = 0, ventas = 0;
        
        try { unidades = Integer.valueOf(Unidades.getText()); }
        catch (Exception e) {
            System.out.println("Error al acceder unidades \n" + e);
            showMessageDialog(null, "Error al acceder uniades", "Error", ERROR_MESSAGE);
            Unidades.setText("0");
            return;
        }
        
        try { ventas = Integer.valueOf(Ventas.getText()); }
        catch (Exception e) {
            System.out.println("Error al acceder ventas \n" + e);
            showMessageDialog(null, "Error al acceder ventas", "Error", ERROR_MESSAGE);
            Ventas.setText("1");
            return;
        }
        
        
        TextoPrincipal.selectAll();
        TextoPrincipal.replaceSelection(null);
        
        if (ventas == 0){
            System.out.println("ventas es igual a 0 en CalcularActionPerformed");
            showMessageDialog(null, "No se pudo dividir entre cero, por favor no ponga 0 unidades vendidas", "Error", ERROR_MESSAGE);
            return;
        }
        
        double dias = (double)unidades / ventas;
        int diasEnteros = (int)(dias);
        
        String texto = "Este producto se acabará ";
        //<editor-fold defaultstate="collapsed" desc="dias en los que se acabaran las unidades">
        if (unidades < ventas){
            texto += "antes de que termine el día";
            TextoPrincipal.insert(texto, 0);
            return;
        } else {
            if (diasEnteros == 1){
                texto += "hoy";
            } else if (diasEnteros == 2) {
                texto += "mañana";
            } else {
                texto += "en " + diasEnteros + " dias";
            }
        }
        texto += "\n\n";
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="cuantas veces a la semana se necesita">
        if (dias > 7){
            texto += "Este producto se mantendrá en existencia esta semana, con " + (unidades - (ventas * 7)) + " unidad(es) de sobra";
        } else if (dias == 7){
            texto +="Este producto se mantendrá en existencia esta semana pero necesitará reabastecerse cuando termine la semana";
        } else {
            double porSemana = (double)7 / dias;
            
            // 2025 Mar 17: No me acuerdo si hay una funcion para redondear para arriba
            int porSemanaEntero = (int)porSemana;
            if ((double)porSemanaEntero < porSemana) {
                porSemanaEntero++;
                
                int unidadesDeSobra = (int)( (porSemana * unidades) - ((porSemanaEntero - 1) * unidades) );
                texto += "Se necesitará rebastecer " + porSemanaEntero + " veces a la semana, pero sobrarán " + unidadesDeSobra + " unidad(es)";
                if (unidadesDeSobra < 0) texto += "guh";
            } else {
                texto += "Se necesitará rebastecer " + porSemanaEntero + " veces a la semana";
            }
        }
        texto += "\n\n";
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="al mes">
        texto += "Asumiendo meses de 30 dias,\n";
        if (dias > 30){
            texto += "este producto se mantendrá en existencia hasta el fin de mes,\n"
                    + "con " + (unidades - (ventas * 30)) + " unidad(es) de sobra";
        } else if (dias == 30){
            texto +="este producto se mantendrá en existencia hasta el fin de mes\n"
                    + "pero necesitará reabastecerse cuando termine el mes";
        } else {
            double porMes = (double)30 / dias;
            
            // 2025 Mar 17: No me acuerdo si hay una funcion para redondear para arriba
            int porMesEntero = (int)porMes;
            if ((double)porMesEntero < porMes) {
                porMesEntero++;
                
                int unidadesDeSobra = (int)(( (porMesEntero - 1) * ventas) - unidades );
                texto += "Se necesitará rebastecer " + porMesEntero + " veces al mes, pero sobrarán " + unidadesDeSobra + " unidad(es)";
            } else {
                texto += "Se necesitará rebastecer " + porMesEntero + " veces al mes";
            }
        }
        texto += "\n\n";
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="al año">
        texto += "Asumiendo que el año no es bisiesto (365 días) \n";
        if (dias > 365){
            texto += "este producto se mantendrá en existencia hasta el fin del año,\n"
                    + "con " + (unidades - (ventas * 365)) + " unidad(es) de sobra";
        } else if (dias == 365){
            texto +="este producto se mantendrá en existencia hasta el fin del año\n"
                    + "pero necesitará reabastecerse cuando termine el año";
        } else {
            double porAgno = (double)365 / dias;
            
            // 2025 Mar 17: No me acuerdo si hay una funcion para redondear para arriba
            int porAgnoEntero = (int)porAgno;
            if ((double)porAgnoEntero < porAgno) {
                porAgnoEntero++;
                
                int unidadesDeSobra = (int)((porAgnoEntero * ventas) - unidades );
                texto += "Se necesitará rebastecer " + porAgnoEntero + " veces al año, pero sobrarán " + unidadesDeSobra + " unidad(es)";
            } else {
                texto += "Se necesitará rebastecer " + porAgnoEntero + " veces al año";
            }
        }
        texto += "\n\n";
        //</editor-fold>
        
        TextoPrincipal.insert(texto, 0);
    }//GEN-LAST:event_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CalcularReStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularReStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularReStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularReStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularReStocks().setVisible(true);
            }
        });
    }
    
    private void Cerrar(){
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton CerrarBoton;
    private javax.swing.JButton Reinicar;
    private javax.swing.JTextArea TextoPrincipal;
    private javax.swing.JTextField Unidades;
    private javax.swing.JLabel UnidadesLabel;
    private javax.swing.JTextField Ventas;
    private javax.swing.JLabel VentasLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
