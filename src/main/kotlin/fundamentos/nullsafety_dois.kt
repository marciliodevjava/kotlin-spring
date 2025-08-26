package fundamentos

fun main() {
    var pessoa: Pessoa? = null
//    var pessoa: Pessoa? = Pessoa("Marcilio Zanatta", 30)

    println("Inicio da execução")
    try {
        println(pessoa!!.nome)
    } catch (n: NullPointerException){
        println("Aconteceu um erro.")
    }
    println("Fim da execução")
}