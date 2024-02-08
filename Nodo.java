//Reynoso Garcia Jesus Salvador     22310400
//Arana Martinez Eric Rodrigo       22310401
package Principal;

public class Nodo {
    int numero;
    Nodo siguiente;
    
    public Nodo(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
