fun main() {

    // UTILIZANDO HERANÇA
    var contaCorrente = ContaCorrente(
        titular = "Daniel",
        conta = 12345
    )

    // UTILIZANDO HERANÇA
    var contaPoupanca = ContaPoupanca(
        titular = "Marco",
        conta = 54321
    )

    contaCorrente.deposito(1000.0)
    contaPoupanca.deposito(1000.0)

    println("Saldo corrente antes do saque: ${contaCorrente.saldo}")


    contaCorrente.saque(100.0)
    println("Saldo corrente após o saque: ${contaCorrente.saldo}")

    // UTILIZAÇÃO DO POLIMORFISMO
    contaPoupanca.transferencia(200.0, contaCorrente)
    println("Saldo pupança após transferência: ${contaPoupanca.saldo}")
    println("Saldo corrente após o transferencia: ${contaCorrente.saldo}")

}
