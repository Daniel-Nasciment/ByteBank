package com.alura.modelo

// ESSA ABORADAGEM N É RECOMENDADA
// NESSE EXEMPLO SE EU TIVESSE OUTRAS CLASSES DENTRO DESSE ARQUIVO EU CONSEGUIRIA EFETUAR
// A ALTERAÇÃO NO CONTADOR

var totalContas = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val conta: Int
) {
    var saldo = 0.0
        protected set

    // OBJECT DECLARATION - COMPANION -> SIGNIFICA QUE FAZ PARTE DA CLASSE
    // NÃO É NECESSÁRIO DEFINIR NOME, POR PADRÃO VEM IMPLICITO COMO COMPANION
   companion object Contador{
        var total = 0
            private set

    }

    init {
        println("Criando conta")
        Contador.total++
    }

    fun deposito(valor: Double) {
        this.saldo += valor
    }

   abstract fun saque(valor: Double)

    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }
}