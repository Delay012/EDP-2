public class Main {
    public static void main(String[] args) {
        Cola<Interger>colaEnteros = new Cola<>();

        colaEnteros.encolar(30);
        colaEnteros.encolar(20);
        colaEnteros.encolar(10);
        System.out.println(colaEnteros.desencolar());

        Cola<String>colaCadenas = new Cola();
        colaEnteros.encolar("Hola");
        colaEnteros.encolar("Mundo");
        System.out.println(colaEnteros.desencolar());

    }
}