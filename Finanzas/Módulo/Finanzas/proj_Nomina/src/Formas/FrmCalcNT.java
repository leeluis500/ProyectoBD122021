/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTOPHER
 */
public class FrmCalcNT extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCalcNT
     */
    public FrmCalcNT() {
        initComponents();
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
        TxtCodNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtIT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtSL = new javax.swing.JTextField();
        BtnCalc = new javax.swing.JButton();
        BtnAlm = new javax.swing.JButton();
        TxtSB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setTitle("Calcular Total Nomina");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nómina Empleado:");

        TxtCodNom.setEditable(false);
        TxtCodNom.setBackground(new java.awt.Color(51, 51, 51));
        TxtCodNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtCodNom.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresos Totales:");

        TxtIT.setEditable(false);
        TxtIT.setBackground(new java.awt.Color(51, 51, 51));
        TxtIT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtIT.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descuentos Totales:");

        TxtDT.setEditable(false);
        TxtDT.setBackground(new java.awt.Color(51, 51, 51));
        TxtDT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtDT.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sueldo Líquido:");

        TxtSL.setEditable(false);
        TxtSL.setBackground(new java.awt.Color(51, 51, 51));
        TxtSL.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtSL.setForeground(new java.awt.Color(255, 255, 255));

        BtnCalc.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnCalc.setText("Calcular");
        BtnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcActionPerformed(evt);
            }
        });

        BtnAlm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnAlm.setText("Almacenar");
        BtnAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlmActionPerformed(evt);
            }
        });

        TxtSB.setEditable(false);
        TxtSB.setBackground(new java.awt.Color(51, 51, 51));
        TxtSB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtSB.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sueldo Base:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnCalc)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtCodNom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtIT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(BtnAlm)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCodNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TxtIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAlm)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    /*FORMULARIO CALCULAR NOMINA TOTALES 
    POR: CRISTOPHER JOEL
    FECHA: 11 DE MAYO DE 2020*/
    private void BtnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcActionPerformed
        try
        {
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            String sql1="SELECT sum(valor_concepto) FROM detalle_nomina\n" +
            "INNER JOIN nomina_empleado on nomina_empleado.id_nomEmp = detalle_nomina.fk_nominae\n" +
            "INNER JOIN concepto ON concepto.id_concepto = detalle_nomina.fk_concepto\n" +
            "WHERE concepto.efecto_concepto='Ingreso' AND nomina_empleado.id_nomEmp=?";
            PreparedStatement pst1 = cn.prepareStatement(sql1);
            pst1.setString(1, TxtCodNom.getText().trim());
            ResultSet rs1 = pst1.executeQuery();
            while(rs1.next()){
               TxtIT.setText(rs1.getString("sum(valor_concepto)"));
           }
            String sql2="SELECT sum(valor_concepto) FROM detalle_nomina\n" +
            "INNER JOIN nomina_empleado on nomina_empleado.id_nomEmp = detalle_nomina.fk_nominae\n" +
            "INNER JOIN concepto ON concepto.id_concepto = detalle_nomina.fk_concepto\n" +
            "WHERE concepto.efecto_concepto='Descuento' AND nomina_empleado.id_nomEmp=?";
            PreparedStatement pst2 = cn.prepareStatement(sql2);
            pst2.setString(1, TxtCodNom.getText().trim());
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
               TxtDT.setText(rs2.getString("sum(valor_concepto)"));
           }
            double sb, it, dt, sl;
            sb=Double.parseDouble(TxtSB.getText());
            it=Double.parseDouble(TxtIT.getText());
            dt=Double.parseDouble(TxtDT.getText());
            sl=(sb+it)-dt;
            TxtSL.setText(String.valueOf(sl));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BtnCalcActionPerformed

    private void BtnAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlmActionPerformed
        try
        {
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into impresion_nomina values(?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, TxtCodNom.getText().trim());
            pst.setString(3, TxtIT.getText().trim());
            pst.setString(4, TxtDT.getText().trim());
            pst.setString(5, TxtSL.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Realizado!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnAlmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlm;
    private javax.swing.JButton BtnCalc;
    public static javax.swing.JTextField TxtCodNom;
    private javax.swing.JTextField TxtDT;
    private javax.swing.JTextField TxtIT;
    public static javax.swing.JTextField TxtSB;
    private javax.swing.JTextField TxtSL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
