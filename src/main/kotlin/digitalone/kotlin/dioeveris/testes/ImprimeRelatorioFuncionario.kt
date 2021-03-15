package digitalone.kotlin.dioeveris.testes

import digitalone.kotlin.dioeveris.Funcionario
import digitalone.kotlin.dioeveris.Gerente

class ImprimeRelatorioFuncionario {
    companion object {
        fun Imprime (funcionario: Funcionario) {
            println( funcionario.toString())
        }

        fun Imprime(Gerente: Gerente) {
            println (Gerente.toString())

        }

    }
}