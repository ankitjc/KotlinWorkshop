package src

class Outer {
    var i=0
    inner class Nested {
        fun test() {
            println("Nested class $i")
        }

        fun getInnerValue(): Int {
            return i
        }
    }

    fun getOuterValue(): Int {
        return i
    }
}

fun main() {
    val outer = Outer()
    outer.i = 10

    println(outer.getOuterValue())

    val nested = outer.Nested()
    nested.test()

    val nestedAgain = Outer().Nested()
    nestedAgain.test()
}