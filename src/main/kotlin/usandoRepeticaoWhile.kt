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