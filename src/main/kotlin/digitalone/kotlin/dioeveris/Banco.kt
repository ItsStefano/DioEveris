package digitalone.kotlin.dioeveris

data class Banco(val nome: String, val numero: Int) {


    fun info() = "$nome e $numero"
}
