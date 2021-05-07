def zadanie10(input: List[Double]): List[Double] = {
  //defining abs function
  def f(arr:List[Double]):List[Double] = arr.map((x: Double) => if(x < 0) -x else x)
  val temp = input.filter(x =>  -5 <= x && x <= 12)
  f(temp)
}

var floats = List(-56.12, -2, -5.0,-0.5, 11.91, 77, 0.123);

// results
var absfloats = zadanie10(floats);
println(absfloats)

