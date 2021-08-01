/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Archivos.ArchivoPersona;
import Archivos.ArchivoRegistro;
import Archivos.ArchivoVehiculo;
import Controladores.ControladorPersona;
import Controladores.ControladorRegistro;
import Controladores.ControladorVehiculo;

/**
 *
 * @author Cristian
 */
public class Principal extends javax.swing.JFrame {
    private ControladorPersona controladorPersona;
    private ControladorRegistro controladorRegistro;
    private ControladorVehiculo controladorVehiculo;
    private DirectivoVista directivoVista;
    private ArchivoPersona archivoPersona;
    private ArchivoRegistro archivoRegistro;
    private ArchivoVehiculo archivoVehiculo;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        controladorPersona=new ControladorPersona();
        controladorRegistro=new ControladorRegistro();
        controladorVehiculo=new ControladorVehiculo();
        directivoVista= new DirectivoVista();
        archivoPersona=new ArchivoPersona("D:\\ProyectoFinal\\src\\Archivos\\ArchivoPersona.obj");
        archivoRegistro=new ArchivoRegistro("D:\\ProyectoFinal\\src\\Archivos\\ArchivoRegistro.obj");
        archivoVehiculo=new ArchivoVehiculo("D:\\ProyectoFinal\\src\\Archivos\\ArchivoVehiculo.obj");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dtPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniClientes = new javax.swing.JMenuItem();
        mniDirectivo = new javax.swing.JMenuItem();
        mncVehiculos = new javax.swing.JMenu();
        mniGestion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniRegistro = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dtPaneLayout = new javax.swing.GroupLayout(dtPane);
        dtPane.setLayout(dtPaneLayout);
        dtPaneLayout.setHorizontalGroup(
            dtPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        dtPaneLayout.setVerticalGroup(
            dtPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jMenu1.setText("Personas");

        mniClientes.setText("Clientes");
        mniClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClientesActionPerformed(evt);
            }
        });
        jMenu1.add(mniClientes);

        mniDirectivo.setText("Directivo");
        mniDirectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDirectivoActionPerformed(evt);
            }
        });
        jMenu1.add(mniDirectivo);

        jMenuBar1.add(jMenu1);

        mncVehiculos.setText("Vehiculos");

        mniGestion.setText("Gestion");
        mniGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGestionActionPerformed(evt);
            }
        });
        mncVehiculos.add(mniGestion);

        jMenuBar1.add(mncVehiculos);

        jMenu3.setText("Parqueos");

        mniRegistro.setText("Registro");
        mniRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistroActionPerformed(evt);
            }
        });
        jMenu3.add(mniRegistro);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClientesActionPerformed
        // TODO add your handling code here:
        ClienteVista cliente=new ClienteVista(controladorPersona,archivoPersona);
        dtPane.add(cliente);
        cliente.show();
    }//GEN-LAST:event_mniClientesActionPerformed

    private void mniGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGestionActionPerformed
        // TODO add your handling code here:
        VehiculoVista vehiculo=new VehiculoVista(controladorVehiculo, controladorPersona, archivoVehiculo);
        dtPane.add(vehiculo);
        vehiculo.show();
    }//GEN-LAST:event_mniGestionActionPerformed

    private void mniRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistroActionPerformed
        // TODO add your handling code here:
        RegistroVista registro=new RegistroVista(controladorVehiculo , controladorRegistro,directivoVista);
        dtPane.add(registro);
        registro.show();
    }//GEN-LAST:event_mniRegistroActionPerformed

    private void mniDirectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDirectivoActionPerformed
        // TODO add your handling code here:
        DirectivoVista directivo=this.directivoVista;
        dtPane.add(directivo);
        directivo.show();
    }//GEN-LAST:event_mniDirectivoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dtPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mncVehiculos;
    private javax.swing.JMenuItem mniClientes;
    private javax.swing.JMenuItem mniDirectivo;
    private javax.swing.JMenuItem mniGestion;
    private javax.swing.JMenuItem mniRegistro;
    // End of variables declaration//GEN-END:variables
}