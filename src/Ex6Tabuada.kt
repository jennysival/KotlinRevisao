//Crie um algoritmo, utilizando laços de repetição aninhados, que exiba
//na tela a tabuada de multiplicação dos números de 1 a 9

fun main() {
    gerarTabuadas()
}

fun gerarTabuadas(){

    for(tab in 1..9){
        for(i in 1..10){
            var resultado = (tab)*i
            println("$tab x $i = $resultado")
        }
        println("------------")
    }
}