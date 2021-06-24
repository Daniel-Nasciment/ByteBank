fun main() {
    println("Bem vindo ao ByteBank")

    val titular = "Daniel"
    val numeroConta = 12345
    var saldo = 0.0
    saldo = 100.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")


    // IF E WHEN SÃO EQUIVALENTES

    if (saldo > 0.0){
        println("Conta positiva!")
    }

    when {
        saldo == 0.0 -> println("Conta neutra!")
    }
}