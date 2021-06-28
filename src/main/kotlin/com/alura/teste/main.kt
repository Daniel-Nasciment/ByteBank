package com.alura.teste


fun main() {

    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())
}

fun teste(){

}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke teste")
    }

}




