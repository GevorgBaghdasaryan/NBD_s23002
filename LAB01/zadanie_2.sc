val days = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")

println("--- Zadanie 2a ---")
def zadanie2a(list: List[String]) : String = {
  if (!list.tail.isEmpty)
    list.head + ", " + zadanie2a(list.tail)
  else
    list.head
}

println("--- Zadanie 2b ----")
def zadanie2b(list: List[String]) : String = {
  if (!list.tail.isEmpty)
    zadanie2b(list.tail) + ", " + list.head
  else
    list.head
}


// results
zadanie2a(days)
zadanie2b(days)
