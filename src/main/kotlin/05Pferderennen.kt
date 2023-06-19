class Pferderennen {

    var jockeyHorse = jockeys.shuffled().toMutableList()

    var jockey1: Fahrer = Fahrer(jockeyHorse.removeLast(), (18..45).random())
    var jockey2: Fahrer = Fahrer(jockeyHorse.removeLast(), (18..45).random())
    var jockey3: Fahrer = Fahrer(jockeyHorse.removeLast(), (18..45).random())
    var jockey4: Fahrer = Fahrer(jockeyHorse.removeLast(), (18..45).random())
    var jockey5: Fahrer = Fahrer(jockeyHorse.removeLast(), (18..45).random())

    fun testSimulation(): Int{

        var zufall = simListDriver.random()
        if(zufall==1){
            println(" |   §  §  §  §  §   | ")
            time05()
            println(" |   §  .  .  .  .   | ")
            return 1
        } else if (zufall==2){
            println(" |   §  §  §  §  §   | ")
            time05()
            println(" |   .  §  .  .  .   | ")
            return 2
        } else if (zufall==3){
            println(" |   §  §  §  §  §   | ")
            time05()
            println(" |   .  .  §  .  .   | ")
            return 3
        } else if (zufall==4){
            println(" |   §  §  §  §  §   | ")
            time05()
            println(" |   .  .  .  §  .   | ")
            return 4
        } else {
            println(" |   §  §  §  §  §   | ")
            time05()
            println(" |   .  .  .  .  §   | ")
            return 5
        }


    }

    fun simulation ():Int {

        println(" |   §  §  §  §  §   | ")
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        testSimulation()
        time10()
        val ergebnis = testSimulation()
        if (ergebnis == 1) {
            println("$jockey1 hat gewonnen")
            return 1
        } else if (ergebnis == 2) {
            println("$jockey2 hat gewonnen")
            return 2
        } else if (ergebnis == 3) {
            println("$jockey3 hat gewonnen")
            return 3
        } else if (ergebnis == 4) {
            println("$jockey4 hat gewonnen")
            return 4
        } else if (ergebnis == 5) {
            println("$jockey5 hat gewonnen")
            return 5
        } else {
            println("Das Rennen wurde abgebrochen!")
            return 6
        }

    }

    init {
    }
    fun wetteUndRennen (){
        time10()
        println("""
            -----------------------------------------------
            -----------------------------------------------
            Dein aktuelles Guthaben auf deinem Spielerkonto
            beträgt genau: $kontostandAccount €
            Möchtest du auf das aktuelle Rennen wetten?
            
            --1: ---Platzieren
            --2: ---Zuschauen
            --3: ---Abbrechen
        """.trimIndent())
        var wetZusEingabe = readln().toInt()
        when{
            wetZusEingabe==1 -> {
                println("Wähle einen Reiter auf den du deine")
                time05()
                println("Wette platzieren möchtest:")
                time05()
                println("--1: $jockey1")
                time05()
                println("--2: $jockey2")
                time05()
                println("--3: $jockey3")
                time05()
                println("--4: $jockey4")
                time05()
                println("--5: $jockey5")
                var reiterEingabe = readln().toInt()
                println("Bitte mache nun deinen Einsatz:")
                var einsatzPferderennen = readln().toDouble()
                if(einsatzPferderennen<=kontostandAccount){
                    kontostandAccount=kontostandAccount-einsatzPferderennen
                    println("Du hast $einsatzPferderennen€ gesetzt.")
                    println("Kann das Rennen starten? Bestätige mit Enter.")
                    readln()
                    val ergebnis = simulation()
//                if Eingabe = Ergebnis
                    when{
                        (ergebnis==1)&&reiterEingabe==1 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzPferderennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==2)&&reiterEingabe==2 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzPferderennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==3)&&reiterEingabe==3 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzPferderennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==4)&&reiterEingabe==4 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzPferderennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==5)&&reiterEingabe==5 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzPferderennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        } else -> {
                        var verlust = kontostandAccount
                        time05()
                        println("Du hast leider verloren.")
                        time05()
                        println("Dein aktuelles Guthaben beträgt: $verlust")
                        wetteUndRennen()
                    }
                    }
                } else {
                    println("Dein Guthaben ist nicht ausreichend.")
                    time05()
                    println("Bitte setzte weniger oder lade dein Kundenkonto")
                    time05()
                    println("über das Hauptmenü im Punkt Ein/Auszahlen auf.")
                    wetteUndRennen()
                }
            }
            wetZusEingabe==2 -> {
                simulation()
                wetteUndRennen()
            }
            wetZusEingabe==3 -> {
                menue()
            }
            else -> {
                println("Die Eingabe war fehlerhaft.")
                wetteUndRennen()
            }
        }
    }

    fun miniMenuePferderennen (){

        println("-----------Pferderennen-----------")
        time05()
        println("--1: ----Wetten und zum Rennen----")
        time05()
        println("--2: --------Reiteransicht--------")
        time05()
        println("--3: --------Zum Hauptmenü--------")

        var PferdeEingabe = readln().toInt()

        when{
            PferdeEingabe==1 -> {
                "WETTEN UND RENNEN"
                wetteUndRennen()
                miniMenuePferderennen()
            }
            PferdeEingabe==2 -> {
                "REITERANSICHT"

                miniMenuePferderennen()
            }
            PferdeEingabe==3 -> {
                "ZUM HAUPTMENÜ"
                menue()
            }
            PferdeEingabe>=4 -> {
                println("Die Eingabe war fehlerhaft")
                miniMenuePferderennen()
            }
        }

    }


}