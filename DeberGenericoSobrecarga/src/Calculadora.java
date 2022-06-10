public class Calculadora <T extends Integer,U extends Double>{
    private T n1;
    private T n2;
    public Calculadora(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public <T> int sumar(){
        return n1.intValue() + n2.intValue();
    }

    public <T> int restar(){
        return n1.intValue() - n2.intValue();
    }

    public <T> int multiplicar(){
        return n1.intValue() * n2.intValue();
    }

    public <T> int dividir(){
        if (n2.intValue() == 0)
            return 0;
        return n1.intValue() / n2.intValue();
    }
    public <U extends Double> double sumar(U num1, U num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public <U extends Double> double restar(U num1, U num2){
        return num1.doubleValue() - num2.doubleValue();
    }

    public <U extends Double> double multiplicar(U num1, U num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public <U extends Double> double dividir(U num1, U num2){
        if (num2.doubleValue() == 0)
            return 0;
        return num1.doubleValue() / num2.doubleValue();
    }
}
