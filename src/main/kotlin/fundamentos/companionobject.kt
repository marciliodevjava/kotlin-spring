/**
 * Companion object e como se fosse um método static no java, a gente não precisar criar instanciar a classe com construtor.
 *
 */

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criaComValorPadrao(): MinhaClasse {
            return MinhaClasse("Marcilio", "Rua perdidos", 0)
        }
    }

    fun criarSegundaClass(segundaClasse: SegundaClasse): MinhaClasse {
        return MinhaClasse(nome = segundaClasse.nome, endereco = segundaClasse.endereco, idade = segundaClasse.idade)
    }

    override fun toString(): String {
        return "Nome: ${nome}, Endereco: ${endereco}, Idade: ${idade}"
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaComValorPadrao(): SegundaClasse {
        return SegundaClasse("Alessandra", "Rua encontrados", 0)
    }

    override fun toString(): String {
        return "Nome: ${nome}, Endereco: ${endereco}, Idade: ${idade}"
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 0).criaComValorPadrao()
    var minhaClasse = MinhaClasse.criaComValorPadrao()
    var terceiroEx = MinhaClasse("", "", 0).criarSegundaClass(segundaClasse)

    println(segundaClasse)
    println(minhaClasse)
    println(terceiroEx)
}