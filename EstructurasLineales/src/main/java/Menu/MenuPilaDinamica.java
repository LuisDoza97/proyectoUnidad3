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
public class MenuPilaDinamica extends javax.swing.JFrame {

    /**
     * Creates new form MenuPilaDinamica
     */
    public MenuPilaDinamica() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInsertar = new javax.swing.JMenu();
        MenuInsertar1 = new javax.swing.JMenu();
        MenuMostrar = new javax.swing.JMenu();
        MenuInsertar2 = new javax.swing.JMenu();
        MenuInsertar4 = new javax.swing.JMenu();
        MenuEliminar = new javax.swing.JMenu();
        MenuInsertar6 = new javax.swing.JMenu();
        MenuInsertar8 = new javax.swing.JMenu();
        MenuRegresar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuInsertar.setText("INSERTAR   ");

        MenuInsertar1.setText("DATO");
        MenuInsertar.add(MenuInsertar1);

        jMenuBar1.add(MenuInsertar);

        MenuMostrar.setText("MOSTRAR");

        MenuInsertar2.setText("TODA LA PILA");
        MenuMostrar.add(MenuInsertar2);

        MenuInsertar4.setText("ÚLTIMO AGREGADO");
        MenuMostrar.add(MenuInsertar4);

        jMenuBar1.add(MenuMostrar);

        MenuEliminar.setText("ELIMINAR");

        MenuInsertar6.setText("ÚLTIMO DATO");
        MenuEliminar.add(MenuInsertar6);

        MenuInsertar8.setText("TODA LA PILA");
        MenuEliminar.add(MenuInsertar8);

        jMenuBar1.add(MenuEliminar);

        MenuRegresar.setText("REGRESAR");
        jMenuBar1.add(MenuRegresar);

        setJMenuBar(jMenuBar1);

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
            java.util.logging.Logger.getLogger(MenuPilaDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPilaDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPilaDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPilaDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPilaDinamica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuEliminar;
    private javax.swing.JMenu MenuInsertar;
    private javax.swing.JMenu MenuInsertar1;
    private javax.swing.JMenu MenuInsertar2;
    private javax.swing.JMenu MenuInsertar4;
    private javax.swing.JMenu MenuInsertar6;
    private javax.swing.JMenu MenuInsertar8;
    private javax.swing.JMenu MenuMostrar;
    private javax.swing.JMenu MenuRegresar;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}