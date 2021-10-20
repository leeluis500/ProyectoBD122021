/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MOISES
 */

/*MANTENIMIENTO DE EMPLEADOS
    POR: MOISÉS FELIPE
    FECHA: 6 DE ABRIL DE 2020*/

public class FrmMantEmp extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMantEmp
     */
    private void CargarPuestos(){
        TextAutoCompleter txtPuestos = new TextAutoCompleter(txtPuesto);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            Statement sent = con.createStatement();
            ResultSet rs = sent.executeQuery("SELECT nombre_puesto FROM puesto");
            while(rs.next()){
                txtPuestos.addItem(rs.getString("nombre_puesto"));
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    private void CargarDeptos(){
        TextAutoCompleter txtPuestos = new TextAutoCompleter(txtDepto);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            Statement sent = con.createStatement();
            ResultSet rs = sent.executeQuery("SELECT nombre_departamento FROM departamento");
            while(rs.next()){
                txtPuestos.addItem(rs.getString("nombre_departamento"));
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    public FrmMantEmp() {
        initComponents();
        CargarPuestos();
        CargarDeptos();
        txtFNac.setForeground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCarnetEmp = new javax.swing.JTextField();
        txtDPIEmp = new javax.swing.JTextField();
        txtNomEmp = new javax.swing.JTextField();
        txtApeEmp = new javax.swing.JTextField();
        txtDomEmp = new javax.swing.JTextField();
        txtTelEmp = new javax.swing.JTextField();
        txtCelEmp = new javax.swing.JTextField();
        txtEstatusEmp = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        txtDepto = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtBuscaxCarnet = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBuscaxDPI = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        btnGenCod = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtSBase = new javax.swing.JTextField();
        txtFNac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setTitle("Mantenimiento Empleados");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANTENIMIENTO EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carnet Empleado:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DPI Empleado:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Empleado:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos Empleado:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Domicilio Empleado:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono Empleado:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Célular Empleado:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Nacimiento:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estatus Empleado:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Puesto:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Departamento:");

        txtCarnetEmp.setEditable(false);
        txtCarnetEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDPIEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNomEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtApeEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDomEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtTelEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtCelEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtEstatusEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtPuesto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnAlta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAlta.setText("Alta");
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBaja.setText("Baja");
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnCambio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCambio.setText("Cambio");
        btnCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Carnet Empleado:");

        txtBuscaxCarnet.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DPI Empleado:");

        txtBuscaxDPI.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("BUSQUEDA");

        btnBusca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        btnGenCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGenCod.setText("Generar Carnet");
        btnGenCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCodActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sueldo Base:");

        txtSBase.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtFNac.setBackground(new java.awt.Color(255, 255, 255));
        txtFNac.setForeground(new java.awt.Color(255, 255, 255));
        txtFNac.setDateFormatString("dd/MM/yyyy");
        txtFNac.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFNac.setMaxSelectableDate(new java.util.Date(253370790083000L));
        txtFNac.setMinSelectableDate(new java.util.Date(-62135744317000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(txtNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(50, 50, 50)
                                .addComponent(txtApeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(61, 61, 61)
                                .addComponent(txtCelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)
                                .addComponent(txtDomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(51, 51, 51)
                                .addComponent(txtTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscaxCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(36, 36, 36)
                                .addComponent(txtBuscaxDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(80, 80, 80)
                                .addComponent(txtDPIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addComponent(txtCarnetEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenCod))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSBase, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtPuesto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDepto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstatusEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFNac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCarnetEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDPIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(txtFNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEstatusEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtBuscaxCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtBuscaxDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja)
                    .addComponent(btnCambio))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCodActionPerformed
        ObtenerInicialesN(txtNomEmp.getText());
        ObtenerInicialesA(txtApeEmp.getText());
        ObtenerDigitosDPI(txtDPIEmp.getText());
        txtCarnetEmp.setText(iNombre.toUpperCase()+iApellido.toUpperCase()+iDPI);
    }//GEN-LAST:event_btnGenCodActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
         try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("delete from empleado where carnet_empleado = ?");
            
            pst.setString(1, txtBuscaxCarnet.getText().trim());
            pst.executeUpdate();
            
            txtApeEmp.setText("");
            txtCarnetEmp.setText("");
            txtCelEmp.setText("");
            txtDPIEmp.setText("");
            txtDepto.setText("");
            txtDomEmp.setText("");
            txtEstatusEmp.setText("");
            txtNomEmp.setText("");
            txtPuesto.setText("");
            txtTelEmp.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }    
    }//GEN-LAST:event_btnBajaActionPerformed
    String id_Puesto="";
    private void buscarIDPuesto(String nombrePuesto){
        try
        {
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) cn.prepareStatement("select id_puesto from puesto where nombre_puesto = ?");
            pst.setString(1, txtPuesto.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                id_Puesto = rs.getString("id_puesto");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    String id_Depto="";
    private void buscarIDDepto(String nombreDepto){
        try
        {
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) cn.prepareStatement("select id_departamento from departamento where nombre_departamento = ?");
            pst.setString(1, txtDepto.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                id_Depto = rs.getString("id_departamento");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        buscarIDPuesto(txtPuesto.getText());
        buscarIDDepto(txtDepto.getText());
        Date fecha;
        fecha = txtFNac.getDate();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("insert into empleado values(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, txtCarnetEmp.getText().trim());
            pst.setString(2, txtDPIEmp.getText().trim());
            pst.setString(3, txtNomEmp.getText().trim());
            pst.setString(4, txtApeEmp.getText().trim());
            pst.setString(5, txtDomEmp.getText().trim());
            pst.setString(6, txtTelEmp.getText().trim());
            pst.setString(7, txtCelEmp.getText().trim());
            pst.setString(8, dt1.format(fecha));
            pst.setString(9, txtEstatusEmp.getText().trim());
            pst.setString(10, id_Puesto);
            pst.setString(11, id_Depto);
            pst.setString(12, txtSBase.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Realizado!");
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            JOptionPane.showMessageDialog(null, dt1.format(fecha));
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed
    String iNombre=""; String iApellido="";
    private void ObtenerInicialesN(String nombre){
        int i=0, x=0, longitud=0;
        char ch;
        String inic="";
        longitud = nombre.length();
        x=longitud-1;
        for(i=0; i<=x; i++)
        {
            ch=nombre.charAt(i);
            if(i==0)
            {
                inic=inic+ch;
            }
            if(ch==' ')
            {
                ch = nombre.charAt(i+1);
                inic=inic+ch;
                
            }
        }
        iNombre+=inic;
    }
    private void ObtenerInicialesA(String apellido){
        int i=0, x=0, longitud=0;
        char ch;
        String inic="";
        longitud = apellido.length();
        x=longitud-1;
        for(i=0; i<=x; i++)
        {
            ch=apellido.charAt(i);
            if(i==0)
            {
                inic=inic+ch;
            }
            if(ch==' ')
            {
                ch = apellido.charAt(i+1);
                inic=inic+ch;
                
            }
        }
        iApellido+=inic;
    }
    String iDPI="";
    private void ObtenerDigitosDPI(String dpi){
        for(int i=0; i<4; i++){
            iDPI+=dpi.charAt(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnGenCod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApeEmp;
    private javax.swing.JTextField txtBuscaxCarnet;
    private javax.swing.JTextField txtBuscaxDPI;
    private javax.swing.JTextField txtCarnetEmp;
    private javax.swing.JTextField txtCelEmp;
    private javax.swing.JTextField txtDPIEmp;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtDomEmp;
    private javax.swing.JTextField txtEstatusEmp;
    private com.toedter.calendar.JDateChooser txtFNac;
    private javax.swing.JTextField txtNomEmp;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSBase;
    private javax.swing.JTextField txtTelEmp;
    // End of variables declaration//GEN-END:variables
}
