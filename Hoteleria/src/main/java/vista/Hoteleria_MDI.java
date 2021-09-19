/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import dominio.ProcesosRepetidos;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author Herbert Leonel Dominguez Chavez
 */
public class Hoteleria_MDI extends javax.swing.JFrame {

    private Mnt_Servicios form_Mant_Servicios;
    private Mnt_MetodoDePago form_Mnt_MetodoDePago;

    ProcesosRepetidos prcs_repetidos = new ProcesosRepetidos();
    public static JLabel Jl_logo = new JLabel();

    /**
     * Creates new form Hoteleria_MDI
     */
    public Hoteleria_MDI() {
        initComponents();
        Diseño();
    }

    public void Diseño() {
        setTitle("USUARIOS:[PRUEBAS] FECHA:[" + prcs_repetidos.getFecha() + "]");
        Jdp_contenedor.setBackground(new Color(228, 68, 68));
        prcs_repetidos.Cursor(Mnb_menu);
        ImageIcon icono = new ImageIcon("src/main/java/assets/hotel.png");
        this.setIconImage(icono.getImage());
        logo();
        Jdp_contenedor.add(Jl_logo);
    }

    public void logo() {
        ImageIcon icon = new ImageIcon("src/main/java/assets/logo_hotel.png");
        Jl_logo.setSize(300, 300);
        if (icon != null) {
            Jl_logo.setIcon(icon);
        } else {
            //No existe imagen.
        }
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = Jl_logo.getSize();
        Jl_logo.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jdp_contenedor = new javax.swing.JDesktopPane();
        Mnb_menu = new javax.swing.JMenuBar();
        Sbm_archivos = new javax.swing.JMenu();
        Sbm_catalogo = new javax.swing.JMenu();
        Mnu_mantenimientos = new javax.swing.JMenu();
        MnI_servicios = new javax.swing.JMenuItem();
        MnI_metodoDePago = new javax.swing.JMenuItem();
        Sbm_procesos = new javax.swing.JMenu();
        Sbm_herramientas = new javax.swing.JMenu();
        Sbm_ayuda = new javax.swing.JMenu();
        Btn_cerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout Jdp_contenedorLayout = new javax.swing.GroupLayout(Jdp_contenedor);
        Jdp_contenedor.setLayout(Jdp_contenedorLayout);
        Jdp_contenedorLayout.setHorizontalGroup(
            Jdp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        Jdp_contenedorLayout.setVerticalGroup(
            Jdp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        Sbm_archivos.setText("Archivos");
        Sbm_archivos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_archivos);

        Sbm_catalogo.setText("Catalogo");
        Sbm_catalogo.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        Mnu_mantenimientos.setText("Mantenimientos");

        MnI_servicios.setText("Mant. Servicios");
        MnI_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_serviciosActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_servicios);

        MnI_metodoDePago.setText("Mant. Metodos de Pago");
        MnI_metodoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_metodoDePagoActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_metodoDePago);

        Sbm_catalogo.add(Mnu_mantenimientos);

        Mnb_menu.add(Sbm_catalogo);

        Sbm_procesos.setText("Procesos");
        Sbm_procesos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_procesos);

        Sbm_herramientas.setText("Herramientas");
        Sbm_herramientas.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_herramientas);

        Sbm_ayuda.setText("Ayuda");
        Sbm_ayuda.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_ayuda);

        Btn_cerrarSesion.setText("Cerrar Sesión");
        Btn_cerrarSesion.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Btn_cerrarSesion);

        setJMenuBar(Mnb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdp_contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdp_contenedor)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        logo();
    }//GEN-LAST:event_formComponentResized

    private void MnI_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_serviciosActionPerformed
        form_Mant_Servicios = new Mnt_Servicios();

        Jdp_contenedor.add(form_Mant_Servicios);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Servicios.getSize();
        form_Mant_Servicios.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Servicios.setVisible(true);
        form_Mant_Servicios.toFront();
    }//GEN-LAST:event_MnI_serviciosActionPerformed

    private void MnI_metodoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_metodoDePagoActionPerformed
        form_Mnt_MetodoDePago = new Mnt_MetodoDePago();

        Jdp_contenedor.add(form_Mnt_MetodoDePago);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mnt_MetodoDePago.getSize();
        form_Mnt_MetodoDePago.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mnt_MetodoDePago.setVisible(true);
        form_Mnt_MetodoDePago.toFront();
    }//GEN-LAST:event_MnI_metodoDePagoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoteleria_MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Btn_cerrarSesion;
    private javax.swing.JDesktopPane Jdp_contenedor;
    private javax.swing.JMenuItem MnI_metodoDePago;
    private javax.swing.JMenuItem MnI_servicios;
    private javax.swing.JMenuBar Mnb_menu;
    private javax.swing.JMenu Mnu_mantenimientos;
    private javax.swing.JMenu Sbm_archivos;
    private javax.swing.JMenu Sbm_ayuda;
    private javax.swing.JMenu Sbm_catalogo;
    private javax.swing.JMenu Sbm_herramientas;
    private javax.swing.JMenu Sbm_procesos;
    // End of variables declaration//GEN-END:variables
}
