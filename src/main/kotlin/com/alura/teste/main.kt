package com.alura.teste

import com.alura.modelo.Endereco


fun main() {

//    val endereco = Endereco(logradouro = "Rua teste", numero = 1000)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)


    // ESSE CÓDIGO SERIA O MESMO QUE O DE CIMA
    // CHAMADA ENCADEADA PARA EVITAR A CRIAÇÃO DE VARIÁVEIS É BEM COMUM
    Endereco(logradouro = "Rua teste", numero = 1000)
        .let {endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }
        .let (::println)

    soma(1, 1){
        println(it)
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    // lazy evaluation -> só vai ser executado se houver chamada
    resultado(a + b)
}




