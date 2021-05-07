val products = Map("TV" -> 2500.00, "XBOX" -> 2349.00, "Gamepass" -> 120.00)

def zadanie7(map: Map[String, Double], key: String): Option[Double] = {
  if (map.contains(key))
    map.get(key)
  else
    None
}

// results
val cena1 = zadanie7(products, "XBOX")
val cena2 = zadanie7(products, "willtolive")