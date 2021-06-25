fun main() {

    var daniel = Funcionario(
        nome = "Daniel",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    var marco = Gerente(
        nome = "Marco",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 12345
    )

    var nicolas = Diretor(
        nome = "Nicolas",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 12345,
        plr = 100.0
    )

    var calculadora = CalculadoraBonificacao()

    calculadora.registraFuncionario(daniel)
    calculadora.registraGerente(marco)
    calculadora.registraDiretor(nicolas)

    println("Total de bonificação: ${calculadora.total}")
}
