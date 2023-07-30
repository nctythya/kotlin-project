fun main() {
    fun stringToInt(a: String) {
        try {
             val digit = a.toInt()
            println(digit)
        } catch(e: NumberFormatException) {
            println("Bummer")
        }
       
        println("This function has ended.")
    }

    println("Enter digit only: ")
    val input = readLine()!!
    stringToInt(input)

}