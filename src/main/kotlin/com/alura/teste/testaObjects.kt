package com.alura.teste

import com.alura.modelo.Cliente
import com.alura.modelo.Conta
import com.alura.modelo.ContaPoupanca

fun testaObjects() {
    val daniel = Cliente(
        nome = "Daniel",
        cpf = "111.111.111-11",
        senha = 12345
    )

    val contaPoupanca = ContaPoupanca(titular = daniel, conta = 1)
    val contaPoupanca1 = ContaPoupanca(titular = daniel, conta = 1)

    println("Total criadas: ${Conta.total}")
}