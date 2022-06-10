public class Principal {
    public static void main(String[] args) {
        Calculadora<Integer,Double> objCal = new Calculadora<Integer,Double>(4,5);

        int valor = objCal.sumar();
        System.out.println("Suma: "+valor);
        valor = objCal.restar();
        System.out.println("Resta: "+valor);
        valor = objCal.multiplicar();
        System.out.println("Multiplicacion: "+valor);
        valor = objCal.dividir();
        System.out.println("Division: "+valor);

        System.out.println("");
        Double valor1 = objCal.sumar(5.3,4.2);
        System.out.println("Suma: "+valor1);
        valor = objCal.restar();
        System.out.println("Resta: "+valor);
        valor = objCal.multiplicar();
        System.out.println("Multiplicacion: "+valor);
        valor = objCal.dividir();
        System.out.println("Division: "+valor);
    }
}
