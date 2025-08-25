package org.example.fundamentos

/**
 * Variaveis são algo que vai receber valores
 * var é do tipo mutavel
 * val eé do tipo imutavel
 */
fun main() {
    var nome = "Marcilio"
    val nomeVal = "Daniel"
//    nomeVal = "Daniel maestro"
    println(nome)
    println(nomeVal)
    nome = "Marcilio Zanatta"
    println(nome)
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariveis() {
        teste = "Teste"
    }
}