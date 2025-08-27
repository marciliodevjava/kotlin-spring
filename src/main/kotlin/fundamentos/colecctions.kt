package fundamentos

/**
 * lisOf() lista imutavel
 * mutableListOf() lista mutavel
 * setOf() nãp recebe valores duplicados
 * mapOf() chave e valor
 * mutableMapOf<String, Any> chave e valor
 */
fun main() {
    var lista = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20,21,25,36,19)
    var listaNull = listOf(1, "marcilio", null)
    var listVazia = mutableListOf<Any?>()

    println(lista)
    println(listaNull)

    var pares = lista.filter { it -> it % 2 == 0 }.first()

    println(pares)
    var impar = lista.filter { it % 2 == 1 }
    println(impar)

    lista.forEach { it ->
        listVazia.add(it)
    }
    println("Lista Vazia")
    listVazia.forEach { it ->
        println(it)
    }
    println(lista[0])

    println(lista.sorted())

    println(lista.shuffled())

    var setNumeros = setOf(1,2,3)
    println(setNumeros)
    var listMap = mapOf("id" to 10, "nome" to "Marcilio")
    println(listMap)

    var mutableMap = mutableMapOf<String, Any>("id" to 1, "nome" to "patrike")
    println(mutableMap)
    mutableMap["idade"] =  30
    println(mutableMap)

    println(mutableMap.filter { it.equals("patrike") })
}