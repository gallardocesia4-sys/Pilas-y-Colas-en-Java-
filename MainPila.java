public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println("¿Está vacía? " + pila.estaVacia()); // true
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.print("Pila tras push 10, 20, 30: ");
        pila.imprimir(); // 30↓20↓ 10
        System.out.println("peek(): " + pila.peek()); // 30
        System.out.println("pop(): " + pila.pop()); // 30
        System.out.print("Pila tras pop: ");
        pila.imprimir(); // 20↓10
        System.out.println("Tamaño: " + pila.tamaño()); // 2
        System.out.println("pop(): " + pila.pop()); // 20
        System.out.println("pop(): " + pila.pop()); // 10
        System.out.println("¿Está vacía? " + pila.estaVacia()); // true
    }
}
