import com.alura.modelo.Endereco

fun main() {

    var enderecoNulo: Endereco? = Endereco("Rua teste")

    // ? SIGNIFICA QUE PODE SER NULL OU NÃO
    //SAFE CALL -> QUALQUER MEMBRO PRECISA DO '?'
    enderecoNulo?.logradouro?.length

    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }

}



