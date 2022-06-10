public class Persona implements Movimiento{

    int y;

    @Override
    public void parar() throws Exception{
        throw new Exception("Parar");
    }
    @Override
    public void correr() throws Exception{
        if (y == 100){
            parar();
        }
        y += 2;
        System.out.println(y);
    }
}
