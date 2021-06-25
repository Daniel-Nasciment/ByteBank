package com.alura.modelo

class ContaCorrente(
    titular: Cliente,
    conta: Int
) : Conta(
    titular = titular,
    conta = conta
) {

    override fun saque(valor: Double) {
        val valorComTaxa = 0.1
        if(this.saldo >= valor){
            this.saldo -= (valor + valorComTaxa)
        }
    }

}