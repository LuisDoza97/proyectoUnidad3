/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author Admin
 */
public class MenuPilaEstatica extends javax.swing.JFrame {

    /**
     * Creates new form MenuPilaEstatica
     */
    public MenuPilaEstatica() {
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

        MenuBarPilasEstaticas = new javax.swing.JMenuBar();
        SubmenuInsertar = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        SubmenuMostrar = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        SubmenuEliminar = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        SubmenuBuscar = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        Regresar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SubmenuInsertar.setText("INERTAR");
        SubmenuInsertar.add(jMenu6);
        SubmenuInsertar.add(jMenu7);

        MenuBarPilasEstaticas.add(SubmenuInsertar);

        SubmenuMostrar.setText("MOSTRAR");
        SubmenuMostrar.add(jMenu23);
        SubmenuMostrar.add(jMenu27);

        MenuBarPilasEstaticas.add(SubmenuMostrar);

        SubmenuEliminar.setText("ELIMINAR");
        SubmenuEliminar.add(jMenu8);
        SubmenuEliminar.add(jMenu9);

        MenuBarPilasEstaticas.add(SubmenuEliminar);

        SubmenuBuscar.setText("BUSCAR");
        SubmenuBuscar.add(jMenu11);
        SubmenuBuscar.add(jMenu15);

        MenuBarPilasEstaticas.add(SubmenuBuscar);

        Regresar.setText("REGRESAR");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        MenuBarPilasEstaticas.add(Regresar);

        setJMenuBar(MenuBarPilasEstaticas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        // TODO add your handling code here:
        VentanaPrincipal objetoPER = new VentanaPrincipal();        
        objetoPER.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPilaEstatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPilaEstatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPilaEstatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPilaEstatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPilaEstatica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarPilasEstaticas;
    private javax.swing.JMenu Regresar;
    private javax.swing.JMenu SubmenuBuscar;
    private javax.swing.JMenu SubmenuEliminar;
    private javax.swing.JMenu SubmenuInsertar;
    private javax.swing.JMenu SubmenuMostrar;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    // End of variables declaration//GEN-END:variables
}