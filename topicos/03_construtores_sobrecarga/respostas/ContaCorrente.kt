class ContaCorrente {

  var numero: String = ""
  var saldo: Double = 0.0
  var limite: Int = 0

  constructor (numero: String, saldo: Double, limite: Int) {
    this.numero = numero
    this.saldo = saldo
    this.limite = limite
  }

  fun depositar(valor: Double) {
    this.saldo += valor
  }

  fun sacar(valor: Double): Boolean {
    if (this.saldo >= valor) {
      this.saldo -= valor
      return true
    } else {
      return false
    }
  }

  fun consultarSaldo(): Double {
    return this.saldo
  }

}

fun main() {

  val conta1 = ContaCorrente("0101-02", 5000.0, 1000)
  conta1.depositar(1000.0)
  conta1.sacar(570.0)

  println(conta1.consultarSaldo())

}
