fun triagleArea(widht: Double, height: Double): Double {
    return widht * height / 2
}

fun main() {
    val area: Double = triagleArea(1.2, 2.0)
    println(area)
    println(triagleArea(2.0, 2.0))
    println(triagleArea(5.0, 5.0))
    println(triagleArea(10.0, 20.0))
}