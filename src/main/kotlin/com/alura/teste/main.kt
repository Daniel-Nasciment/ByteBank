package com.alura.teste


fun main() {

    val minhaFuncaoLambda: () -> Unit = {
        println("Retornando função LAMBDA")
    }

    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun(){
        println("Retornando função anonima")
    }

    println(minhaFuncaoAnonima())

}

fun teste(){

}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke teste")
    }

}




