// main constructor
class KontoBankowe(private var stanKonta: Double = 0) {
  def getStanKonta = stanKonta

  // constructor no.2
  def this() = { this(0) }

  def wplata(wartosc: Double): Unit = {
    this.stanKonta += wartosc
  }

  def wyplata(wartosc: Double): Unit = {
    this.stanKonta -= wartosc
  }
}

//results
val stan1 = new KontoBankowe(2000)
stan1.getStanKonta
stan1.wplata(500.25)
stan1.getStanKonta
val stan2 = new KontoBankowe() //wyzerownie
