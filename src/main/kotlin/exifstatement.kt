fun main(args: Array<String>) {
    print("Enter your age:")
    var age = readLine()?.toInt()?:0
    if (age >= 18) {
        println("Welcome to the club")
    } else{
        println("Rudi mtaa")
    }
}