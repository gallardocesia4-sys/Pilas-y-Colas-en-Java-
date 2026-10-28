public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println("¿Está vacía? " + cola.estaVacia()); // true
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.print("Cola tras encolar 10, 20, 30: ");
        cola.imprimir(); // 10->20-> 30
        System.out.println("verFrente(): " + cola.verFrente()); // 10
        System.out.println("desencolar(): " + cola.desencolar()); // 10
        System.out.print("Cola tras desencolar: ");
        cola.imprimir(); // 20->30
        System.out.println("Tamaño: " + cola.tamaño()); // 2
        System.out.println("desencolar(): " + cola.desencolar()); // 20
        System.out.println("desencolar(): " + cola.desencolar()); // 30
        System.out.println("¿Está vacía? " + cola.estaVacia()); // true
    }
}