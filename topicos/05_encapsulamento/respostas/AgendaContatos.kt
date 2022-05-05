/*
class Contato {

  var nome: String = ""
  var telefone: String = ""
  var email = ""

  constructor(nome: String, telefone: String, email: String) {
    this.nome = nome
    this.telefone = telefone
    this.email = email
  }

}
*/

class Contato(var nome: String, var telefone: String, var email: String) {

}

fun main() {
  val contato1 = Contato("Fulano da Silva", "41-987870101", "fulanosilva@gmail.com")
  val contato2 = Contato("Siclano Gomes", "41-32442131", "siclano_gomes@yahoo.com.br")

  println(contato1.nome + ", " + contato1.telefone)
  println(contato2.nome + ", " + contato2.telefone)

}
