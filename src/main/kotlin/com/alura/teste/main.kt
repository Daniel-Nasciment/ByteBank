package com.alura.teste

import com.alura.modelo.Endereco


fun main() {
    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }

}

fun testeRecebeString(valor: String){

}


