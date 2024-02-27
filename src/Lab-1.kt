fun main() {

    println(greet("Ankit"))

    val result = sum(10, 20);
    println("Sum of 10 and 20 is $result")
    
    println("Number is even: ${isEven(10)}")
}

fun sum(a : Int, b: Int):  Int {
    return a + b
}

fun greet(name: String): String {
    return "Hello, $name"
}

fun isEven(num: Int): Boolean {
    return num%2==0
}