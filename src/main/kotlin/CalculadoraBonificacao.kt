class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registraFuncionario(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

    fun registraGerente(funcionario: Gerente){
        this.total += funcionario.bonificacao
    }

    fun registraDiretor(funcionario: Diretor){
        this.total += funcionario.bonificacao
    }

}