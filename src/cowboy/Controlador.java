/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboy;

/**
 *
 * @author Santiago
 */
public class Controlador {
    private Vista vista;

    public Controlador() {
        this.vista= new Vista();
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
}
