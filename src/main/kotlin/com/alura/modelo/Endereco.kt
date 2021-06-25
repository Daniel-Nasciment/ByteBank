package com.alura.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0
) {
    override fun toString(): String {
        return """
            |Endereco(logradouro='$logradouro', 
            |numero=$numero)""".trimMargin()
    }
}
