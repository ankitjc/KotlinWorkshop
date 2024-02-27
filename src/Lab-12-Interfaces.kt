package src

interface Shape {
    fun area(): Double
}

interface TwoDimShape {
    fun perimeter(): Double
}

interface ThreeDimShape {
    fun volume(): Double
}

class Circle(private val radius: Double): TwoDimShape {
    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Sphere(private val radius: Double): ThreeDimShape {
    override fun volume(): Double {
        return (Math.PI*radius*radius*radius)*(4.0/3)
    }
}

fun main() {
    val circle = Circle(1.0)
    val sphere = Sphere(1.0)

    println("Perimeter of circle with radius 1 is ${circle.perimeter()}")
    println("Volume of sphere with radius 1 is ${sphere.volume()}")
}