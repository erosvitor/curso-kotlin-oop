class Juros {
  companion object {
    fun jurosSimples(capital: Double, taxa: Double, periodo: Int): Double {
      return capital * (taxa / 100) * periodo
    }

    fun jurosCompostos(capital: Double, taxa: Double, periodo: Int): Double {
      var taxa = taxa
      taxa /= 100.0
      return capital * Math.pow(1 + taxa, periodo.toDouble())
    }
  }
}

fun main() {
  val jurosSimples = Juros.jurosSimples(1000.0, 10.0, 1)
  println("Juros simples: $jurosSimples")

  val jurosCompostos = Juros.jurosCompostos(1000.0, 10.0, 1)
  println("Juros compostos: $jurosCompostos")
}

