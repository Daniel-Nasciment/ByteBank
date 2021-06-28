package com.alura.teste


fun main() {

    val minhaFuncaoLambda: (Int, Int) -> Int = {a, b ->
        a + b
    }

    println(minhaFuncaoLambda(1, 1))

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int{
        return a + b
    }

    println(minhaFuncaoAnonima(2, 2))

}

fun teste(a: Int, b: Int): Int = a + b

class Teste : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2


}




