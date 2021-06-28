package com.alura.teste

fun main() {

    val livro1 = Livro(
        titulo = "Livro 1",
        autor = "Autor 1",
        anoPublic = 2500
    )


    val livro2 = Livro(
        titulo = "Livro 2",
        autor = "Autor 2",
        anoPublic = 2005,
        editora = "Editora teste"
    )


    val livro3 = Livro(
        titulo = "Livro 3",
        autor = "Autor 3",
        anoPublic = 2010
    )


    val livro4 = Livro(
        titulo = "Livro 4",
        autor = "Autor 4",
        anoPublic = 1999,
        editora = "Editora teste"
    )

    // LIDANDO COM NULOS
    val listaLivros = mutableListOf<Livro>(livro1, livro2, livro3)
    // ELVIS OPERATOR ?: -> ME DA A CONDIÇÃO DE ALTERAR O VALOR QUANDO O VALOR DA ESQUERDA FOR NULL
    listaLivros.groupBy { it.editora ?: "Editora desconhecida"}
        .forEach{
            //EDITORA = CHAVE DO MAPA
            //LIVROS = CONTEUDO DO MAPA
            (editora: String?, livros: List<Livro>) ->
            println("${editora}: ${livros.joinToString { it.titulo }}")
        }
}

fun List<Livro?>.imprimeMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("### Lista de Livros ### \n$textoFormatado")
}

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublic: Long,
    val editora: String? = null
)




