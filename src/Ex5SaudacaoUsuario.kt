//Crie um algoritmo que leia o primeiro nome do usuário e escreva uma
//saudação para ele
fun main() {
    println("Olá, ${lerNomeUsuario()}! Seja muito bem-vinde! :)")
}

fun lerNomeUsuario(): String{
    println("Digite seu nome:")
    val nomeUsuario = readln()

    return nomeUsuario
}