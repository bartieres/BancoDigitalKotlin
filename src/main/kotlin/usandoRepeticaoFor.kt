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