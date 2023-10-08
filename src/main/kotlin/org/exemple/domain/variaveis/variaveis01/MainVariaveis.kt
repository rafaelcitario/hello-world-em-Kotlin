package org.exemple.domain.variaveis.variaveis01

fun main(args: Array<String>) {
    var isNotConst: String = "This variable is not constant"
    val isConstVariable: Int = 1
    val dontTypedVariable = 3

    val isConstVariable: Int 10 // this error is intentional too

    var variableNotInitialized: Int

    println(isNotConst)
    println(isConstVariable)
    println(dontTypedVariable)
    println(variableNotInitialized) // this error is intentional

    /*
    * var is not a constant
    * val is a constant
    * when not initialized variable the IDE ask to init this
    * */



}