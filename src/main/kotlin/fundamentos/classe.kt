package fundamentos;

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome} \nIdade ${idade} \n"
    }
}

fun main() {
    var marcilio = Pessoa("Marcilio Zanatta", 30)
    println(marcilio)
    println("Nome: " + marcilio.nome +" Idade: " + marcilio.idade )
}