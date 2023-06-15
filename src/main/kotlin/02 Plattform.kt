

fun menue (){
    println("----------HAUPTMENÜ----------")
    time15()
    println("Wähle aus der Liste aus:")
    time10()
    println("--- 1: -----Kundenportal-----")
    time05()
    println("--- 2: ----Ein-/Auszahlen----")
    time05()
    println("--- 3: -----Pferderennen-----")
    time05()
    println("--- 4: ----Motorradrennen----")
    time05()
    println("--- 5: --DTM Automotorsport--")
    time05()
    println("--- 6: ------Ausloggen-------")

    var eingabeSpieler = readln().toInt()

    when {
        eingabeSpieler==1 -> {
            "KUNDENPORTAL"
            menue()
        }
        eingabeSpieler==2 -> {
            "EIN/AUSZAHLEN"
            einAuszahlen()
            menue()
        }
        eingabeSpieler==3 -> {
            "PFERDERENNEN"
            //simulation()
            menue()
        }
        eingabeSpieler==4 -> {
            "MOTORRADRENNEN"
            //simulation()
            menue()
        }
        eingabeSpieler==5 -> {
            "DTM AUTORENNEN"

            DTMAutorennnen().miniMenue()
            menue()
        }
        eingabeSpieler==6 -> {
            "AUSLOGGEN"
            println("""
                Auf Wiedersehen. Schön, dass Sie hier waren
                und einen Tag in unserem Hause verbracht haben.
                Wir hoffen Sie hatten Spaß und freuen uns
                über einen erneuten Besuch.
            """.trimIndent())
        }
        eingabeSpieler>=7 -> {
            println("-----FEHLERHAFTE EINGABE-----")
            menue()
        }
    }
}