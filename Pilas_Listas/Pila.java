package Pilas_Listas;


import Pilas_Listas.Node;

/**
 *
 * @author Rodrigo Arana
 */
public class Pila {
    Node pila;

    public Pila() {
    }

    public Pila(Node pila) {
        this.pila = null;
    }
    
    public void push(int dato){
        Node nuevo = new Node(dato);
        if (pila == null) {
            pila = nuevo;
        }else{
            nuevo.setNext(pila);
            pila=nuevo;
        }
    }
    
    public String find(){
        Node aux = pila;
        String valores = "";
        if (aux == null) {
            valores += "la pila esta vacia";
        } else {
            for (; aux != null; aux = aux.getNext()) {
                valores += aux.getDato() + ",";
                System.out.println(aux.getDato());

            }
        }
        return valores;
    }
    
     public void pop() {
        Node aux = pila;

        if (pila == null) {

        } else {
            if (aux.getNext()== null) {
                pila = null;
            } else {
                pila = aux.getNext();
            }

        }

    }
    
    
    
}
