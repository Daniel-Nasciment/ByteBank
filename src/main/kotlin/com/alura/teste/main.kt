package com.alura.teste


fun main() {

    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))

    val minhaFuncaoSomaClasse: (Int, Int) -> Int = Teste()
    println(minhaFuncao(10, 10))

}

fun soma(a: Int, b: Int): Int = a + b


class Teste : (Int, Int) -> Int {

    override fun invoke(p1: Int, p2: Int): Int = p1 + p2

}




