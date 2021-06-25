// PARA EXPECIFICAR QUE A CLASSE SERÁ HERDADA É NECESSÁRIO DEFINIR O OPEN
open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double

) {
    fun bonificacao(): Double {
        return salario * 0.1
    }
}