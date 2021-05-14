def zadanie4(liczba: Int, funkcja: Int => Int) : Int = {
   var i = 0

   def helper(x: Int, i: Int) : Int = {
     if(i < 3) {
        helper ( funkcja ( x ), i + 1 )
      }
     else
      x
    }

    helper(liczba, i)
}

//result
println(zadanie4(2, n => n+10))
