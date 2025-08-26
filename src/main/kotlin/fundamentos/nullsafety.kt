package fundamentos

/**
 * Nullsafety serve para evitar o nullpoint exception
 * ? garante que ele não é null
 * !! estou te dando certeza que ele não é null
 * ?: elvesoperaitor //Se esse cara for null ele vai chamar do lado direito
 */
fun main() {
    var nome = "Gustavo"
    var teste: String? = null
    val toShort: Short = nome!!.length.toShort()

    println(nome.length)

    if (teste != null) println(nome.length)

    println(teste?.length)
    println(teste?.length?.toShort())
    println(toShort)

    var name: String? = "Pedro"
    var testar: String? = null
    var tamanho: Int = name?.length ?: 0 //Se esse cara for null ele vai chamar do lado direito
    println(name)
    println(tamanho)
    tamanho = testar?.length ?: 0
    println(testar)
    println(tamanho)
}

