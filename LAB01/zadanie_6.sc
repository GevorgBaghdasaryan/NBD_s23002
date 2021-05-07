val tuple = ("Hello World", false, 14f)

def zadanie6[A, B, C](t: (A, B, C)): Unit = {
  println("--- Zadanie 6 ---")
  println("(" + t._1 + ", " + t._2 + ", " + t._3 + ")")
}

// result
zadanie6(tuple)

