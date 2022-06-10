/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura2d;

/**
 *
 * @author MARCOALEXANDERASEICH
 */
public class Figura2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo("Red", 54);
        c.setColorRelleno("Amarillo");
        System.out.println(c.getRadio());
        System.out.println(c.getColorRelleno());
    }
    
    
}
