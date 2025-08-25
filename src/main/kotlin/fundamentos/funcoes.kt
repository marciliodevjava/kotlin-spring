package org.example.fundamentos

/*
Funções o que é uma função
 */

fun main() {
    println("Hello Word")
    println(retornaString("Marcilio"))
    disOi(retornaString("Marcilio"), 30, sexo = "Masculino")
    disOi(idade= 24, nome = "Gustavo")
}

fun retornaString(nome: String): String {
    return "${nome}"
}

fun disOi(nome: String, idade: Int, sexo: String="Prefiro não falar") {
    println("Oi ${nome}, você tem ${idade} anos, seu sexo é ${sexo}.")
}