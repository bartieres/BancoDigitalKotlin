fun main(args: Array<String>) {
    println("Seja Bem Vindo(a) ao Kotlin")

    var saldo = 10.0
    println("Saldo $saldo")

    usandoIfOuWhen(saldo)
    usandoRepeticaoFor()
    usandoRepeticaoWhile()
}

fun usandoIfOuWhen(saldo: Double) {

    println(">>>>>>>>>> IF/ WHEN")

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

    println("<<<<<<<<<< IF/ WHEN")
}

fun usandoRepeticaoFor() {

    println(">>>>>>>>>> FOR")

    for (i in 1..5) {
        var titular = "André $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo $saldo")
        println("--")
    }

    println("com downTo \n")

    for (i in 5 downTo 1) {

        var titular = "André $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo $saldo")
        println("--")
    }

    println("<<<<<<<<<< FOR")
}

fun usandoRepeticaoWhile() {

    println(">>>>>>>>>> WHILE")

    var i = 0

    while (i < 5) {
        var titular = "André $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo $saldo")
        println("--")

        i++
    }

    println("<<<<<<<<<< WHILE")
}