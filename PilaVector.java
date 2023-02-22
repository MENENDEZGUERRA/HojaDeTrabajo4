import java.util.Vector;

public class PilaVector<E> extends PilaAbstracta<E> {
    private Vector<E> elementos;

    public PilaVector() {
        elementos = new Vector<>();
        tamano = 0;
    }

    @Override
    public void apilar(E elemento) {
        elementos.add(elemento);
        tamano++;
    }

    @Override
    public E desapilar() {
        if (estaVacia()) {
            return null;
        }
        E elemento = elementos.remove(tamano - 1);
        tamano--;
        return elemento;
    }

    @Override
    public E cima() {
        if (estaVacia()) {
            return null;
        }
        return elementos.get(tamano - 1);
    }
}
