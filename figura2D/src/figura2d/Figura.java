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
public class Figura {
    private String colorRelleno;
    
    public Figura(String color){
        this.colorRelleno = color;
    }
    
    public String getColorRelleno(){
        return this.colorRelleno;
    }
    
    public void setColorRelleno(String color){
        this.colorRelleno = color;
    }
}
