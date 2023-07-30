fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(arrChoices: Array<String>) = arrChoices[(Math.random() * arrChoices.size).toInt()]

fun getUserChoice(arrChoices: Array<String>): String {
    var isValidChoice = false 
    var userChoice = ""

    // Loop through to validate user
    while(!isValidChoice) {
        print("Please enter one of the following: ")
        for(item in arrChoices) print("$item ")
        println(".")

        // Read user input
        val userInput = readLine()
        // validate it
        if(userInput != null && userInput in arrChoices) {
            isValidChoice = true 
            userChoice = userInput
        }
        // if not
        if(!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String 
    // Figure out the result
    if(userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock") || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"

    // print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}