package digitalone.kotlin.dioeveris

class Pessoa {
    var nome: String ="Luke"
    var cpf: String ="123.123.123-12"
    private set

    constructor()

    fun pessoaInfo ()  = "$nome e $cpf"

}

fun main (){
    val Luke = Pessoa ()
    println(Luke.pessoaInfo())


}
