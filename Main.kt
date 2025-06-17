fun main() {
    val numeros = listOf(10, 9, 8, 7, 6, 5, 4, 3, 5, 2, 1)
    println("Ordenação crescente: " + executar_estrategia(numeros, ::ordenarCrescente))
}

fun executar_estrategia(lista: List<Int>, estrategia: (List<Int>) -> List<Int>): List<Int> {
    return estrategia(lista)
}