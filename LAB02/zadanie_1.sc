val dniRobocze = List ( "poniedziałek", "wtorek", "środa", "czwartek", "piątek" )
val dniWeekend = List ( "sobota", "niedziela" )

def zadanie1(day: String) = day.toLowerCase match {
    case day: String if dniRobocze.contains ( day ) => "Praca"
    case day: String if dniWeekend.contains ( day ) => "Weekend"
    case _ => "Nie ma takiego dnia"
  }

// results
println ( zadanie1 ( "PONIedziałek" ) )
println ( zadanie1 ( "WTOREK" ) )
println ( zadanie1 ( "środa" ) )
println ( zadanie1 ( "KWIECIEń" ) )