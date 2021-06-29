package com.alura.teste


fun main() {

    // PARA A DEVIDA UTILIZAÇÃO É BEM RECOMENDÁVEL CONSULTAR NA DOCUMENTAÇÃO


    // IT -> OBJETO DE CONTEXTO QUE É ACESSIVEL ATRVÉS DE LAMBDA
    // THIS -> RECEPTOR

    // FUNÇÃO DE ESCOPO TEM RETORNOS DIFERENTES


    /*
    * LET:
    *
    * Tem o objeto de contexto como argumento e um retorno com lambda
    * Quando queremos trabalhar no resultado com uma ou mais operações
    */

    /*
    * WITH E RUN SÃO SIMILARES:
    *
    * .run {
    *
    * }
    *
    * Não é uma função de extensão
    * with( object )
    * resultado retornado com lambda
    *
    */


  /*
  * QUAL E QUANDO UTILIZAR ?
  *
  * LET -> QUANDO OPERAR COM O RESULTADO DE UMA OU MAIS FUNÇÕES E COM VALORES NULOS
  *     -> CRIAR VARIÁVEL COM UM ESCOPO MAIS LIMITADO COM ALGUMA MODIFICAÇÃO
  *
  * WITH -> NÃO É UMA FUNÇÃO DE EXTENSÃO
  *      -> CHAMA MEMBROS DO OBJETO DE CONTEXTO DIRETAMENTE
  *      -> TAMBÉM É USADO PARA COMPUTAR ALGO COM O RECEPTOR E RETORNAR O VALOR
  *      -> EM CÓDIGO LEMOS "COM ESSE OBJETO, FAÇA"
  *
  * RUN -> SIMILAR AO LET, MAS O USO É PARECIDO COM WITH
  *     -> UTILIZA NA INICIALIZAÇÃO DE UM OBJETO
  *     -> RETORNA A COMPUTAÇÃO DO OBJETO
  *
  * APPLY -> RECEBE E RETORNA O OBJETO DE CONTEXTO
  *       -> CONFIGURA O OBJETO DE CONTEXTO SEM FAZER COMPUTAÇÕES
  *       -> EM CÓDIGO LEMOS "APLIQUE AS SEGUINTES ATRIBUIÇÕES AO OBJETO"
  *
  * ALSO -> TRABALHA COM ARGUMENTO
  *      -> REALIZA AÇÕES A MAIS QUE NÃO MODIFICA O OBJETO
  *      -> A REMOÇÃO DO ALSO NÃO DEVE AFETAR O PROGRAMA
  *      -> EM CÓDIGO LEMOS "TAMBÉM FAÇA ISSO"
  *
  * */


}




