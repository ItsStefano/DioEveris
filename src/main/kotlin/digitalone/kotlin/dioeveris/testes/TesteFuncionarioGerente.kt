package digitalone.kotlin.dioeveris.testes
import digitalone.kotlin.dioeveris.Gerente

fun main (){

    val Ge = Gerente("Ge Daltro", "321.321.321-32", 5000.0)
    ImprimeRelatorioFuncionario.Imprime(Ge)
}

// fun imprimeRelatorio (funcionario: Funcionario) = println (funcionario.toString())
// método alternativo de imprimir o relatório
