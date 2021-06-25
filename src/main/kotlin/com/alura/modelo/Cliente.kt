package com.alura.modelo


// AO FAZER UM IMPORT ONDE AS CLASSES POSSUEM O MESMO NOME É NECESSÁRIO A UTILIZAÇÃO DO 'AS'

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {

        if (this.senha == senha) {
            return true
        }
        return false
    }
}
