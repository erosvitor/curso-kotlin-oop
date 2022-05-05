class Produto {

  var descricao: String = "";
  var preco: Double = 0.0;

  fun precoDistribuidor(): Double {
    return this.preco + (this.preco * (3/100));
  }

  fun precoRepresentante(): Double {
    return this.preco + (this.preco * (4.5/100));
  }

  fun precoConsumitor(): Double {
    return this.preco + (this.preco * (5.5/100));
  }

}

fun main() {

  val prod = Produto()
  prod.descricao = "Caneta"
  prod.preco = 1.50

  println("Preço distribuidor: ${prod.precoDistribuidor()}")
  println("Preço representante: ${prod.precoRepresentante()}")
  println("Preço consumidor: ${prod.precoConsumitor()}")

}
