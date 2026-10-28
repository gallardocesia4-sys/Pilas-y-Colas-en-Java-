public class Cola {
    private static class Nodo {
         // El valor que almacena este nodo.
        int dato;

        // Referencia al SIGUIENTE nodo de la cola.
        // Si este es el último, 'siguiente' será null
        Nodo siguiente;
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    
    // 'frente' apunta al PRIMER nodo (por aquí se saca).
    // 'fin'    apunta al ÚLTIMO nodo (por aquí se inserta).
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);

        // Caso 1: cola vacía → el nuevo es frente y fin a la vez.
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
            return;
        }

        // Caso 2: ya hay elementos → lo enganchamos después del fin.
        fin.siguiente = nuevo;
        fin = nuevo;
    }

    public int desencolar() {
        if (estaVacia()) throw new IllegalStateException("La cola está vacía");
        int valor = frente.dato;
        frente = frente.siguiente;  // el segundo pasa a ser el frente
        
        // Caso especial: si la cola quedó vacía, fin también debe ser null.
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    public int verFrente() {
        if (estaVacia()) throw new IllegalStateException("La cola está vacía");
        return frente.dato;
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" -> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
