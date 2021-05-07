val days = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")

def zadanie4a(list: List[String]) : String = {
  println("--- Zadanie 4a ---")
  var res = ""
  days.foldLeft() { (z, i) =>
    res += i + ", "
  }
  res.dropRight(2)
}

def zadanie4b(list: List[String]) : String = {
  println("--- Zadanie 4b ---")
  var res = ""
  days.foldRight() { (z, i) =>
    res += z + ", "
  }
  res.dropRight(2)
}

def zadanie4c(list: List[String]) : String = {
  println("--- Zadanie 4c ---")
  var res = ""
  days.foldLeft() { (z, i) =>
    if(i.startsWith("p"))
      res += i + ", "
  }
  res.dropRight(2)
}

// results
zadanie4a(days)
zadanie4b(days)
zadanie4c(days)