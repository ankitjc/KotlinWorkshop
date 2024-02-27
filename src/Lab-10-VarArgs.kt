package src

fun main() {
    add(1)
}

fun add(vararg values: Int) {
    var sum = 0
    for (i in values) {
        sum += i
    }
    println(sum)
}

