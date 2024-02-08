//Reynoso Garcia Jesus Salvador     22310400
//Arana Martinez Eric Rodrigo       22310401
package Principal;

import java.util.Scanner;

public class Pila {

    Nodo primero;
    Scanner scan;

    public Pila() {
        primero = null;
    }

    public void insertar(int numero) {
        Nodo nuevo = new Nodo(numero);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void eliminar() {
        Nodo actual = primero;
        if (primero == null) {
            System.out.println("PILA VACIA");
        } else {
            if (actual.getSiguiente() == null) {
                primero = null;
                System.out.println("Numero eliminado de la pila exitosamente");

            } else {
                while (actual.getSiguiente().getSiguiente() != null) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                System.out.println("Numero eliminado de la pila exitosamente");
            }
        }

    }

    public String listar() {
        int cont = 1;
        String texto = "";
        Nodo actual = primero;
        if (primero == null) {
            texto = "La pila esta vacia :(";
        } else {
            while (actual != null) {
                texto = texto + "\nNumero " + cont + ":\t" + actual.getNumero() + "\n";
                actual = actual.getSiguiente();
                cont++;
            }
        }
        return texto;
    }

    public void menu() {
        int opc = 0;
        scan = new Scanner(System.in);
        System.out.print("\n\nBienvenido\nIngrese la opcion que desea realizar:\n1.Insertar\n2.Eliminar\n3.Mostrar\n");
        try {
            opc = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese el numero entero de la opcion que desea realizar");
            menu();
        }
        switch (opc) {
            case 1:
                System.out.println("Ingrese el numero que desea ingresar");
                int num = Integer.parseInt(scan.nextLine());
                insertar(num);
                menu();
                break;
            case 2:
                eliminar();
                menu();
                break;
            case 3:
                System.out.println(listar());
                menu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion Invalida");
                menu();
        }
    }
}
