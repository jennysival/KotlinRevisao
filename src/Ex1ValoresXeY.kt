//Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma
//dos números que não são múltiplos de 13 entre X e Y, incluindo
//ambos.
fun main() {
    lerValores()
}

fun lerValores(){
    println("Digite o valor de X:")
    val x = readln().toInt()

    println("Digite o valo de Y:")
    val y = readln().toInt()

    somarValores(x, y)
}

fun somarValores(x: Int, y: Int) {

    var soma = 0
    if(x%13==0 && y%13==0){
        println("Número múltiplo de 13")
    }
    else{
        soma = x+y
        println("$x + $y = $soma")
    }
}