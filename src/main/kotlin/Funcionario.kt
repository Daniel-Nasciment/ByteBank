// ABSTRACT É AUTOMATICAMENTE UMA CLASSE OPEN -> HABILITADA PARA HERANÇA
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double

) {
    open val bonificacao: Double get() = salario * 0.1
}