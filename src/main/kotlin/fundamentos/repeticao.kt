package org.example.fundamentos

fun main() {
    printaUmADez()
    printaDezAUm()
    printParUmA10()
    printaDezA1()
    printaRangeIndo(1, 100, 10)
    printaRangeVoltando(100, 1, 1)
    whileMenorQue10()
    doWhile()
}

fun printaUmADez() {
    println("Imprimindo número de 1 a 10")
    for (numero in 1..10) println("Número: ${numero}")
}

fun printaDezAUm() {
    println("Imprimindo número de 10 a 1")
    for (numero in 10 downTo 1) println("Número: ${numero}")
}

fun printParUmA10() {
    println("Imprimindo número de 1 a 10 em dois em dois")
    for (numero in 1..10 step 2) println("Número: ${numero}")
}

fun printaDezA1() {
    println("Imprimindo número de 10 a 1 em dois em dois")
    for (numero in 10 downTo 1 step 2) println("Número: ${numero}")
}

fun printaRangeIndo(inicio: Int, fim: Int, pula: Int = 1) {
    println("Imprimindo número de ${inicio} a ${fim} em ${pula} em ${pula}")
    for (numero in inicio..fim step pula) println("Número: ${numero}")
}

fun printaRangeVoltando(inicio: Int, fim: Int, pula: Int = 1) {
    println("Imprimindo número de ${inicio} a ${fim} em ${pula} em ${pula}")
    for (numero in inicio downTo fim step pula) println("Número: ${numero}")
}

fun whileMenorQue10() {
    println("Função whileMenorQue10")
    var x = 0
    while (x <= 10) {
        println("Número: ${x}")
        x++
    }
}

fun doWhile() {
    println("Função doWhile")
    var x = 0
    do {
        println("Número ${x}")
        x = x + 5
    } while (x <= 150)
}