package manipulacaolistas
fun main() {
    
    val numerosOriginais = listOf(5, 2, 8, 1, 9, 4, 2, 7, 6, 10, 3) 
    println("--- Lista Original ---")
    println("Lista: $numerosOriginais")
    println()

    // --- 1. Estrategia: Ordenação Crescente ---
    val listaCrescente = executar_estrategia(numerosOriginais, ::ordenarCrescente)
    println("--- Ordenacao Crescente ---")
    println("Resultado: $listaCrescente")
    println()

    // --- 4. Estratégia: Filtragem de Números Pares ---
    val numerosPares = executar_estrategia(numerosOriginais, ::filtrarNumerosPares)
    println("--- Filtragem de Numeros Pares ---")
    println("Resultado: $numerosPares")
    println()
}

fun executar_estrategia(lista: List<Int>, estrategia: (List<Int>) -> List<Int>): List<Int> {
    return estrategia(lista)
}