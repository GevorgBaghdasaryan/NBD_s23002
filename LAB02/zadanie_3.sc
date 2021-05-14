case class Osoba(val imie: String, val nazwisko: String) {}

def przywitanie(person: Osoba) = person match {
  case Osoba("Gevorg", _) => "Witaj Gev"
  case Osoba(_, "Montana") => "Czesc Tony, skad ta blizna?"
  case Osoba(imie, _) => s"Witaj $imie"
}

 //results
 println(przywitanie(new Osoba("Gevorg", "Baghdasaryan")))
 println(przywitanie(new Osoba("Tony", "Montana")))
 println(przywitanie(new Osoba("Micheal", "Scott")))
