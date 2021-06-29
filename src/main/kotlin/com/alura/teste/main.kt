package com.alura.teste

import com.alura.modelo.Endereco


fun main() {

    // TESTANDO O WITH

    val endComp = with(Endereco()) {
        logradouro = "Rua teste"
        numero = 1234
        completo()
    }.let {
        println(it)
    }

}




