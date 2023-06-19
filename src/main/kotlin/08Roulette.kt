

class Roulette {

    var rouletteRad = roulette
    fun shuffeledRouletteRad ():Int{
        var rouletteRadZahl = rouletteRad.keys.random()
        return rouletteRadZahl
    }

    fun spiel (){
        var rouletteRadZahl = rouletteRad.keys.random()
        println("Mache hier deine Einsätze")
        time05()
        println("Bei unserem Roulette kannst du nur eine")
        time05()
        println("Wette pro Runde platzieren. Sie dir die")
        time05()
        println("Auswahl an.")
        time05()
        println("""
            ___________________________________________
            Übersicht:
            ___________________________________________
            
            1: Eine Farbe ------- Schwarz oder Rot (--x2--)
            2: Eine Zahl -------- Ein Zahlenfeld von 0 bis 36 (--x35--)
            3: Zwei Zahlen ------ Zwei Zahlen, die neben oder übereinander sind (--x17--)
            4: Drei Zahlen ------ Drei Zahlen in einer Reihe (--x11--)
            5: Vier Zahlen ------ Vier Zahlen, die sich eine Ecke teilen (--x8--)
            6: 1 -18 ------------ Alle Zahlen von 1 bis 18 (--x2--)
            7: 19 - 36 ---------- Alle Zahlen von 19 bis 36 (--x2--)
            8: Gerade ----------- Alle geraden Zahlen (--x2--)
            9: Ungerade --------- Alle ungeraden Zahlen (--x2--)
            10: Niedriger/Höher - Höher oder niedrigere Zahlen (--x2--)
            
            
                3   6   9  12  15  18  21  24  27  30  33  36
            0   2   5   8  11  14  17  20  23  26  29  32  35
                1   4   7  10  13  16  19  22  25  28  31  34
                
                1-18 Gerade       Rot Schwarz  Ungerade 19-36
            
        """.trimIndent())
    }
    fun zwischenMenueSpiel(){

        println("Willkommen am Tisch. Hier kannst du")
        time05()
        println("Einsätze machen und das Spiel genießen.")
        time05()
        println("----------------------------")
        time05()
        println("Wähle aus:")
        time05()
        println("--1: ---Setzen")
        time05()
        println("--2: ---Zuschauen")
        time05()
        println("--3: ---Abbrechen")
        var zwischenEingabe = readln().toInt()

        when {
            zwischenEingabe==1 -> {
                "Eigentliches Spiel"
                spiel()
                zwischenMenueSpiel()
            }
            zwischenEingabe==2 -> {
                "Zuschauen"
            }
            zwischenEingabe==3 -> {
                "Abbrechen"
                rouletteMenue()
            }
            zwischenEingabe>=4 -> {
                "Fehlerhafte Eingabe"
                zwischenMenueSpiel()
            }
        }
    }

    fun rouletteMenue (){
        println("----------Roulette----------")
        time10()
        println("----------------------------")
        time05()
        println("Ein kleines Spiel gefälligst?")
        time05()
        println("--1: ---Spiel")
        time05()
        println("--2: ---Regeln")
        time05()
        println("--3: ---Hauptmenü")

        var rouletteEingabe = readln().toInt()

        when {
            rouletteEingabe==1 -> {
                "Spiel"
                zwischenMenueSpiel()
                rouletteMenue()
            }
            rouletteEingabe==2 -> {
                "Regeln"
            }
            rouletteEingabe==3 -> {
                "Hauptmenü"
                menue()
            }
            rouletteEingabe>=4 -> {
                println("Fehlerhafte Eingabe")
                rouletteMenue()
            }
        }


    }

}