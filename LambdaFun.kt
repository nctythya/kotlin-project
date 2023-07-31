fun main() {
    fun convert(x: Double, converter: (Double) -> Double): Double {
        // code converter here
        val result = converter(x)
        println("$x is converted to $result")
        return result
    }

    convert(20.0, {c: Double -> c * 1.8 + 32})
}