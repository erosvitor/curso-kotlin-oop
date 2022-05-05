class Produto {

  var descricao: String = ""
  var preco: Double = 0.0

  fun precoDistribuidor(): Double {
    return this.preco + (this.preco * (3/100))
  }

  fun precoDistribuidor(taxa: Float): Double {
    return this.preco + (this.preco * (taxa/100))
  }

  fun precoRepresentante(): Double {
    return this.preco + (this.preco * (4.5/100))
  }

  fun precoRepresentante(taxa: Float): Double {
    return this.preco + (this.preco * (taxa/100))
  }

  fun precoConsumitor(): Double {
    return this.preco + (this.preco * (5.5/100))
  }

  fun precoConsumitor(taxa: Float): Double {
    return this.preco + (this.preco * (taxa/100))
  }

}

fun main() {

  val prod = Produto()
  prod.descricao = "Fone de ouvido JBL"
  prod.preco = 127.90

  println("Preço distribuidor: ${prod.precoDistribuidor(7.5f)}")
  println("Preço representante: ${prod.precoRepresentante(8.5f)}")
  println("Preço consumidor: ${prod.precoConsumitor(10f)}")

}
