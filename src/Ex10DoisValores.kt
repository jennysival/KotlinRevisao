//Crie um algoritmo que leia dois valores (x e y) e informe se eles são
//iguais
fun main() {
    compararDoisValores()
}

fun lerDoisValores(): IntArray{
    val valores = IntArray(2)

    for(i in 0..1){
        println("Digite o ${i+1}º número:")
        valores[i] = readln().toInt()
    }

    return valores
}

fun compararDoisValores(){
    val valores = lerDoisValores()

    if(valores[0] != valores[1]){
        println("Os números digitados são diferentes")
    }
    else{
        println("Os números digitados são iguais")
    }
}