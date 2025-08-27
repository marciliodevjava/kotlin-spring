package org.example.fundamentos.classes

fun main(){
    var carro: Veiculo = Carro("VW", 2015, TipoVeiculo.TERRESTRE)
    println(carro)

    var carroDois: Carro = Carro("VW - UP", 2015, TipoVeiculo.TERRESTRE)
    carroDois.ligar()
    println(carroDois)
    carroDois.desligar()
}