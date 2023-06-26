fun testaComportamentosConta() {
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