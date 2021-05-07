val integers = List[Int](0, 0, 1, 6, 7, 7, 0, 10, 20000)

def zadanie8(list: List[Int], n: Int): List[Int] = list match {
  case Nil => Nil
  case h :: t =>
    if (h == n)
      zadanie8(t, n) // 0 found, skip it and iterate the tail
    else
      h :: zadanie8(t, n)
}

// results
zadanie8(integers, 0)