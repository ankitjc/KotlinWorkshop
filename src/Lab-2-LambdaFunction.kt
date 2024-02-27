val add: (Int, Int) -> (Int) = {a,b -> a + b}
val greet:() -> Unit = {println("Hello to Learning Lambda Functions")}


val sortString: (List<String>) -> List<String> = { unsortedList ->
    unsortedList.sortedBy { it.length }
}


fun main() {
    greet()
    println("10 + 20 is ${add(10, 20)}")

    println("----------------")

    val input = listOf("Texas", "California", "Utah", "Florida")
    println(sortString(input))
}