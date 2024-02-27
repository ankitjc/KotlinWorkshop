fun loop(n: Long) {
    for (i: Long in 1..n) {

    }
}

inline fun calculateTimeAndRun(fn: () -> Unit) {
    val startTime = System.currentTimeMillis()
    fn()
    val endTime = System.currentTimeMillis()
    println("Time Taken ${endTime - startTime} ms")
}

fun main() {
    calculateTimeAndRun {
        loop(1000000)
    }
    calculateTimeAndRun {
        loop(1000000)
    }
    calculateTimeAndRun {
        loop(1000000)
    }
    calculateTimeAndRun {
        loop(1000000)
    }
    calculateTimeAndRun {
        loop(1000000)
    }
}