typealias DoubleConversions = (Double) -> Double 

fun convert(x: Double, 
            converter: (Double) -> Double): Double {
                val result = converter(x)
                println("$x is converted to $result")
                return result 
            }

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result 
}

fun getConversionLambda(str: String): (Double) -> Double {
    if(str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32}
    } else if ( str == "KgsToPounds") {
        return {it * 2.204623}
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0}
    } else {
        return {it}
    }
}

fun combine(lambda1: (Double) -> Double, 
            lambda2: (Double) -> Double): (Double) -> Double {
                // code here
                return { x: Double -> lambda2(lambda1(x))}
            }

fun main() {

    convert(20.0) {it * 1.8 + 32}
    convertFive{it * 1.8 + 32}

    // convert 2.5kg to pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    // define two conversions lambdas
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    // Combine the two lambdas to create a new one
    val kgsToUSTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)

    // User the new lambda to convert 17.4 to Us tons
    val value = 17.4 
    println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US tons")
}