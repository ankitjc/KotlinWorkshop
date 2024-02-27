val filterList: (List<Int>) -> List<Int> = { unfilteredList ->
    unfilteredList.filter { it > 0 }
}

fun filter(l: List<Int>, fn: (List<Int>) -> List<Int>): List<Int> {
    return fn(l)
}

fun main() {
    val input = listOf(-2, 0, 1,2,4,5, -6, -9)

    println(filter(input, filterList))
}