public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet conjunto1 = new IntegerSet();
        IntegerSet conjunto2 = new IntegerSet();

        conjunto1.insertaElemento(5);
        conjunto1.insertaElemento(10);
        conjunto1.insertaElemento(15);

        conjunto2.insertaElemento(10);
        conjunto2.insertaElemento(20);
        conjunto2.insertaElemento(25);

        System.out.println("Conjunto 1: " + conjunto1.toString());
        System.out.println("Conjunto 2: " + conjunto2.toString());

        // Realizar unión
        conjunto1.union(conjunto2);
        System.out.println("Unión: " + conjunto1.toString());

        // Realizar intersección
        conjunto1.interseccion(conjunto2);
        System.out.println("Intersección: " + conjunto1.toString());

        // Comprobar si los conjuntos son iguales
        System.out.println("¿Conjuntos iguales? " + conjunto1.igualA(conjunto2));
    }
}
