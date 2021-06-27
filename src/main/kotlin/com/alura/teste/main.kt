fun main() {

    val series: IntRange = 1.rangeTo(10)

    for (s in series){
        print("${s} ")
    }


    println()

    // A DECLARAÇÃO A CIMA É A MESMA QUE:

    // SETEP -> VAI SER CONTADO DE 2 EM 2
    // 0.until(10) -> Não inclusiva, ou seja, não vai até o 10
    
    val numeros = 1..10 step 2
    // DENTRO DO FOR -> O IN ATRIBUI A VARIAVEL NUMERO CADA ITEM DE NUMEROS
    for (numero in numeros){
        print("${numero} ")
    }


    // DECRECENTE

    println()

    val decrescentes = 10 downTo 0 step 2

    decrescentes.forEach { print("${it} ") }


    println()


    val intervalo = 1000.0..5000.0
    val salario = 3500.0

    // DENTRO DO IF -> O IN VERIFICA SE TAL VALOR ESTÁ DENTRO DO INTERVALO
    if(salario in intervalo){
        println("True")
    }else{
        println("False")
    }

}




