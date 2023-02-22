public abstract class IPilaAbstracta<E> implements IPila<E> {
    protected int tamano;

    @Override
    public boolean estaVacia() {
        return tamano == 0;
    }

    @Override
    public int tamano() {
        return tamano;
    }
}