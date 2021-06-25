open class Conta(val titular: String, val conta: Int) {
    var saldo = 0.0
        private set

    fun deposito(valor: Double) {
        this.saldo += valor
    }

   open fun saque(valor: Double) {

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