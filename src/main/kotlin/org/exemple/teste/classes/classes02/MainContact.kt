package org.exemple.teste.classes.classes02

import org.exemple.domain.classes.classes02.Contact

fun main(args: Array<String>) {
    val contact = Contact(1, "contact@contact.com.br")
    println(contact.id)
    contact.email = "newContact@contact.com.br"
    println(contact.email)
}