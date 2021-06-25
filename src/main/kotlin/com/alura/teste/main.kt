import com.alura.modelo.Endereco

fun main() {

    val salarios = doubleArrayOf(200.0, 300.0, 400.0, 500.0, 600.0)

    var aumento = 1.1
    var indice = 0

    for (salario in salarios){
        salarios[indice] = salario * aumento
        indice++
    }

    for (indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.indices)

}




