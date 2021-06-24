fun main() {
    println("Bem vindo ao ByteBank")

    //ISSO É UMA VARIÁVEL QUE REFERENCIA UM OBETO DO TIPO CONTA
    //ISSO É UMA VARIÁVEL QUE REFERENCIA UM OBETO DO TIPO CONTA
    val contaDaniel = Conta()
    contaDaniel.titular = "Daniel"
    contaDaniel.conta = 12345
    contaDaniel.setSaldo(200.0)

    contaDaniel.deposito(800.0)

    val contaMarco = Conta()
    contaMarco.titular = "Marco"
    contaMarco.conta = 54321
    contaMarco.setSaldo(300.0)

    contaDaniel.transferencia(500.0, contaMarco)

    println(contaDaniel.getSaldo())
    println(contaMarco.getSaldo())

}


class Conta {
    var titular = ""
    var conta = 0
    private var saldo = 0.0

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            this.saldo = valor
        }
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

    // PARA DEFINIR O RETORNO DE UMA FUNÇÃO:
    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta positiva!")
    }

    when {
        saldo == 0.0 -> println("Conta neutra!")
    }

    var i = 0
    while (i < 10) {
        i++
        println(i)
    }


//    for (i in 0..3) {
//        println(i)
//    }
//
//    for (i in 4 downTo 0 step 2) {
//        // DOWNTO - DE TRAZ PARA FRENTE
//        // STEP - DE 2 EM 2
//        println(i)
//        println()
//    }

}