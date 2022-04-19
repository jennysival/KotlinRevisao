//Uma loja de animais vende gatos e cachorros. Escreva um algoritmo
//que leia a quantidade de animais da loja e, para cada animal, leia a
//informação do tipo do animal (se é gato ou cachorro). Ao final, exiba a
//quantidade de animais que são gatos e a quantidade de animais que
//são cachorros existentes na loja
fun main() {
    estoqueDeAnimais()
}

fun estoqueDeAnimais(){
    println("Digite a quantidade total de animais da loja:")
    val qtdAnimais = readln().toInt()

    verificaGatoOuCachorro(qtdAnimais)
}

fun verificaGatoOuCachorro(qtdAnimais: Int) {
    var gato = "gato"
    var cachorro = "cachorro"

    var contaGato = 0
    var contaCachorro = 0
    var outrosAnimais = 0

    for(i in 1..qtdAnimais){
        println("Digite a espécie do ${i}º animal:")
        val opcDigitada = readln()

        when(opcDigitada){
            gato -> contaGato=contaGato+1
            cachorro -> contaCachorro=contaCachorro+1
            else -> outrosAnimais=outrosAnimais+1
        }
    }

    exibirEstoqueDeAnimais(contaGato, contaCachorro, outrosAnimais)
}

fun exibirEstoqueDeAnimais(contaGato: Int, contaCachorro: Int, outrosAnimais: Int) {
    println("--------------------------------")
    println("Em seu estoque há:")
    println("* $contaGato gatos;")
    println("* $contaCachorro cachorros;")
    println("* $outrosAnimais outros animais.")
    println("--------------------------------")
}

