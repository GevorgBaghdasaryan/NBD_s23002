val days = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")


def zadanie1a(list: List[String]) : String = {
  println ( "--- Zadanie 1a ---" )
  var result = ""
  for (d <- days) {
    result += d + ", "
  }
  //delete the last comma
  result.dropRight ( 2 ) // 2 to delete whitespace after comma
}


def zadanie1b(list: List[String]) : String = {
  println("--- Zadanie 1b ---")
  var result = ""
  for(d <- days) {
    if (d.startsWith("p"))
      result += d + ", "
  }
  // delete the last comma
  result.dropRight ( 2 ) // 2 to delete whitespace after comma
}


def zadanie1c(list: List[String]) : String = {
  println("--- Zadanie 1c ---")
  var result = ""
  var i = 0
  while(i < days.length) {
    result += days(i) + ", "
    i += 1
  }
  result.dropRight(2)
}

// results
zadanie1a(days)
zadanie1b(days)
zadanie1c(days)
