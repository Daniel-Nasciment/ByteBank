import com.alura.modelo.Endereco
import java.lang.ArithmeticException
import java.lang.ClassCastException

fun main() {
    println("início main")


    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println(e.stackTrace)


    }
    println("fim funcao2")
}


