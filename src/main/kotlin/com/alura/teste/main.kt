package com.alura.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    // COMO É UM ARRAY NÃO PRIMITIVO DA LINGUAGEM DEVEMOS SETAR OS VALORES DE INICIALIZAÇÃO
    val salarios = bigDecimalArrayOf("1500.0", "2050.45", "5000.0", "2300.0")

    // CONTENT TOSTRING RETORNA A STRING DO ARRAY
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> =
        salarios.map { salario ->
            calculaAumento(salario, aumento)
        }.toTypedArray()

    println(salariosComAumento.contentToString())


    // DO MENOR PARA O MAIOR

    /*val salariosOrdenados = salariosComAumento.sorted()
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
    val media = tresUltimosSalarios.media()*/

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()


    println(media)


}

private fun calculaAumento(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        // SETSCALE (QUANRTIDADE DE CASAS, MÉTODO DE ARREDONDAMENTO)
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

// VARARGS RETORNA UM ARRAY COM A QUANTIDADE DE VALORES CONTIDOS
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    // COMO 'VALORES É UM ARRAY' -> SIZE SERIA O TAMANHO DO MESMO
    return Array<BigDecimal>(valores.size) {
        // I -> INDICE DO ARRAY -> VARIAÇÃO DE ACORDO COM O TAMANHO DO ARRAY (DE 0 A 2 POR EX)
            i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {

    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}




