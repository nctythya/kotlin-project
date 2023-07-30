fun printStars(num: Int) {
    for(i in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for(i in 1..height) {
        printStars(i)
    }
}

fun descendingTriangle(height: Int) {
    for(i in height downTo 1) {
        printStars(i)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

fun main() {
    print("Asceding triangle:")
    ascendingTriangle(5)
    println("Descending triangle:")
    descendingTriangle(5)
    println("Isosceles triagle:")
    isoscelesTriangle(5)
}