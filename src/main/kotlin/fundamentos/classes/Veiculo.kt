package org.example.fundamentos.classes

open class Veiculo(var tipo: TipoVeiculo) {

    override fun toString(): String {
        return "Modelo: ${tipo}"
    }
}