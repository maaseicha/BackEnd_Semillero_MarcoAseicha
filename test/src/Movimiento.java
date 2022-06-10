public interface Movimiento {
    int x = 0;
    int y = 0;

    public default void caminar(int x) throws Exception{
        x++;
        if (x == 101){
            parar();
        }
        System.out.println(x);
    };
    public default double caminar(double x) throws Exception{
        if (x == 101){
            parar();
        }
        return x;
    };
    public abstract void correr() throws Exception;
    public void parar() throws Exception;
}
