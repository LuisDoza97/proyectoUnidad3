/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import PilaEstatica.PilaEstatica;

/**
 *
 * @author Admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new VentanaPrincipal().setVisible(true);
        }
    });
        
        // A partir de aqui escribe tus codigos espagueti XD
        PilaEstatica objetoPilaE = new PilaEstatica ();
        objetoPilaE.msg();
    }
}