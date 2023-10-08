fun main(args: Array<String>) {
    fun printHello(message: String): String {
        println("What's your name?")
        val name: String = readln()
        return "$message $name. Nice to meet you!"
    }

    val message: String = printHello("Hello,")
    println(message)
}