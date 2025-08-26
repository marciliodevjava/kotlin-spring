package org.example.fundamentos

fun main() {
    println(testawhen(16))
    testaWhenContador(1, 100, 1)
    println(comecaComUm("oi tudo bem?"))

    when {
        comecaComUm(5) -> println(5)
        comecaComUm("Oi, estou bem") -> println("Oi estou bem")
    }
}

fun testawhen(valor: Int): String {
    return when (valor) {
        1 -> "Um"
        2 -> "Dois"
        3 -> "Três"
        4 -> "Quatro"
        5 -> "Cinco"
        6 -> "Seis"
        in 11 .. 15 -> "${valor} está entre 11 e 15"
        !in 16 .. 20 -> "Ele não está entre 16 a 20"
        else -> "Valor não encontrado"
    }
}

fun testaWhenContador(valorIniti: Int, valorFinal: Int, pula: Int) {
    for (numero in valorIniti..valorFinal step pula) println("Número: ${numero}")
}

fun comecaComUm(x: Any): Boolean{
    return when(x){
        is String -> x.uppercase().startsWith("OI")
        else -> false
    }
}