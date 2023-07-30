class User(var name: String) {

    fun changeName(name: String) {
        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}

fun main() {
    val user = User("Alpha")
    user.changeName("Beta")
    println(user.name)
}