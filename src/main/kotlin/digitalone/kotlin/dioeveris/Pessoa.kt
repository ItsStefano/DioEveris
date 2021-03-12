package digitalone.kotlin.dioeveris

class Pessoa {
    var nome: String ="Luke"
    var cpf: String ="123.123.123-12"
    private set
}

fun main (){
    val Luke = Pessoa ()
    println(Luke.nome)
    println(Luke.cpf)


}
