package org.example.fundamentos


fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) return "Par"
    else "Ímpar"
}


fun resultadoNota(nota: Float): String {
    return if (nota >= 6) "Passou"
    else if (nota >= 4 && nota < 6) "Recuperação"
    else "Reprovado"
}

fun main() {
    val primeiro: Int = 2;
    val segundo: Int = 3

    println("Número ${primeiro} é ${parOuImpar(primeiro)}")
    println("Número ${segundo} é ${parOuImpar(segundo)}")


    val notaUm: Float = 6.0f;
    val notaDois: Float = 5.3f;
    val notaTres: Float = 3.9f;

    println("Nota ${notaUm} Aluno: ${resultadoNota(notaUm)}")
    println("Nota ${notaDois} Aluno: ${resultadoNota(notaDois)}")
    println("Nota ${notaTres} Aluno: ${resultadoNota(notaTres)}")

}
