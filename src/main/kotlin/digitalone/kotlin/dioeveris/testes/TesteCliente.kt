package digitalone.kotlin.dioeveris.testes

import digitalone.kotlin.dioeveris.Cliente
import digitalone.kotlin.dioeveris.ClienteTipo

fun main () {
    val Jose = Cliente (
        nome = "José da Silva",
        "123.456.789-00",
        clienteTipo = ClienteTipo.PF,
        "123456"
            )
    println (Jose)

    TesteAutenticacao().autentica(Jose)
}