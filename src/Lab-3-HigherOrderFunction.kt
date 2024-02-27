// lambda function is defined.
val fn: (String, String) -> String = { a, b -> "$a joined with $b" }

// This is a higher order function which takes a lambda function as an argument.
fun myFun(str1: String, str2: String, fn: (String, String) -> String) {
    val strOp = fn(str1, str2);
    println(strOp)
}

val sum: (Int, Int) -> Int = { a, b -> a + b }
val sub: (Int, Int) -> Int = { a, b -> a - b }

fun operation(a: Int, b: Int, fn: (Int, Int) -> Int): Int {
    return fn(a, b)
}

fun main() {
    // Calling higher order function and passing lambda function
    myFun("Hello", "World", fn)


    println("Sum operation ${operation(3, 5, sum)}")
    println("Sub operation ${operation(3, 5, sub)}")
}