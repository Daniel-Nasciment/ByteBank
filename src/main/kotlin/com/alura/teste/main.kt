package com.alura.teste


fun main() {

    // LAMBDA@ É UMA LABEL QUE PODE SER QUAQUER COISA E É UTILIZADO QUANDO PODEMOS
    // ESPERAR MAIS DE UM RETORNO EM UMA EXPRESSÃO LAMBDA
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if(salario < 1000.0){
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }

    println(calculaBonificacao(100.0))

}

fun teste(a: Int, b: Int): Int = a + b

class Teste : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2


}




