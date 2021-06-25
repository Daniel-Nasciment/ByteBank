import com.alura.modelo.Cliente
import com.alura.modelo.Diretor
import com.alura.modelo.Gerente
import com.alura.modelo.SistemaInterno

fun testaFuncionariosAutenticacao() {

    var daniel = Gerente(
        "Daniel",
        "222.222.222-22",
        1000.0,
        12345
    )

    var marco = Diretor(
        "Marco",
        "333.333.333-33",
        1000.0,
        54321,
        100.0
    )

    var nicolas = Cliente(
        "Daniel",
        "222.222.222-22",
        12345
    )


    var sistema = SistemaInterno()

    sistema.entra(daniel, 12345)
    sistema.entra(nicolas, 12345)

}
