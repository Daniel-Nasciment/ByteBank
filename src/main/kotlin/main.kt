fun main() {
    println("Bem vindo ao ByteBank")

    val contaDaniel = Conta("Daniel", 12345)
    contaDaniel.deposito(200.0)

    contaDaniel.deposito(800.0)

    val contaMarco = Conta("Marco",54321)
    contaMarco.deposito(300.0)

    contaDaniel.transferencia(500.0, contaMarco)

    println(contaDaniel.saldo)
    println(contaMarco.saldo)

}

class Conta(var titular: String, var conta: Int) {
    var saldo = 0.0
        private set(valor) {
            if (valor > 0) field = valor
        }

    fun deposito(valor: Double) {
        this.saldo += valor
    }

    fun saque(valor: Double) {

        if (this.saldo < valor) {
            println("Você não possui saldo suficiente!")
        } else {
            this.saldo -= valor
        }
    }

    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }
}
