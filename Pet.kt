interface Retailer<out T> {
    fun sell(): T
}

abstract class Pet(var name: String) {

}
class Cat(name: String): Pet(name){}
class Dog(name: String): Pet(name){}
class Fish(name: String): Pet(name){}

class CatRetailer: Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}

class FishRetailer: Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}

class DogRetailer: Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}

// define the contest class specifically kind of Pet
class Contest<T: Pet>(var vet: Vet<in T>) {
    // more code here
    val scores: MutableMap<T, Int> = mutableMapOf()

    // add score fun
    fun addScore(t: T, score: Int = 0) {
        if(score>=0) scores.put(t, score)
    }
    // another fun
    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for((t, score) in scores) {
            if(score==highScore) winners.add(t)
        }
        return winners
    }
}

class Vet<T: Pet> {
    fun treat(t: T) {
        println("Treat Pet ${t.name}")
    }
}

fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)

    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVet)

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()
}
