public class EjecutarLlenadoObjetos {

    public static void main(String[] args) {
        ArrayList<String> coleccion = new ArrayList<String>(4);
        /*coleccion.agregarElementos(new Empleado("Marco","Pelileo","095959595"));
        coleccion.agregarElementos(new Empleado("Alexander","Pelileo","095959595"));
        coleccion.agregarElementos(new Empleado("Juan","Pelileo","095959595"));
        coleccion.agregarElementos(new Empleado("Carlos","Pelileo","095959595"));*/
        coleccion.agregarElementos("Maria");
        coleccion.agregarElementos("Jose");
        coleccion.agregarElementos("Pepe");
        coleccion.agregarElementos("Juan");
        String valor =  coleccion.obtenerElemntos(3);
        System.out.println(valor);
    }
}
