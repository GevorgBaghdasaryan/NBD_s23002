  class Osoba(var imie: String, var nazwisko: String, private var tax: Double) {
    def podatek: Double = tax
  }

  trait Pracownik extends Osoba {
    var pensja: Double = 0
    override def podatek: Double = pensja/5
  }

  trait Student extends Osoba {
    override def podatek: Double = 0
  }

  trait Nauczyciel extends Pracownik {
    override def podatek: Double = pensja/10
  }

// Stwórz obiekty z każdym z traitów, pokaż jak podatek działa dla każdego z nich.

  // pracownik
    val pracownik = new Osoba("Gevorg", "Baghdasaryan", 20) with Pracownik
    pracownik.pensja = 2600
    println("Zarobki pracownika brutto: " + pracownik.pensja)
    println("Podatek od zarobkow " + pracownik.podatek)

  // student
  val student = new Osoba("Maciej", "Kowalski", 10) with Student
  println("Podatek studenta: " + student.podatek)

  // nauczyciel
  val nauczyciel = new Osoba("Tomasz", "Zawadzki", 10) with Nauczyciel
  nauczyciel.pensja = 5000
  println("Zarobki nauczyciela brutto: " + nauczyciel.pensja)
  println("Podatek od zarobkow: " + nauczyciel.podatek)

// Stwórz obiekty z traitami Student i Pracownik, pokaż jak podatek zadziała w zależności od kolejności w jakiej te traity zostały dodane przy tworzeniu obiektu.

  // pracownik student
  val pracownikStudent = new Osoba("Gevorg", "Baghdasaryan", 10) with Pracownik with Student
  pracownikStudent.pensja = 1500
  println("Zarobki pracownika studenta brutto: " + pracownikStudent.pensja)
  println("Podatek od zarobkow: " + pracownikStudent.podatek)

  // student pracownik
  val studentPracownik = new Osoba("Gevorg", "Baghdasaryan", 10) with Student with Pracownik
  studentPracownik.pensja = 1500
  println("Zarobki studenta pracownika brutto: " + studentPracownik.pensja)
  println("Podatek od zarobkow: " + studentPracownik.podatek)


