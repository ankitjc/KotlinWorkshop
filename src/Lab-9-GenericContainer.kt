package src

// Create Generic Container taking Template
class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data;
    }
}

fun main() {
    val iContainer = Container(3)
    iContainer.getValue()
    val sContainer = Container("Kotlin")
    sContainer.getValue()
}


//class IntContainer(var data: Int){
//    fun setValue(value: Int)
//    {
//        data = value
//    }
//    fun getValue() : Int {
//        return data
//    }
//}
//
//class StringContainer(var data: String){
//    fun setValue(value: String)
//    {
//        data = value
//    }
//    fun getValue() : String {
//        return data
//    }
//}