fun main(args: Array<String>) {
    print("Enter your age:")
    var age = readLine()?.toInt()
    if (age != null) {
        var yearBorn = 2023 - age
        println("You were born in $yearBorn")

    } else{
        println("Invalid input")
    }
}
