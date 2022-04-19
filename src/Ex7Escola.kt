//Uma escola possui um determinado número de turmas. Crie um
//algoritmo que leia a quantidade de turmas existentes na escola. Para
//cada turma, leia a quantidade de alunos e, para cada aluno, leia a sua
//média no semestre. Informe a média de cada uma das turmas

fun main() {
    lerTurmas()
}

fun lerTurmas(){
    println("Digite a quantidade de turmas da Escola:")
    val qtdTurmas =  readln().toInt()
    println("..........................................")

    val turmas = IntArray(qtdTurmas)

    for(i: Int in turmas.indices){
        println("Digite a quantidade de alunos da ${i+1}ª turma:")
        turmas[i] = readln().toInt()
        println("..........................................")
    }

    lerNotas(qtdTurmas, turmas)
}

fun lerNotas(qtdTurmas: Int, turmas: IntArray) {
    val notas = IntArray(qtdTurmas)

    for(i: Int in notas.indices){
        var soma=0
        var media=0
        for(n in 1..turmas[i]){
            println("Digite a média do ${n}º aluno da ${i+1}ª turma:")
            val nota = readln().toInt()
            soma = soma+nota
            media = soma/turmas[i]
            println(".......................................")
        }
        notas[i] = media
    }

    println("            R E S U L T A D O            ")

    for(i: Int in notas.indices){

        println("---------------------------------------")
        println("A média da ${i+1}ª turma foi: ${notas[i]}")
    }
}