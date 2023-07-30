class Dog(val name: String) {

    val hunger = 62

    fun feed() {

        val currentDog: Dog = this

        println("Feeding ${currentDog.name}")

        currentDog.hunger = 0
    }
}

fun main() {

    val dog = Dog("Rex")

    dog.feed() // Feeding Rex
}