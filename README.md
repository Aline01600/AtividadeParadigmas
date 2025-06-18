
Aline Soares
Descrição: Ordena uma lista de inteiros em ordem crescente.
Entrada: (10, 9, 8, 7, 6, 5, 4, 3, 5, 2, 1)
Saída: [1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10]
Execução do codigo: 
Main.kt estrategias/ordenar_crescente.kt -include-runtime -d programa.jar
java -jar programa.jar

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

