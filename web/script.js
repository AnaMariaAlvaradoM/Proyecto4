document.addEventListener('DOMContentLoaded', function() {
    const resultado = document.getElementById('resultado');

    // Crear dos conjuntos de prueba
    const conjunto1 = new IntegerSet();
    const conjunto2 = new IntegerSet();

    conjunto1.insertaElemento(5);
    conjunto1.insertaElemento(10);
    conjunto1.insertaElemento(15);

    conjunto2.insertaElemento(10);
    conjunto2.insertaElemento(20);
    conjunto2.insertaElemento(25);

    // Mostrar los conjuntos de prueba en la página
    resultado.innerHTML += "<p>Conjunto 1: " + conjunto1.toString() + "</p>";
    resultado.innerHTML += "<p>Conjunto 2: " + conjunto2.toString() + "</p>";

    // Realizar unión de conjuntos
    conjunto1.union(conjunto2);
    resultado.innerHTML += "<p>Unión: " + conjunto1.toString() + "</p>";

    // Realizar intersección de conjuntos
    conjunto1.interseccion(conjunto2);
    resultado.innerHTML += "<p>Intersección: " + conjunto1.toString() + "</p>";

    // Comprobar si los conjuntos son iguales
    resultado.innerHTML += "<p>¿Conjuntos iguales? " + conjunto1.igualA(conjunto2) + "</p>";
});
