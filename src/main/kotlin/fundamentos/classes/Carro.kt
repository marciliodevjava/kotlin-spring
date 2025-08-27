package org.example.fundamentos.classes

class Carro(
    internal var marca: String,
    internal var ano: Int,
    tipo: TipoVeiculo):
    Veiculo(tipo), Motor{

    override fun toString(): String {
        return "Marca: ${marca}, Ano: ${ano}, Tipo: ${super.toString()}"
    }

    override fun ligar() {
        println("Ligando o motor")
    }
}