

class Roulette {

    var rouletteRad = roulette
    fun shuffeledRouletteRad ():Int{
        var rouletteRadZahl = rouletteRad.keys.random()
        return rouletteRadZahl
    }

    var rouletteZuschauenZahl = rouletteRad.keys.random()
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
            
            1:  Eine Farbe ------- Schwarz oder Rot (--x2--)
            2:  Eine Zahl -------- Ein Zahlenfeld von 0 bis 36 (--x35--)
            3:  Zwei Zahlen ------ Zwei Zahlen, die neben oder übereinander sind (--x17--)
            4:  Drei Zahlen ------ Drei Zahlen in einer Reihe (--x11--)
            5:  Vier Zahlen ------ Vier Zahlen, die sich eine Ecke teilen (--x8--)
            6:  1 -18 ------------ Alle Zahlen von 1 bis 18 (--x2--)
            7:  19 - 36 ---------- Alle Zahlen von 19 bis 36 (--x2--)
            8:  Gerade ----------- Alle geraden Zahlen (--x2--)
            9:  Ungerade --------- Alle ungeraden Zahlen (--x2--)
            10: Column ----------- Drei Reihen  (--x4--)
            11: Zurück zum Menü
            
            
          ${white}      ${red}3${reset}${white}   ${black}6${reset}${white}   ${red}9${reset}${white}  ${red}12${reset}${white}  ${black}15${reset}${white}  ${red}18${reset}${white}  ${red}21${reset}${white}  ${black}24${reset}${white}  ${red}27${reset}${white}  ${red}30${reset}${white}  ${black}33${reset}${white}  ${red}36${reset}   <- Column 3
          ${white}  ${green}0${reset}${white}   ${black}2${reset}${white}   ${red}5${reset}${white}   ${black}8${reset}${white}  ${black}11${reset}${white}  ${red}14${reset}${white}  ${black}17${reset}${white}  ${black}20${reset}${white}  ${red}23${reset}${white}  ${black}26${reset}${white}  ${black}29${reset}${white}  ${red}32${reset}${white}  ${black}35${reset}   <- Column 2
          ${white}      ${red}1${reset}${white}   ${black}4${reset}${white}   ${red}7${reset}${white}  ${black}10${reset}${white}  ${black}13${reset}${white}  ${red}16${reset}${white}  ${red}19${reset}${white}  ${black}22${reset}${white}  ${red}25${reset}${white}  ${black}28${reset}${white}  ${black}31${reset}${white}  ${red}34${reset}   <- Column 1
                
          ${white}      ${black}1-18 Gerade${reset}${white}       ${red}Rot${reset}${white} ${black}Schwarz${reset}${white}  ${black}Ungerade 19-36${reset}
           
        """.trimIndent())
        time05()
        println("Triff deine Auswahl:")
        var vorauswahl = readln().toInt()
        when{
            vorauswahl==1 -> {
                "EINE FARBE"
                println("Wähle deinen Einsatz:")
                var einsatzAusRot = readln().toDouble()
                println("Wähle eine Farbe")
                time05()
                println("--1: ---Rot")
                time05()
                println("--2: ---Schwarz")
                var schwarzRot = readln().toInt()
                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                if((schwarzRot==1)&&(roulette[rouletteRadZahl]!! == "Rot")){
                    var winAusRot = einsatzAusRot * 2
                    kontostandAccount = kontostandAccount+winAusRot
                    println("Herzlichen Glückwunsch. Du hast gewonnen.")
                    time05()
                    println("Dein Gewinn beträgt: $winAusRot€")
                    time05()
                    println("Dein aktuelles Guthaben beträgt: $kontostandAccount€")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if ((schwarzRot==2)&&(roulette[rouletteRadZahl]!! == "Schwarz")) {
                    var winAusSchwarz = einsatzAusRot * 2
                    kontostandAccount = kontostandAccount + winAusSchwarz
                    println("Herzlichen Glückwunsch. Du hast gewonnen.")
                    time05()
                    println("Dein Gewinn beträgt: $winAusSchwarz€")
                    time05()
                    println("Dein aktuelles Guthaben beträgt: $kontostandAccount€")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - einsatzAusRot
                    println("Du hast leider verloren. Vielleicht beim nächsten mal.")
                    time05()
                    println("Dein aktueller Kontostand beträgt: $kontostandAccount")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==2 -> {
                "EINE ZAHL"
                println("Wähle einen Einsatz:")
                var zahleEinsatz = readln().toDouble()
                println("Gut, wähle jetzt die Zahl, auf die du setzen möchtest:")
                var aufZahl = readln().toInt()
                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                var gewinnEineZahl = zahleEinsatz * 35
                if(rouletteRadZahl==aufZahl){
                    kontostandAccount = kontostandAccount + gewinnEineZahl
                    println("Herzlichen Glückwunsch du hast gewonnen.")
                    time05()
                    println("Du hast $gewinnEineZahl€ gewonnen.")
                    time05()
                    println("Dein neues Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - zahleEinsatz
                    println("Du hast leider verloren. Versuch es erneut.")
                    time05()
                    println("Dein aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==3 -> {
                "ZWEI ZAHLEN"
//                Paare: 1-2, 1-4, 2-3, 2-5, 3-6, 4-5, 4-7, 5-6, 5-8, 6-9,
            //                7-8, 7-10, 8-9, 8-11, 9-12, 10-11, 10-13, 11-12,
          //      11-14, 12-15, 13-14, 13-16, 17-18, 17-20, 18-21, Das ist die hälfte
                //der Kombinationen aus 2er Kombinationen
                println("""
                    Paare: 1-2, 1-4, 2-3, 2-5, 3-6, 4-5, 4-7, 5-6, 5-8, 6-9,
                    7-8, 7-10, 8-9, 8-11, 9-12, 10-11, 10-13, 11-12,
                    11-14, 12-15, 13-14, 13-16, 17-18, 17-20, 18-21, 
                    Das ist die hälfte der Kombinationen aus 2er Kombinationen.
                    Möglich das zu programmieren allerdings sprengt das den 
                    Rahmen für die Zeit, die ich zur Verfügung habe
                """.trimIndent())
                time05()
                println("Weiter mit Enter")
                readln()
                spiel()
            }
            vorauswahl==4 -> {
                println("Mache deinen Einsatz:")
                var dreierEinsatz = readln().toInt()
                println("Wähle deine 3er Reihe:")
                time05()
                println("""
                    1:    1  2  3
                    2:    4  5  6
                    3:    7  8  9
                    4:   10 11 12
                    5:   13 14 15
                    6:   16 17 18
                    7:   19 20 21
                    8:   22 23 24
                    9:   25 26 27
                    10:  28 29 30
                    11:  31 32 33
                    12:  34 35 36
                """.trimIndent())
                var dreierReihe = readln().toInt()
                var dreierGewinn = dreierEinsatz * 11
                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                if (rouletteRadZahl in (1..3)&&(dreierReihe==1)){
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (4..6)&&(dreierReihe==2)){
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (7..9)&&(dreierReihe==3)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (10..12)&&(dreierReihe==4)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (13..15)&&(dreierReihe==5)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (16..18)&&(dreierReihe==6)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (19..21)&&(dreierReihe==7)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (22..24)&&(dreierReihe==8)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (25..27)&&(dreierReihe==9)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (28..30)&&(dreierReihe==10)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (31..33)&&(dreierReihe==11)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if (rouletteRadZahl in (34..36)&&(dreierReihe==12)) {
                    kontostandAccount = kontostandAccount + dreierGewinn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $dreierGewinn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - dreierEinsatz
                    println("Du hast leider verloren. Viel Glück beim nächsten Mal.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
                time05()
                println("Weiter mit Enter")
                readln()
                spiel()
            }
            vorauswahl==5 -> {
                "VIER ZAHLEN"
                println("""
                    22 Kombinationen = 23 if else Anweisungen. Auch das sprengt
                    den Rahmen des zeitlich Machbaren. Gern bei mehr Zeit.
                """.trimIndent())
                time05()
                println("Weiter mit Enter")
                readln()
                spiel()
            }
            vorauswahl==6 -> {
                "1-18"
                println("Wähle einen Einsatz:")
                var einsBisAchtzehnEinsatz = readln().toDouble()
                println("Gut, du hast dich für 1-18 entschieden und deinen Einsatz gemacht.:")

                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                var gewinnEinsBisAchtzehn = einsBisAchtzehnEinsatz * 2
                if(rouletteRadZahl in (1..18)){
                    kontostandAccount = kontostandAccount + gewinnEinsBisAchtzehn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnEinsBisAchtzehn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - einsBisAchtzehnEinsatz
                    println("Du hast leider verloren. Versuch es erneut.")
                    time05()
                    println("Dein aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==7 -> {
                "19-36"
                println("Wähle einen Einsatz:")
                var achtzehnBisSechsunddreissigEinsatz = readln().toDouble()
                println("Gut, du hast dich für 1-18 entschieden und deinen Einsatz gemacht.:")

                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                var gewinnachtzehnBisSechsunddreissigEinsatz = achtzehnBisSechsunddreissigEinsatz * 2
                if(rouletteRadZahl in (19..36)){
                    kontostandAccount = kontostandAccount + gewinnachtzehnBisSechsunddreissigEinsatz
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnachtzehnBisSechsunddreissigEinsatz€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - achtzehnBisSechsunddreissigEinsatz
                    println("Du hast leider verloren. Versuch es erneut.")
                    time05()
                    println("Dein aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==8 -> {
                "GERADE"
                println("Wähle einen Einsatz:")
                var geradeEinsatz = readln().toDouble()
                println("Gut, du hast dich für GERADE entschieden und deinen Einsatz gemacht.:")

                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                var gewinnGeradeEinsatz = geradeEinsatz * 2
                if(rouletteRadZahl in (2..36 step 2)){
                    kontostandAccount = kontostandAccount + gewinnGeradeEinsatz
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnGeradeEinsatz€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - geradeEinsatz
                    println("Du hast leider verloren. Versuch es erneut.")
                    time05()
                    println("Dein aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==9 -> {
                "UNGERADE"
                println("Wähle einen Einsatz:")
                var ungeradeEinsatz = readln().toDouble()
                println("Gut, du hast dich für UNGERADE entschieden und deinen Einsatz gemacht.:")

                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                var gewinnUngeradeEinsatz = ungeradeEinsatz * 2
                if(rouletteRadZahl in (1..35 step 2)){
                    kontostandAccount = kontostandAccount + gewinnUngeradeEinsatz
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnUngeradeEinsatz€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else {
                    kontostandAccount = kontostandAccount - ungeradeEinsatz
                    println("Du hast leider verloren. Versuch es erneut.")
                    time05()
                    println("Dein aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==10 -> {
                "column"
                println("Wähle einen Einsatz:")
                var columnEinsatz = readln().toDouble()
                time05()
                println("""
                    Gut, nun entscheide dich für eine Reihe:
                    1: Column 1 (Reihe 1)
                    2: Column 2 (Reihe 2)
                    3: Column 3 (Reihe 3)
                """.trimMargin())
                var column = readln().toInt()

                println("Starten mit Enter")
                readln()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Dreht")
                time05()
                println("Und die Zahl ist :$rouletteRadZahl und die Farbe ist: ${roulette[rouletteRadZahl]}")
                var gewinnColumn = columnEinsatz * 4
                if((rouletteRadZahl in (1..34 step 3)&&(column==1))){
                    kontostandAccount = kontostandAccount + gewinnColumn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnColumn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if ((rouletteRadZahl in (2..35 step 3)&&(column==2))){
                    kontostandAccount = kontostandAccount + gewinnColumn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnColumn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                } else if ((rouletteRadZahl in (3..36 step 3)&&(column==3))){
                    kontostandAccount = kontostandAccount + gewinnColumn
                    println("Herzlichen Glückwunsch sie haben gewonnen.")
                    time05()
                    println("Sie haben $gewinnColumn€ gewonnen.")
                    time05()
                    println("Ihr aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }else {
                    kontostandAccount = kontostandAccount - columnEinsatz
                    println("Du hast leider verloren. Versuch es erneut.")
                    time05()
                    println("Dein aktuelles Accountguthaben beträgt: $kontostandAccount€.")
                    time05()
                    println("Weiter mit Enter")
                    readln()
                    spiel()
                }
            }
            vorauswahl==11 -> {
                rouletteMenue()
            }
            vorauswahl>=12 -> {
                println("Fehlerhafte Eingabe")
                spiel()
            }
        }
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
                zuschauenRoulette()
                zwischenMenueSpiel()
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

    fun zuschauenRoulette(){
        println("Starten mit Enter")
        readln()
        println("Dreht")
        time05()
        println("Dreht")
        time05()
        println("Dreht")
        time05()
        println("Dreht")
        time05()
        println("Dreht")
        time05()
        println("Dreht")
        time05()
        println("Und die Zahl ist :$rouletteZuschauenZahl und die Farbe ist: ${roulette[rouletteZuschauenZahl]}")
    }

}