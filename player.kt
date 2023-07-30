class Player(val name: String, val surname: String) {

    fun fullName() {
        println("Hello, $name $surname")
    }
}

class Scores {
    var totalScore = 0
    var personalBestScore = 0

    fun getScore() {
        if(personalBestScore < totalScore) totalScore else personalBestScore
    }
}

fun main() {
    val p1 = Player("Nicola", "Tesla")
    val p2 = Player("Thomas", "Edison")

    val scoring = Scores()
    var lvlScore = 0
    lvlScore = 20
    scoring.getScore()


    print(p1.fullName())
    print(p2.fullName())
}