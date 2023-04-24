fun main(args: Array<String>) {
    val correctPin = "1220"
    do{
        print("Enter pin:")
        val inputPin = readlnOrNull()
        if (inputPin == correctPin){
            println("Correct Pin")
        }else{
            println("Invalid Pin, Try again")
        }
    }while (true)
}