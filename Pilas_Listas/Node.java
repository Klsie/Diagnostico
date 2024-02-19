package Pilas_Listas;

/**
 *
 * @author Rodrigo Arana
 */
public class Node {

    private int dato;
    private Node next;

    public Node() {
    }

    public Node(int dato) {
        this.dato = dato;
        this.next = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
