val integers = List[Int](0, 0, 1, 6, 7, 7, 0, 10, 20000)

def zadanie9(input: List[Int]): List[Int] = {
  println("--- Zadanie 9 ---")
  input.map(x => x + 1)
}

// results
var increased = zadanie9(integers);
println(increased)
