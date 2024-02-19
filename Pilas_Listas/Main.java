
package Pilas_Listas;

/**
 *
 * @author Rodrigo Arana
 */
public class Main {
    Pila pila = new Pila();
    Cola cola = new Cola();

  
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Pila--------");
        main.pila.push(82);
        main.pila.push(2);
        main.pila.push(3);
        System.out.println("Mostrando Pila--------");
        main.pila.find();
        System.out.println("Borrando pila--------");
        main.pila.pop();
        System.out.println("Mostrando pila--------");
        main.pila.find();
        System.out.println("Cola--------");
        main.cola.encolar(43);
        main.cola.encolar(22);
        main.cola.encolar(2);
        System.out.println("Mostrando Cola--------");
        main.cola.mostrar();
        System.out.println("Borrando Cola--------");
        main.cola.desencolar();
        System.out.println("Mostrando Cola--------");
        main.cola.mostrar();
        
        
        
    }
}
