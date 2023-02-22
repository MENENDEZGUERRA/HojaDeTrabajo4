public class PilaLista<E> extends PilaAbstracta<E> {
    private Nodo<E> cabeza;

    public PilaLista() {
        cabeza = null;
        tamano = 0;
    }

    @Override
    public void apilar(E elemento) {
        Nodo<E> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
        tamano++;
    }

    @Override
    public E desapilar() {
        if (estaVacia()) {
            return null;
        }
        E elemento = cabeza.getElemento();
        cabeza
