/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Excepciones.ValidarCedula;
import controlador.ControladorEmpresa;
import controlador.ControladorPersona;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Directivo;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author Cristian
 */
public class VistaPersona extends javax.swing.JInternalFrame {

    public ControladorPersona controladorPersona;
    public ControladorEmpresa controladorEmpresa;
    public DefaultTableModel tblModeloPersona;
    public Class tipo;
    public VistaPersona(ControladorEmpresa controladorEmpresa, ControladorPersona controladorPersona, Class tipo) {
        initComponents();
        this.controladorEmpresa = controladorEmpresa;
        this.controladorPersona = controladorPersona;
        this.tipo = tipo;
        tblModeloPersona = (DefaultTableModel) tblPersona.getModel();
        tblPersona.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if(tblPersona.getSelectedRow() >=0){
                    String cedula =tblPersona.getModel().getValueAt(tblPersona.getSelectedRow(), 3).toString();
                    controladorPersona.setSeleccionado(controladorPersona.buscar(cedula));
                        mostrarDatos();
                }else{
                    limpiarDatos();
                }
            }
        });
        cargarDatos();
        ocultarComponentes();
    }
    public void ocultarComponentes(){
        if(tipo == Cliente.class){
            lblSueldo.setVisible(false);
            lblCategoria.setVisible(false);
            txtSueldo.setVisible(false);
            txtCategoria.setVisible(false);
        }else if(tipo == Empleado.class){
            txtTelefono.setVisible(false);
            lblTelefono.setVisible(false);
            lblCategoria.setVisible(false);
            txtCategoria.setVisible(false);
        }else if(tipo == Directivo.class){
            txtTelefono.setVisible(false);
            lblTelefono.setVisible(false);
        }
    }
    public void limpiarDatos(){
        txtApellido.setText("");
        txtNombre.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCategoria.setText("");
        txtSueldo.setText("");
        controladorPersona.setSeleccionado(null);
    }
    public void mostrarDatos(){
        txtNombre.setText(controladorPersona.getSeleccionado().getNombre());
        txtApellido.setText(controladorPersona.getSeleccionado().getApellido());
        txtCedula.setText(controladorPersona.getSeleccionado().getCedula());
        txtDireccion.setText(controladorPersona.getSeleccionado().getDireccion());
        if(tipo == Cliente.class){
            txtTelefono.setText(((Cliente)controladorPersona.getSeleccionado()).getTelefono());
        }else if(tipo == Empleado.class){
            txtSueldo.setText(""+((Empleado)controladorPersona.getSeleccionado()).getSueldoButro());
        }else if(tipo == Directivo.class){
            txtSueldo.setText(""+((Directivo)controladorPersona.getSeleccionado()).getSueldoButro());
            txtCategoria.setText(""+((Directivo)controladorPersona.getSeleccionado()).getCategoria());
        }
    }
    public void cargarDatos(){
        tblModeloPersona.setRowCount(0);
        for (Object objeto : controladorPersona.getListaPersona()) {
            if(objeto.getClass().equals(tipo)){
                Persona persona = (Persona) objeto;
                String datos[] = {String.valueOf(persona.getId()), persona.getNombre(), persona.getApellido(), persona.getCedula(), persona.getDireccion()};
                tblModeloPersona.addRow(datos);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        lblCategoria = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtCedula = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Personal");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblCedula.setText("Cedula");

        lblDireccion.setText("Direccion");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Cedula", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(tblPersona);

        lblCategoria.setText("Categoria");

        lblSueldo.setText("Sueldo");

        lblTelefono.setText("Telefono");

        txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSueldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoria))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula)))
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnGuardar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(11, 11, 11)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCategoria)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSueldo)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Persona persona = controladorPersona.getSeleccionado();
        controladorPersona.eliminar(persona.getCedula());
        cargarDatos();
        limpiarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(tipo == Cliente.class){
            if(controladorPersona.getSeleccionado() == null)
                try { //este me salio por crear la excepcion en el controlador
                    controladorPersona.crearCliente(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), txtTelefono.getText());
            } catch (ValidarCedula ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            else
                controladorPersona.actualizarCliente(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), txtTelefono.getText());
        }else if(tipo == Empleado.class){
            if(controladorPersona.getSeleccionado() == null){
                try{
                    //double sueldoBruto= Double.parseDouble(txtSueldo.getText())/0;  //ahora con infinitos el catcjh
                   // System.out.println(controladorPersona.getSeleccionado().getApellido()); //este para el null pointer exception
                    controladorPersona.crearEmpleado(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), Double.parseDouble(txtSueldo.getText()));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numerico en Sueldo");
                }catch(ArithmeticException ed){
                    JOptionPane.showConfirmDialog(this, "Oye no hay divisiones para 0");
                }catch(NullPointerException eb){
                     JOptionPane.showConfirmDialog(this, "Oye no hay empresa para seleccionarlo");
                } catch (ValidarCedula ex) { //excepcion propia
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }else
                controladorPersona.actualizarEmpleador(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), Double.parseDouble(txtSueldo.getText()));
        }else if(tipo == Directivo.class){
            if(controladorPersona.getSeleccionado() == null)
                try {
                    controladorPersona.crearDirectivo(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), Double.parseDouble(txtSueldo.getText()), txtCategoria.getText());
            } catch (ValidarCedula ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            else
                controladorPersona.actualizarDirectivo(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), Double.parseDouble(txtSueldo.getText()), txtCategoria.getText());
        }
        cargarDatos();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
