class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    // ESSE TIPO DE IMPLEMENTAÇÃO FUNCIONARIA PARA QUALQUER ESPECIFICAÇÃO DE FUNCIONÁRIO
    // (GERENTE E DIRETOR NESSE CASO)
    // UTILIZAÇÃO DE COISAS MAIS GENÉRICAS -> POLIMORFISMO
    fun registraFuncionario(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

}