package digitalone.kotlin.dioeveris.testes

import digitalone.kotlin.dioeveris.Banco

fun main() {
    val diobank = Banco ("DioBank", 12 )

    println(diobank.nome)
    println(diobank.numero)

    val banco2 = diobank.copy("Banco2")

    println(banco2.info())
}