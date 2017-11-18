/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboy;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Santiago
 */
class Vista extends JFrame{

    void iniciar() {
        setTitle("Cowboys");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1920,1080));
        setVisible(true);
        Presentacion presentacion= new Presentacion();
        add(presentacion);
        presentacion.setVisible(true);
    }
    
}
