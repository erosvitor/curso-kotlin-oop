class IMC {

  companion object {
    fun calcularIndice(peso: Double, altura: Double): Double {
      return peso / (altura * altura)
    }

    fun retornarClassificacao(imc: Double): String {
      var classificacao = ""
      if (imc <= 18.5)
        classificacao = "Magro"
      else if (imc <= 24.0)
        classificacao = "Normal"
      else if (imc <= 29.9)
        classificacao = "Pré-obeso"
      else
        classificacao = "Obeso"

      return classificacao;
    }
  }

}

fun main() {
  val peso = 78.0
  val altura = 1.67

  val imc = IMC.calcularIndice(peso, altura)
  val classificacao = IMC.retornarClassificacao(imc)

  println("IMC: %.2f".format(imc))
  println("Classificacao: $classificacao")
}
