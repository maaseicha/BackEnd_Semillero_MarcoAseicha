public class ArrayList<T>{
    private T[] conjunto;
    private int i;
    public ArrayList(int tamanio){
        conjunto = (T[]) new Object[tamanio];
        i=0;
    }

    public void agregarElementos(T obj){
        conjunto[i] = obj;
        i++;
    }

    public T obtenerElemntos(int posicion){
        return conjunto[posicion];
    }
}
