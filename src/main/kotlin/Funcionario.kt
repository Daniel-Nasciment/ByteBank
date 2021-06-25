// ABSTRACT É AUTOMATICAMENTE UMA CLASSE OPEN -> HABILITADA PARA HERANÇA
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double

) {
    // AO DEFINIR UM COMPORTAMENTO ABSTRATO
    // CADA FILHO TERA SUA PRÓPRIA IMPLEMENTAÇÃO *OBRIGATÓRIA*
    abstract val bonificacao: Double
}