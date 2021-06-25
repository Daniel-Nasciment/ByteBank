class ContaCorrente(
    titular: String,
    conta: Int
) : Conta(
    titular = titular,
    conta = conta
) {

    override fun saque(valor: Double) {
        val valorComTaxa = 0.1
        super.saque(valor + valorComTaxa)
    }

}