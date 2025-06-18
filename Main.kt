fun main() {
    val numeros1 = listOf(10, 9, 8, 9, 7, 6, 5, 5, 4, 3, 2, 1)
    println("Remoção de duplicatas: " + executar_estrategia(numeros1, ::removerDuplicatas))
}

fun executar_estrategia(lista: List<Int>, estrategia: (List<Int>) -> List<Int>): List<Int> {
    return estrategia(lista)
}