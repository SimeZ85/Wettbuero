class Motorradrennen {

    var driverBikes = driverBike.shuffled().toMutableList()

    var biker1: Fahrer = Fahrer(driverBikes.removeLast(), (18..45).random())
    var biker2: Fahrer = Fahrer(driverBikes.removeLast(), (18..45).random())
    var biker3: Fahrer = Fahrer(driverBikes.removeLast(), (18..45).random())
    var biker4: Fahrer = Fahrer(driverBikes.removeLast(), (18..45).random())
    var biker5: Fahrer = Fahrer(driverBikes.removeLast(), (18..45).random())

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
            println("$biker1 hat gewonnen")
            return 1
        } else if (ergebnis == 2) {
            println("$biker2 hat gewonnen")
            return 2
        } else if (ergebnis == 3) {
            println("$biker3 hat gewonnen")
            return 3
        } else if (ergebnis == 4) {
            println("$biker4 hat gewonnen")
            return 4
        } else if (ergebnis == 5) {
            println("$biker5 hat gewonnen")
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
                println("--1: $biker1")
                time05()
                println("--2: $biker2")
                time05()
                println("--3: $biker3")
                time05()
                println("--4: $biker4")
                time05()
                println("--5: $biker5")
                var bikerEingabe = readln().toInt()
                println("Bitte mache nun deinen Einsatz:")
                var einsatzMotorradrennen = readln().toDouble()
                if(einsatzMotorradrennen<=kontostandAccount){
                    kontostandAccount=kontostandAccount-einsatzMotorradrennen
                    println("Du hast $einsatzMotorradrennen€ gesetzt.")
                    println("Kann das Rennen starten? Bestätige mit Enter.")
                    readln()
                    val ergebnis = simulation()
//                if Eingabe = Ergebnis
                    when{
                        (ergebnis==1)&&bikerEingabe==1 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzMotorradrennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==2)&&bikerEingabe==2 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzMotorradrennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==3)&&bikerEingabe==3 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzMotorradrennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==4)&&bikerEingabe==4 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzMotorradrennen*5
                            var gesamtGew = kontostandAccount+gew1
                            kontostandAccount=gesamtGew
                            time05()
                            println("Dein Gewinn beträgt: $gew1€")
                            time05()
                            println("Dein Kontostand beträgt: $gesamtGew€")
                            wetteUndRennen()
                        }
                        (ergebnis==5)&&bikerEingabe==5 -> {
                            println("Herzlichen Glückwunsch. Sie haben gewonnen.")
                            var gew1 = einsatzMotorradrennen*5
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

    fun miniMenueMotorradrennen (){

        println("----------DTM Automotorsport----------")
        time05()
        println("--1: ----Wetten und zum Rennen----")
        time05()
        println("--2: --------Fahreransicht--------")
        time05()
        println("--3: --------Zum Hauptmenü--------")

        var PferdeEingabe = readln().toInt()

        when{
            PferdeEingabe==1 -> {
                "WETTEN UND RENNEN"
                wetteUndRennen()
                miniMenueMotorradrennen()
            }
            PferdeEingabe==2 -> {
                "REITERANSICHT"

                miniMenueMotorradrennen()
            }
            PferdeEingabe==3 -> {
                "ZUM HAUPTMENÜ"
                menue()
            }
            PferdeEingabe>=4 -> {
                println("Die Eingabe war fehlerhaft")
                miniMenueMotorradrennen()
            }
        }

    }


}