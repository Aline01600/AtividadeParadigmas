package manipulacaolistas
fun main() {

    
    val numerosOriginais = listOf(5, 2, 8, 1, 9, 4, 2, 7, 6, 10, 3) 
    println("--- Lista Original ---")
    println("Lista: $numerosOriginais")
    println()
    val numerosPares = executar_estrategia(numerosOriginais, ::filtrarNumerosPares)
    println("--- Filtragem de Numeros Pares ---")
    println("Resultado: $numerosPares")
    println()
    val numeros1 = listOf(10, 9, 8, 9, 7, 6, 5, 5, 4, 3, 2, 1)
    println("Remoção de duplicatas: " + executar_estrategia(numeros1, ::removerDuplicatas))
}

fun executar_estrategia(lista: List<Int>, estrategia: (List<Int>) -> List<Int>): List<Int> {
    return estrategia(lista)
}