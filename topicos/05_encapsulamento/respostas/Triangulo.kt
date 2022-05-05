import kotlin.math.abs

class Triangulo {

  var lado1: Int = 0
  var lado2: Int = 0
  var lado3: Int = 0

  fun ehTriangulo(): Boolean {
    return (lado1 > abs(lado2 - lado3) && lado1 < (lado2 + lado3)) &&
           (lado2 > abs(lado1 - lado3) && lado2 < (lado1 + lado3)) &&
           (lado3 > abs(lado1 - lado2) && lado3 < (lado1 + lado2))
  }

  fun obterTipoTriangulo(): String {
    val tipoTriangulo: String

    if (lado1 == lado2 && lado1 == lado3)
      tipoTriangulo = "Equilátero"
    else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
      tipoTriangulo = "Escaleno"
    else
      tipoTriangulo = "Isósceles"

    return tipoTriangulo
  }

}

fun main() {

  val triangulo = Triangulo()
  triangulo.lado1 = 10
  triangulo.lado2 = 14
  triangulo.lado3 = 18

  if (triangulo.ehTriangulo()) {
    println("Os lados formam um triângulo")
    println(triangulo.obterTipoTriangulo())
  } else {
    println("Os lados NÃO formam um triângulo")
  }

}
