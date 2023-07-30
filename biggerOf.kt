fun biggerOf(a: Int, b: Int): Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}
fun main() {
    println(biggerOf(3, 1))
    println(biggerOf(10, 20))
}