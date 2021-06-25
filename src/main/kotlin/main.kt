fun main() {

    testaFuncionarios()

}

fun testaFuncionarios() {

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

    var sistema = SistemaInterno()

    sistema.entra(daniel, 1234)




}
