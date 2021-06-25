fun testaComportamentosConta() {
    val contaDaniel = Conta("Daniel", 12345)
    contaDaniel.deposito(200.0)

    contaDaniel.deposito(800.0)

    val contaMarco = Conta("Marco", 54321)
    contaMarco.deposito(300.0)

    contaDaniel.transferencia(500.0, contaMarco)

    println(contaDaniel.saldo)
    println(contaMarco.saldo)
}