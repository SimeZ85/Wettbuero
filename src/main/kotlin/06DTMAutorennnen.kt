class DTMAutorennnen (){

    var driverCar1 = driverCar.shuffled().toMutableList()

    var fahrer1: Fahrer = Fahrer(driverCar1.removeLast(), (18..45).random())
    var fahrer2: Fahrer = Fahrer(driverCar1.removeLast(), (18..45).random())
    var fahrer3: Fahrer = Fahrer(driverCar1.removeLast(), (18..45).random())
    var fahrer4: Fahrer = Fahrer(driverCar1.removeLast(), (18..45).random())
    var fahrer5: Fahrer = Fahrer(driverCar1.removeLast(), (18..45).random())

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
            println("$fahrer1 hat gewonnen")
            return 1
        } else if (ergebnis == 2) {
            println("$fahrer2 hat gewonnen")
            return 2
        } else if (ergebnis == 3) {
            println("$fahrer3 hat gewonnen")
            return 3
        } else if (ergebnis == 4) {
            println("$fahrer4 hat gewonnen")
            return 4
        } else if (ergebnis == 5) {
            println("$fahrer5 hat gewonnen")
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
                println("Wähle einen Fahrer auf den du deine")
                time05()
                println("Wette platzieren möchtest:")
                time05()
                println("--1: $fahrer1")
                time05()
                println("--2: $fahrer2")
                time05()
                println("--3: $fahrer3")
                time05()
                println("--4: $fahrer4")
                time05()
                println("--5: $fahrer5")
                var fahrerEingabe = readln().toInt()
                println("Bitte mache nun deinen Einsatz:")
                var einsatzDTM = readln().toDouble()
                kontostandAccount=kontostandAccount-einsatzDTM
                println("Du hast $einsatzDTM€ gesetzt.")
                println("Kann das Rennen starten? Bestätige mit Enter.")
                readln()
                val ergebnis = simulation()
//                if Eingabe = Ergebnis
                when{
                    (ergebnis==1)&&fahrerEingabe==1 -> {
                        println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                        var gew1 = einsatzDTM*5
                        var gesamtGew = kontostandAccount+gew1
                        time05()
                        println("Dein Gewinn beträgt: $gew1€")
                        time05()
                        println("Dein Kontostand beträgt: $gesamtGew€")
                        wetteUndRennen()
                    }
                    (ergebnis==2)&&fahrerEingabe==2 -> {
                        println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                        var gew1 = einsatzDTM*5
                        var gesamtGew = kontostandAccount+gew1
                        time05()
                        println("Dein Gewinn beträgt: $gew1€")
                        time05()
                        println("Dein Kontostand beträgt: $gesamtGew€")
                        wetteUndRennen()
                    }
                    (ergebnis==3)&&fahrerEingabe==3 -> {
                        println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                        var gew1 = einsatzDTM*5
                        var gesamtGew = kontostandAccount+gew1
                        time05()
                        println("Dein Gewinn beträgt: $gew1€")
                        time05()
                        println("Dein Kontostand beträgt: $gesamtGew€")
                        wetteUndRennen()
                    }
                    (ergebnis==4)&&fahrerEingabe==4 -> {
                        println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                        var gew1 = einsatzDTM*5
                        var gesamtGew = kontostandAccount+gew1
                        time05()
                        println("Dein Gewinn beträgt: $gew1€")
                        time05()
                        println("Dein Kontostand beträgt: $gesamtGew€")
                        wetteUndRennen()
                    }
                    (ergebnis==5)&&fahrerEingabe==5 -> {
                        println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                        var gew1 = einsatzDTM*5
                        var gesamtGew = kontostandAccount+gew1
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

    fun miniMenue (){

        println("----------DTM Automotorsport----------")
        time05()
        println("--1: ----Wetten und zum Rennen----")
        time05()
        println("--2: --------Fahreransicht--------")
        time05()
        println("--3: --------Zum Hauptmenü--------")

        var dtmEingabe = readln().toInt()

        when{
            dtmEingabe==1 -> {
                "WETTEN UND RENNEN"
                wetteUndRennen()
                miniMenue()
            }
            dtmEingabe==2 -> {
                "FAHRERANSICHT"

                miniMenue()
            }
            dtmEingabe==3 -> {
                "ZUM HAUPTMENÜ"
                menue()
            }
            dtmEingabe>=4 -> {
                println("Die Eingabe war fehlerhaft")
                miniMenue()
            }
        }

    }



}