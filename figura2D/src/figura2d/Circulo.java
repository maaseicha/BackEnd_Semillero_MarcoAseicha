/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura2d;
 
public class Circulo extends Figura {
    private int radio;

    public Circulo(String color, int r) {
        super(color);
        this.radio = r;
    }
    
    public int getRadio(){
        return this.radio;
    }
}
