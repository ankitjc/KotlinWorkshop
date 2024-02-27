fun main() {

    while(true) {
        println("Enter age or Press 1 to exit ")
        val ageStr = readLine()?: throw Exception("Invalid input")
        val input = ageStr.toInt()

        if(input == 1)
            break;

        verifyAge(input)
    }
}

class InvalidVotingException(message: String): Exception(message)

fun verifyAge(age:Int) {
    try {
        if (age < 18) throw InvalidVotingException("Not eligible to vote yet.")
        else {
            println("Eligible to vote")
        }
    } catch (e: InvalidVotingException) {
        println(e.message)
    }
}