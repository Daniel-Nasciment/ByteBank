package com.alura.modelo

abstract class Conta(
    val titular: Cliente,
    val conta: Int
) {
    var saldo = 0.0
        protected set

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