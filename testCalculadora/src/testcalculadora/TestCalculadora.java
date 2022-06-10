
package testcalculadora;

/**
 *
 * @author MARCOALEXANDERASEICH
 */
public class TestCalculadora {

    private double num1;
    private double num2;
    private double result;
    
    public TestCalculadora(double nume1,double nume2){
        this.num1 = nume1;
        this.num2 = nume2;
    }
    
    public double suma(){
        this.result = this.num1 + this.num2;
        return this.result;
    }
    
    public double resta(){
        this.result = this.num1 - this.num2;
        return this.result;
    }
    public double multiplicacion(){
        this.result = this.num1 * this.num2;
        return this.result;
    }
    public double division(){
        if(this.num2 != 0)
         this.result = this.num1 / this.num2;
        else
         this.result = 9999999;
        return this.result;
    }
    
    public static void main(String[] args) {
        TestCalculadora cal = new TestCalculadora(5,-5);
        System.out.println("Suma: "+cal.suma());
        System.out.println("Resta: "+cal.resta());
        if(cal.division()== 9999999){
            System.out.println("El numero 2 no puede ser cero");
        }else{
            System.out.println("División: "+cal.division());
        }
        System.out.println("Multiplicación: "+cal.multiplicacion());
    }
    
}
