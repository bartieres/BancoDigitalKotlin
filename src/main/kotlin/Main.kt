fun main(args: Array<String>) {
    println("Seja Bem Vindo(a) ao Kotlin")

    val andre = Funcionario(
        nome = "André",
        cpf = "01234567891",
        salario = 1000.0
    )

    println("Nome: ${andre.nome}")
    println("CPF: ${andre.cpf}")
    println("Salário: ${andre.salario}")
    println("Bonificação: ${andre.bonificacao()}")
}