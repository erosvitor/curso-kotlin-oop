import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Calendario {

  var dia: Int = 0
  var mes: Int = 0
  var ano: Int = 0
  var diaSemana: Int = 0

  constructor(dataStr: String) {
    val data = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    this.dia = data.getDayOfMonth()
    this.mes = data.getMonth().getValue()
    this.ano = data.getYear()
    this.diaSemana = data.getDayOfWeek().getValue()
  }

  fun mesPorExtenso(): String {
    val meses = arrayOf("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto",
      "setembro", "outubro", "novembro", "dezembro")
    return meses[this.mes-1]
  }

  fun diaSemanaPorExtenso(): String {
    var nomeDiaSemana = ""
    if (this.diaSemana == 1)
      nomeDiaSemana = "Segunda-feira"
    else if (this.diaSemana == 2)
      nomeDiaSemana = "Terça-feira"
    else if (this.diaSemana == 3)
      nomeDiaSemana = "Quarta-feira"
    else if (this.diaSemana == 4)
      nomeDiaSemana = "Quinta-feira"
    else if (this.diaSemana == 5)
      nomeDiaSemana = "Sexta-feira"
    else if (this.diaSemana == 6)
      nomeDiaSemana = "Sabado"
    else if (this.diaSemana == 7)
      nomeDiaSemana = "Domingo"
    return nomeDiaSemana
  }

  fun dataPorExtenso(): String {
    val nomeDiaSemana = this.diaSemanaPorExtenso()
    val nomeMes = this.mesPorExtenso()
    return String.format("%s, %d de %s de %d", nomeDiaSemana, this.dia, nomeMes, this.ano)
  }

}

fun main() {

  val cal = Calendario("10/06/2021")
  println(cal.mesPorExtenso())
  println(cal.dataPorExtenso())

}

