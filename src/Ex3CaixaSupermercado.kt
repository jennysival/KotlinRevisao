//Escreva um algoritmo que simule o funcionamento de um caixa de
//supermercado.
//O seu algoritmo deve receber da pessoa usuária a
//informação de quantos produtos o cliente comprou e, para cada
//produto, deverá ler o seu preço. Ao final, deverá informar quanto o
//cliente deve pagar pelas compras
fun main() {
    val valorDaVenda = calcularValorVenda()

    println("-----------------------------------")
    println("O total da venda foi: R$$valorDaVenda")
    println("-----------------------------------")
}

fun cadastroVenda(): DoubleArray{
    println("Digite a quantidade de produtos:")
    val qtdProdutos = readln().toInt()

    val vetorCompras = DoubleArray(qtdProdutos)

    return vetorCompras
}

fun adicionarValoresDosProdutos(): DoubleArray{
    val vetorCompras = cadastroVenda()

    for(i: Int in vetorCompras.indices){
        println("Digite o preço do ${i+1}º produto:")
        vetorCompras[i] = readln().toDouble()
    }

    return vetorCompras
}

fun calcularValorVenda(): Double{
    val vetorCompras = adicionarValoresDosProdutos()

    var soma = 0.0
    for(i: Int in vetorCompras.indices){
        soma = soma+vetorCompras[i]
    }

    return soma
}