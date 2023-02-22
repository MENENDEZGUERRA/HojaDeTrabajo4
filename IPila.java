public interface IPila<E> {
    void apilar(E elemento);
    E desapilar();
    E cima();
    boolean estaVacia();
    int tamano();
}
