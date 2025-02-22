/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.vista;

import Comercial.datos.MarcaDAO;
import Comercial.datos.Conexion;
import Comercial.dominio.Marca;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import Comercial.datos.Conexion;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SipaqueRitaMaria
 */
public class Mantenimiento_Marca extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Marca
     */
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        MarcaDAO marcaDAO = new MarcaDAO();

        List<Marca> marca = marcaDAO.select();

        Tbl_Datos.setModel(modelo);
        String[] dato = new String[3];
        for (int i = 0; i < marca.size(); i++) {
            dato[0] = marca.get(i).getPK_codigo_Marca();
            dato[1] = marca.get(i).getNombre_Marca();
            dato[2] = marca.get(i).getEstatus_Marca();
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscar() {
        Marca marcaAConsultar = new Marca();
        MarcaDAO proveedorDAO = new MarcaDAO();
        marcaAConsultar.setPK_codigo_Marca(Txt_codigo.getText());
        marcaAConsultar = proveedorDAO.query(marcaAConsultar);

        Txt_nombre.setText(marcaAConsultar.getNombre_Marca());
        Txt_estado.setText(marcaAConsultar.getEstatus_Marca());

    }

    public void limpiar() {
        Txt_codigo.setText("");
        Txt_nombre.setText("");
        Txt_estado.setText("");

    }

    public Mantenimiento_Marca() {
        initComponents();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_detalle = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Datos = new javax.swing.JTable();
        Btn_Ayuda = new javax.swing.JButton();
        Lbl_titulo = new javax.swing.JLabel();
        Pnl_datos = new javax.swing.JPanel();
        Lbl_codigo = new javax.swing.JLabel();
        Txt_codigo = new javax.swing.JTextField();
        Lbl_nombre = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();
        Lbl_estado = new javax.swing.JLabel();
        Txt_estado = new javax.swing.JTextField();
        Btn_Reporte = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Modifcar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        Pnl_detalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Marca"));

        Tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tbl_Datos);

        javax.swing.GroupLayout Pnl_detalleLayout = new javax.swing.GroupLayout(Pnl_detalle);
        Pnl_detalle.setLayout(Pnl_detalleLayout);
        Pnl_detalleLayout.setHorizontalGroup(
            Pnl_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_detalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pnl_detalleLayout.setVerticalGroup(
            Pnl_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_detalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Btn_Ayuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Ayuda.setText("Ayuda");
        Btn_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AyudaActionPerformed(evt);
            }
        });

        Lbl_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lbl_titulo.setText("Mantenimiento Marcas");

        Pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca"));

        Lbl_codigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_codigo.setText("Codigo Marca:");

        Lbl_nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_nombre.setText("Nombre Marca:");

        Lbl_estado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_estado.setText("Estado Marca:");

        Btn_Reporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Reporte.setText("Reporte");
        Btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReporteActionPerformed(evt);
            }
        });

        Btn_Guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Modifcar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Modifcar.setText("Modificar");
        Btn_Modifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModifcarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Btn_Buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_datosLayout = new javax.swing.GroupLayout(Pnl_datos);
        Pnl_datos.setLayout(Pnl_datosLayout);
        Pnl_datosLayout.setHorizontalGroup(
            Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_datosLayout.createSequentialGroup()
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_datosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Modifcar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_datosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_nombre)
                            .addComponent(Lbl_codigo))
                        .addGap(18, 18, 18)
                        .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(Txt_codigo)))
                    .addGroup(Pnl_datosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Lbl_estado)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        Pnl_datosLayout.setVerticalGroup(
            Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_datosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_codigo)
                    .addComponent(Txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_nombre)
                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_estado))
                .addGap(47, 47, 47)
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Modifcar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(Lbl_titulo)
                        .addGap(65, 65, 65)
                        .addComponent(Btn_Ayuda))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pnl_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Lbl_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Ayuda)
                        .addGap(18, 18, 18)))
                .addComponent(Pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pnl_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AyudaActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\AyudaMantemientoMarca.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\AyudaMantemientoMarca.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_Btn_AyudaActionPerformed
    private Connection connection = null;
    private void Btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReporteActionPerformed
        // TODO add your handling code here:
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Comercial/reportes/marca.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte Mantenimiento marca");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_Btn_ReporteActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        // TODO add your handling code here:
        MarcaDAO marcaDAO = new MarcaDAO();
        Marca marcaAInsertar = new Marca();
        marcaAInsertar.setPK_codigo_Marca(Txt_codigo.getText());
        marcaAInsertar.setNombre_Marca(Txt_nombre.getText());
        marcaAInsertar.setEstatus_Marca(Txt_estado.getText());
        marcaDAO.insert(marcaAInsertar);

        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_ModifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModifcarActionPerformed
        // TODO add your handling code here:
        MarcaDAO marcaDAO = new MarcaDAO();
        Marca marcaAActualizar = new Marca();
        marcaAActualizar.setPK_codigo_Marca(Txt_codigo.getText());
        marcaAActualizar.setNombre_Marca(Txt_nombre.getText());
        marcaAActualizar.setEstatus_Marca(Txt_estado.getText());

        marcaDAO.update(marcaAActualizar);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa.");
        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_ModifcarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        // TODO add your handling code here:
        MarcaDAO marcaDAO = new MarcaDAO();
        Marca marcaAEliminar = new Marca();
        marcaAEliminar.setPK_codigo_Marca(Txt_codigo.getText());
        marcaDAO.delete(marcaAEliminar);
        JOptionPane.showMessageDialog(null, "Registro Eliminado.");
        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_Btn_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Ayuda;
    public javax.swing.JButton Btn_Buscar;
    public javax.swing.JButton Btn_Eliminar;
    public javax.swing.JButton Btn_Guardar;
    public javax.swing.JButton Btn_Modifcar;
    public javax.swing.JButton Btn_Reporte;
    private javax.swing.JLabel Lbl_codigo;
    private javax.swing.JLabel Lbl_estado;
    private javax.swing.JLabel Lbl_nombre;
    private javax.swing.JLabel Lbl_titulo;
    private javax.swing.JPanel Pnl_datos;
    private javax.swing.JPanel Pnl_detalle;
    private javax.swing.JTable Tbl_Datos;
    public javax.swing.JTextField Txt_codigo;
    public javax.swing.JTextField Txt_estado;
    public javax.swing.JTextField Txt_nombre;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
