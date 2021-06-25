package com.alura.modelo

import com.alura.exception.SaldoInsufucienteException

var totalContas = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val conta: Int
) {
    var saldo = 0.0
        protected set

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

    fun transferencia(valor: Double, destino: Conta){
        if (this.saldo < valor){
            throw SaldoInsufucienteException()
        }
        this.saldo -= valor
        destino.deposito(valor)
    }
}