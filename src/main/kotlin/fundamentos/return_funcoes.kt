package org.example.fundamentos

/**
 * o return pode ser utilizado e o
 * when() e como se fosse o switch case
 */
fun retornNumeroPorExtenso(numero: Int): String {
    return when(numero){
        1 -> "UM"
        2 -> "Dois"
        3 -> "Três"
        4 -> "Quatro"
        5 -> "Cinco"
        6 -> "Seis"
        7 -> "Sete"
        8 -> "Oito"
        9 -> "Nove"
        10 -> "Dez"
        else -> "Número não encontrado"
    }
}

fun main(){
    println(retornNumeroPorExtenso(11))
}