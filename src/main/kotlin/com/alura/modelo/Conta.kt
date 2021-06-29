package com.alura.modelo

import com.alura.exception.FalhaAutenticacaoException
import com.alura.exception.SaldoInsufucienteException

var totalContas = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val conta: Int
): Autenticavel {
    var saldo = 0.0
        protected set

   companion object Contador{
        var total = 0
            private set

    }

    init {
        Contador.total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposito(valor: Double) {
        this.saldo += valor
    }

   abstract fun saque(valor: Double)

    fun transferencia(valor: Double, destino: Conta, senha: Int){
        if (this.saldo < valor){
            throw SaldoInsufucienteException()
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        this.saldo -= valor
        destino.deposito(valor)
    }
}