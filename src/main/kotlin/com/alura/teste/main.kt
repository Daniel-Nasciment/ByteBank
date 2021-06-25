import com.alura.modelo.Cliente
import com.alura.modelo.ContaPoupanca
import com.alura.modelo.totalContas

fun main() {


    val daniel = Cliente(
        nome = "Daniel",
        cpf = "111.111.111-11",
        senha = 12345
    )

    val contaPoupanca = ContaPoupanca(titular = daniel, conta = 1)
    val contaPoupanca1 = ContaPoupanca(titular = daniel, conta = 1)

    println("Total criadas: ${totalContas}")

}

