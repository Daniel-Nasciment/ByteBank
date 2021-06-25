import com.alura.modelo.Cliente
import com.alura.modelo.ContaCorrente
import com.alura.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val daniel = Cliente(
        nome ="Daniel",
        cpf = "111.111.111-11",
        senha = 12345
    )

    val marco = Cliente(
        nome ="Marco",
        cpf = "222.222.222-22",
        senha =12345
    )


    val contaDaniel = ContaCorrente(daniel, 12345)
    contaDaniel.deposito(1000.0)

    contaDaniel.saque(200.0)
    println("Valor após saque: ${contaDaniel.saldo}")

    contaDaniel.deposito(800.0)

    val contaMarco = ContaPoupanca(marco, 54321)
    contaMarco.deposito(300.0)

    contaDaniel.transferencia(500.0, contaMarco)

    println(contaDaniel.saldo)
    println(contaMarco.saldo)


}