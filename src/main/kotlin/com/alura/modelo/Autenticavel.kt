package com.alura.modelo

interface Autenticavel {

    // É POSSIVEL REALIZAR A IMPLEMENTAÇÃO DO MÉTODO DENTRO DA INTERFACE
    // PORÉM SERIA NECESSÁRIO A CRIAÇÃO DE UM CAMPO DO TIPO SENHA -> É UM DADO SENSIVÉL
    // ENTÃO NÃO É RECOMENDÁVEL POR ESSA QUESTÃO

    fun autentica(senha: Int): Boolean

}