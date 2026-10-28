public class Pila {
    private static class Nodo {
        // El valor que almacena este nodo.
        int dato;
         // Referencia al nodo que queda DEBAJO en la pila.
        // Si este es el último (el fondo), 'siguiente' será null.
        Nodo siguiente;
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // 'tope' apunta al nodo de ARRIBA.
    // Si la pila está vacía, tope == null.
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(int dato) {
        // 1) Creamos el nuevo nodo.
        Nodo nuevo = new Nodo(dato);
        // 2) El nuevo nodo apunta al viejo tope (queda "encima").
        nuevo.siguiente = tope;
        // 3) Actualizamos 'tope' al nuevo nodo.
        tope = nuevo;
    }

    public int pop() {
        if (estaVacia()) throw new IllegalStateException("La pila está vacía");
        int valor = tope.dato;  // guardamos el dato del tope
        tope = tope.siguiente;  // el segundo pasa a ser el nuevo tope
        return valor;
    }

    public int peek() {
        if (estaVacia()) throw new IllegalStateException("La pila está vacía");
        return tope.dato;
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Nodo actual = tope;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" | ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}