fun main(args: Array<String>) {
    println("Seja Bem Vindo(a) ao Kotlin")
    var titular = "André"
    val numeroConta = 1000
    println("Titular $titular")
    println("Número da conta $numeroConta")

    usandoIfOuWhen()
}

fun usandoIfOuWhen() {
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000

    println("Saldo $saldo")

    // Usando IF
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    // Usando WHEN
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}