//////// zadanie 5 //////////

val products = Map("TV" -> 2500.00, "XBOX" -> 2349.00, "Gamepass" -> 120.00)

def zadanie5(itemsPrices: Map[String, Double]) : Map[String, Double] = {
  itemsPrices.map(a => (a._1, 0.9*a._2))
}


val postDiscount = zadanie5(products)

// results
println ( "Pre discount: " + products)
println ( "Post discount: " + postDiscount)
