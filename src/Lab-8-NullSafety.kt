package src

fun main(){
    var gender: String = "Male"
    var gender2: String? = null
    if (gender2 != null) {
        println(gender2.uppercase())
    }
    println(gender2)
    gender2?.let {
        println("Line 1")
        println("Line 2")
        println("line 3")
    }
    var selectedValue: String? = gender2 ?: "XYZ"
    println(selectedValue)

    // To bypass null check - can get nullpointerexception at runtime. 
    var value:String = gender2!!.uppercase()
    println(value)
}