package Pilas_Listas;

/**
 *
 * @author Rodrigo Arana
 */
public class Cola {

    private Node cola, fin;

    public Cola() {
    }

    public void encolar(int dato) {
        Node nuevo = new Node(dato);
        if (cola == null) {
            cola = nuevo;
            fin = nuevo;
        } else {
            nuevo.setNext(fin);
            fin = nuevo;
        }
    }

    public String mostrar() {
        Node aux = fin;
        String valores = "";
        if (cola == null) {
            valores += "la pila esta vacia";
        } else {
            for (; aux != null; aux = aux.getNext()) {
                valores += aux.getDato() + ",";
                System.out.println(aux.getDato());
            }
        }
        return valores;
    }

    public void desencolar() {
        Node aux = fin;

        if (cola == null) {

        } else {
            aux = fin;
            while (aux.getNext() != cola) {
                aux = aux.getNext();
            }
            aux.setNext(null);
            cola = aux;

        }

    }

}
