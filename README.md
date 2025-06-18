João Vitor Ribeiro
# Função removerDuplicatas

Essa função recebe uma lista de números inteiros e retorna uma nova lista com os elementos duplicados removidos, mantendo a ordem da primeira ocorrência.

## Como funciona

Utiliza o método `distinct()` do Kotlin para eliminar números repetidos.

## Exemplo de uso

```kotlin
val numeros = listOf(10, 9, 8, 9, 7, 6, 5, 5, 4, 3, 2, 1)
val resultado = removerDuplicatas(numeros)
println(resultado) // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
