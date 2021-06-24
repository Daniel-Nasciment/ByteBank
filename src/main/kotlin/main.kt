fun main() {
    println("Bem vindo ao ByteBank")
    val conta = Conta()
    conta.titular = "Daniel"
    conta.conta = 12345
    conta.saldo = 200.0

    println(conta.titular)
    println(conta.conta)
    println(conta.saldo)
}

class Conta {
    var titular = ""
    var conta = 0
    var saldo = 0.0
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta positiva!")
    }

    when {
        saldo == 0.0 -> println("Conta neutra!")
    }

    var i = 0
    while (i < 10){
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