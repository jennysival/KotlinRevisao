//Escreva um algoritmo que leia a quantidade de funcionários em uma
//empresa e, para cada funcionário leia seu nome e seu tempo de
//serviço (em meses). Se o funcionário possuir mais de 12 meses na
//empresa, escreva a mensagem “<NOME>tem direito a férias”. Caso
//contrário, escreva a mensagem “<NOME>não tem direito a férias”. Ao
//final, exiba quantos funcionários possuem direito a férias e quantos
//não possuem
fun main() {
    cadastroFuncionarios()
}

fun cadastroFuncionarios(){
    println("Digite a quantidade de funcionários:")
    val qtdFuncionarios = readln().toInt()

    val vetorFuncionarios = arrayOfNulls<String>(qtdFuncionarios)
    val vetorTempoDeServico = IntArray(qtdFuncionarios)

    for(i: Int in vetorFuncionarios.indices){
        println("Digite o nome do ${i+1}º funcionário:")
        vetorFuncionarios[i] = readln()
        println("Digite o tempo de serviço de ${vetorFuncionarios[i]}:")
        vetorTempoDeServico[i] = readln().toInt()
    }

    calcularFerias(vetorFuncionarios, vetorTempoDeServico)
}

fun calcularFerias(vetorFuncionarios: Array<String?>, vetorTempoDeServico: IntArray) {

    var somaTemFerias = 0
    var somaNaoTemFerias = 0

    for(i: Int in vetorFuncionarios.indices){
        println("------------------------------")
        if(vetorTempoDeServico[i] > 12){
            somaTemFerias = somaTemFerias+1
            println("${vetorFuncionarios[i]} tem direito a férias.")
        }
        else{
            somaNaoTemFerias = somaNaoTemFerias+1
            println("${vetorFuncionarios[i]} não tem direito a férias")
        }
    }

    println("------------------------------")
    println("$somaTemFerias funcionários têm direito à férias")
    println("$somaNaoTemFerias funcionários não têm direito à férias")
}