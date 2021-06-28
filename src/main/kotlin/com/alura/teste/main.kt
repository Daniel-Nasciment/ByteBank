package com.alura.teste

fun main() {

    val livro1 = Livro(
        titulo = "Livro 1",
        autor = "Autor 1",
        anoPublic = 2000
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
        anoPublic = 2020,
        editora = "Editora teste"
    )


    val listaLivros = mutableListOf<Livro>(livro1, livro2, livro3)


    listaLivros.add(livro4)

    listaLivros.imprimeMarcadores()
}

fun MutableList<Livro>.imprimeMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
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




