import java.util.ArrayList;

public class PilaArrayList<E> extends PilaAbstracta<E> {
    private ArrayList<E> elementos;

    public PilaArrayList() {
        elementos = new ArrayList<>();
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

