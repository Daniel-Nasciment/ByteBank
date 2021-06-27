fun main() {

    val idades: IntArray = intArrayOf(10, 15, 18, 20)

    // MAIOR NÚMERO OU NULL
    val maiorIdade = idades.maxOrNull()

    // MENOR NÚMERO OU NULL
    val menorIdade = idades.minOrNull()

    println(maiorIdade)
    println(menorIdade)

    // CALCULA A MÉDIA
    val media = idades.average()

    println(media)

    // .ALL RETORNA TRUE QUANDO TODOS OS VALORES SATISFAZEREM A CONDIÇÃO
    val todos = idades.all { it > 18 }

    // .ANY RETORNA TRUE QUANDO APENAS UMA SATISFIZER A CONDIÇÃO
    val algum = idades.any { it > 18 }

    // CRIA UMA LISTA ONDE SATISFAZ A CONDIÇÃO
    val listaMaiores = idades.filter { it >= 18 }
    println(listaMaiores)

    // RETORNA O PRIMEIRO ITEM QUE SATISFAZ A CONDIÇÃO, OU SEJA, SE TIVER DOIS VALORES IGUAIS
    // O MÉTODO FIND RETORNARÁ O PRIMEIRO
    val busca = idades.find { it == 18 }


}




