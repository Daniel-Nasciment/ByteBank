abstract class FuncionarioAdmin(
     nome: String,
     cpf: String,
     salario: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

/* O KOTLIN NÃO PERMITE A HERANÇA MULTIPLA, NA SITUAÇÃO EM QUESTÃO FOI NECESSÁRIO QUE FUNCIONARIO
ADMIN HERDASSE DE FUNCIONÁRIO PARA QUE A FUNCIONALIDADE DE AUTENTICAÇÃO SE CONSTRUA PARA O
GERENTE E DIRETOR */

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}