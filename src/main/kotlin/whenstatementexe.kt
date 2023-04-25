fun main(args: Array<String>) {
    println("Select option using *544#")
    println("Enter option:")

    var input = readLine()
    when(input){
        "1" -> println("Blaze deals")
      "2" -> println("Weekly bundles")
        "3" -> println("Daily bundles")
        "4" -> println("Okoa data")
        "5" -> println("Entertainment bundles")
        else -> println("Invalid option")

    }
}

