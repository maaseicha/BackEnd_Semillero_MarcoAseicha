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
public class Triangulo extends Figura{
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(String color, int a, int b, int c) {
        super(color);
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }
    
    
}
