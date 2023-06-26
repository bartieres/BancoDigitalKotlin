fun main(args: Array<String>) {
    println("Seja Bem Vindo(a) ao Kotlin")

    var saldo = 10.0
    println("Saldo $saldo")

    usandoIfOuWhen(saldo)
    usandoRepeticaoFor()
    usandoRepeticaoWhile()
    testaCopiaEReferencias()

    println("Conta André")
    var contaAndre = Conta(titular = "André", numero = 1000)
    contaAndre.deposita(200.0)
    println(contaAndre.titular)
    println(contaAndre.numero)
    println(contaAndre.saldo)

    println("Conta Fran")
    var contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Deposito na conta do Andre")
    contaAndre.deposita(50.0)
    println(contaAndre.saldo)

    println("Deposito na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Andre")
    contaAndre.saca(250.0)
    println(contaAndre.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Andre")
    contaAndre.saca(100.0)
    println(contaAndre.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Tranferência da conta da Fran para o Andre")

    if (contaFran.transfere(300.0, contaAndre)) {
        println("Transferência sucedida")
    } else {
        println("Falha na tranferência")
    }

    println(contaAndre.saldo)
    println(contaFran.saldo)
}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo - +valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiaEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    var contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)
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