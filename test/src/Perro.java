public class Perro implements Movimiento{
    int y;

    public void parar() throws Exception{
        throw new Exception("Parar");
    }
    @Override
    public void correr() throws Exception{
        if (y == 100){
            parar();
        }
        y += 3;
        System.out.println(y);
    }
}
