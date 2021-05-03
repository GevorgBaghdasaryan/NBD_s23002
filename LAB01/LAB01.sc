// LAB01
//////// zadanie 1 //////////
val days = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")

def zadanie1a(): Unit = {
  println("--- Zadanie 1A ---")
  var str1a = ""
  for (d <- days)
    str1a += d + ", "
  //delete the last comma
  println(str1a.dropRight(2)) // 2 to delete whitespace after comma
}
//zadanie1a()

def zadanie1b(): Unit = {
  println("--- Zadanie 1B ---")
  var str1b = ""
  for(d <- days)
    if (d.startsWith("p"))
      str1b += d + ", "
  // delete the last comma
  println(str1b.dropRight(2))
}
//zadanie1b()

def zadanie1c(): Unit = {
  println("--- Zadanie 1C ---")
  var str1c = ""
  var i = 0
  while(i < days.length) {
    str1c += days(i) + ", "
    i += 1
  }
  println(str1c.dropRight(2))
}
//zadanie1c()

//////// zadanie 2 i 3 (rekurencja ogonowa) //////////
// import scala.annotation.tailrec
println("--- Zadanie 2A ---")
def zadanie2a(list: List[String]): Unit = {
  if (list.nonEmpty) {
    println(list.head+", ")
    zadanie2a(list.tail)
  }
}
//zadanie2a(days)

println("2B")
def zadanie2b(list: List[String]): Unit = {
  if (list.nonEmpty) {
    println(list.last+", ")
    zadanie2b(list.init)
    zadanie2b(list.init)
  }
}
//zadanie2b(days)

//////// zadanie 4 //////////
def zadanie4a(list: List[String]): Unit = {
  println("--- Zadanie 4A ---")
  var str4a = ""
  days.foldLeft() { (z, i) =>
    str4a += i + ", "
  }
  print(str4a.dropRight(2))
}
//zadanie4a(days)

def zadanie4b(list: List[String]): Unit = {
  println("--- Zadanie 4B ---")
  var str4b = ""
  days.foldRight() { (z, i) =>
    str4b += z + ", "
  }
  print(str4b.dropRight(2))
}
//zadani4b(days)

def zadanie4c(list: List[String]): Unit = {
  println("--- Zadanie 4C ---")
  var str4c = ""
  days.foldLeft() { (z, i) =>
    if(i.startsWith("p"))
      str4c += i + ", "
  }
  print(str4c.dropRight(2))
}
//zadanie4c(days)


//////// zadanie 5 //////////
val products = Map("TV" -> 2500.00, "XBOX" -> 2349.00, "Gamepass" -> 120.00)
def zadanie5(): Unit = {
  println("--- Zadanie 5 ---")
  val discounted = products.map(s => s._2 * 0.90)
  println("Pre discount: " + products)
  println("Post discount: " + discounted)
}
//zadanie5()

//////// zadanie 6 //////////
def zadanie6[A, B, C](t: (A, B, C)): Unit = {
  println("--- Zadanie 6 ---")
  println("(" + t._1 + ", " + t._2 + ", " + t._3 + ")")
}

//zadanie6(Tuple3("HelloWorld", 3536, 14f))

//////// zadanie 7 //////////
def zadanie7(map: Map[String, Double], key: String): Option[Double] = {
  println("--- Zadanie 7 ---")
  if (map.contains(key))
    Some(map(key))
  else
    None
}

//val cena1 = zadanie7(products, "XBOX")
//val cena2 = zadanie7(products, "willtolive")

//////// zadanie 8 //////////
val integers = List[Int](0, 0, 1, 6, 7, 7, 0, 10, 20000)

println("--- Zadanie 8 ---")
def zadanie8(list: List[Int], n: Int): List[Int] = list match {
  case Nil => Nil
  case h :: t =>
    if (h == n)
      zadanie8(t, n) // 0 found, skip it and iterate the tail
    else
      h :: zadanie8(t, n)
}
//zadanie8(integers, 0)

//////// zadanie 9 //////////
def zadanie9(input: List[Int]): List[Int] = {
  println("--- Zadanie 9 ---")
  input.map(x => x + 1)
}

//var increased = zadanie9(integers);
//println(increased)

//////// zadanie 10 //////////
def zadanie10(input: List[Double]): List[Double] = {
  println("--- Zadanie 10 ---")
  //defining abs function
  def f(arr:List[Double]):List[Double] = arr.map((x: Double) => if(x < 0) -x else x)
  val temp = input.filter(x =>  -5 <= x && x <= 12)
  f(temp)
}

//var floats = List(-56.12, -2, -5.0,-0.5, 11.91, 77, 0.123);
//var absfloats = zadanie10(floats);
//println(absfloats)

