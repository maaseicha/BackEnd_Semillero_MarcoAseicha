public class Principal {
    public static void main (String [] args) throws Exception {
        Persona objPersona = new Persona();
        //Perro objPerrro = new Perro();
        double a = 0.1;
        for (int i=0;;i++){
            objPersona.caminar(i);
            System.out.println(objPersona.caminar(a));
            a+=0.1;
        }
    }
}
