//Leia um valor e faça um programa que coloque o valor lido na
//primeira posição de um vetor de tamanho 10. Em cada posição
//subsequente, coloque o dobro do valor da posição anterior. Por
//exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e
//assim sucessivamente. Mostre o vetor em seguida.

fun main() {
    preencherExibirVetor()
}

fun criarVetor(): IntArray{
    val vetorNumeros = IntArray(10)

    println("Digite o primeiro número do vetor:")
    vetorNumeros[0] = readln().toInt()

    return vetorNumeros
}

fun preencherExibirVetor(){
    val vetorNumeros = criarVetor()

    for(i in 1..9){
        vetorNumeros[i] = vetorNumeros[i-1]*2
    }

    vetorNumeros.forEachIndexed { index, i -> println("${index+1}: $i") }
}