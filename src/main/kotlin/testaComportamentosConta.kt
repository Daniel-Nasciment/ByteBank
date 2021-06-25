fun testaComportamentosConta() {
    val contaDaniel = ContaCorrente("Daniel", 12345)
    contaDaniel.deposito(1000.0)

    contaDaniel.saque(200.0)
    println("Valor após saque: ${contaDaniel.saldo}")

    contaDaniel.deposito(800.0)

    val contaMarco = ContaPoupanca("Marco", 54321)
    contaMarco.deposito(300.0)

    contaDaniel.transferencia(500.0, contaMarco)

    println(contaDaniel.saldo)
    println(contaMarco.saldo)


}