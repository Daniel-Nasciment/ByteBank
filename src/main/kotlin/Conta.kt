abstract class Conta(val titular: String, val conta: Int) {
    var saldo = 0.0
        protected set
// QUANDO A CLASSE SE TORNA ABSTRATA, DEVE DEFINIR O SETER DO CAMPO QUE SERA ALTERADO COMO
// PROTECTED

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