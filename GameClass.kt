class Player(var name: String, var surName: String) {
    var totalScore = 0
    var personalBestScore = 0
    fun fullName(): String {
        return name + " " + surName
    }
}

class Scores() {
    
    fun checkBest(best: Int, current: Int): Int {
        if(best < current) {
            return current
        } else {
            return best
        }
    }
}

fun main() {
    val P1 = Player("Nikola", "Tesla")
    val P2 = Player("Thomas", "Edison")

    val scoring = Scores()
    var lvlScore = 0

    // level 1
    lvlScore = 12
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore)

    lvlScore1 = 20
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore1)
    if(P1.totalScore > P2.totalScore) {
        println("The winner is " + P1.fullName() + " with a Score of " + P1.totalScore)
        println("Personal Best Score is = " + P1.personalBestScore)
    } else {
        println("The winner is " + P2.fullName() + " with a Score of " + P2.personalBestScore)
        println("Personal Best Score is = " + P2.personalBestScore)
    }
}