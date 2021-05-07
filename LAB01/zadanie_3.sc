val days = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")

def zadanie3(list: List[String]) : String = {
  def tailrecHelper(list: List[String], result: String) : String = {
    if(list.isEmpty)
      result
    else
      tailrecHelper(list.tail, result + ", " + list.head)
  }
  tailrecHelper(list.tail, list.head)
}

// results
zadanie3(days)