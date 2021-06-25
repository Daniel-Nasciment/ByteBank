package com.alura.modelo

class ContaPoupanca(
    titular: Cliente,
    conta: Int
) : Conta(
    titular = titular,
    conta = conta
) {
    override fun saque(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}