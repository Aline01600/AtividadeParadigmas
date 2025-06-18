package manipulacaolistas
/**
 * Filtra uma lista de numeros, retornando apenas os numeros pares.
 *
 * @param lista A lista de inteiros a ser filtrada.
 * @return Uma nova lista contendo apenas os numeros pares.
 */
fun filtrarNumerosPares(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 == 0 }
}

