package com.alura.teste


fun main() {

    val pedidos = listOf<Pedido>(
        Pedido(1, 50.0),
        Pedido(2, 60.0),
        Pedido(3, 70.0),
        Pedido(4, 80.0),
        Pedido(5, 90.0)
    )

    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    val pedidosFrete: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor > 50.0 }

    println(pedidosMapeados)
    println(pedidosFrete)
}


data class Pedido(
    val numero: Int,
    val valor: Double
) {

}




