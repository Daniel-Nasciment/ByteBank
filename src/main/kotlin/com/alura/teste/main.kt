import com.alura.modelo.Endereco

fun main() {

    // CONSTRUÇÃO DE UM ARRAY
    val idades = intArrayOf(20, 21, 22, 23, 24)

    var maiorIdade = 0
    // PERCORRENDO COM FOR NORMAL
    for (idade in idades){
        if (idade > maiorIdade){
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    // PERCORRENDO COM FOREACH
    idades.forEach { idade ->
        if (idade < menorIdade) menorIdade = idade
    }

    println(menorIdade)

}




