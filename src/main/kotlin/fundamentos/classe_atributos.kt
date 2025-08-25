package org.example.fundamentos

class Carro(var cor: String, var anoFabricacao: Int, var dono: Dono) {
    override fun toString(): String {
        return "Cor: ${cor}, Ano Fabricação: ${anoFabricacao}, \nDono: ${dono}"
    }
}


class Dono(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Nome: ${nome}, Idade: ${idade}."
    }
}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Marcilio", 30))
//    println(carro.cor)
//    println(carro.anoFabricacao)
//    carro.cor = "Preto"
//    println(carro.cor)
//    println("Nome: ${carro.dono.nome} Idade: ${carro.dono.idade}")
    println(carro)
}