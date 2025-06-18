/**
 * Remove elementos duplicados de uma lista de inteiros.
 *
 * @param lista Lista de números inteiros possivelmente com duplicatas.
 * @return Nova lista contendo apenas os elementos únicos, mantendo a ordem original.
 */
fun removerDuplicatas(lista: List<Int>): List<Int> {
    return lista.distinct()
}