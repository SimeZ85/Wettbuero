

fun einAuszahlen (){
    println("----------Einzahlen und Auszahlen----------")
    time05()
    println("Wähle aus, was du tun möchtest:")
    time10()
    println("--1: ---Einzahlen")
    time05()
    println("--2: ---Auszahlen")
    time05()
    println("--3: ---Zurück zum Hauptmenü")
    var einAusEingabe = readln().toInt()

    when{
        einAusEingabe==1 -> {
            einzahlen()
        }
        einAusEingabe==2 -> {
            auszahlen()
        }
        einAusEingabe==3 -> {
            menue()
        }
        einAusEingabe>=4 -> {
            println("Fehlerhafte Eingabe.")
            einAuszahlen()
        }
    }
}



fun einzahlen (){
    println("Wieviel Geld möchten Sie auf Ihr Spielerkonto einzahlen?")
    time05()
    println("Gebe bitte nun den Betrag ein und bestätige mit Enter.")
    var einzahlenBank = readln().toDouble()
    println("Möchten Sie wirklich den Betrag von $einzahlenBank€ auf ihr Spielerkonto einzahlen?")
    time05()
    println("1: Bestätigen")
    println("2: Abbrechen")
    var einzahlenEingabe = readln().toInt()
    when{
        einzahlenEingabe==1 -> {
            bankkontoGuthaben = bankkontoGuthaben-einzahlenBank
            kontostandAccount = kontostandAccount + einzahlenBank
            println("Wir haben Ihr Bankkonto mit $einzahlenBank€ belastet.")
            time05()
            println("Ihr neues Accountguthaben beträgt: $kontostandAccount€")
            time05()
            einAuszahlen()
        }
        einzahlenEingabe==2 -> {
//            TODO Entweder ins Hauptmenü oder in das vorherige Menü
            einAuszahlen()
        }
        einzahlenEingabe>=3 -> {
            println("Fehlerhafte Eingabe.")
            time05()
            einzahlen()
        }
    }


}

fun auszahlen (){
    println("Wieviel Geld möchtest du auf dein Bankkonto Auszahlen?")
    time05()
    println("Gebe bitte nun den Betrag ein und bestätige mit Enter.")
    var auszahlenBank = readln().toDouble()
    println("Möchten Sie wirklich den Betrag von $auszahlenBank€ auszahlen?")
    time05()
    println("1: Bestätigen")
    println("2: Abbrechen")
    var auszahlenEingabe = readln().toInt()
    when{
        auszahlenEingabe==1 -> {
            kontostandAccount = kontostandAccount-auszahlenBank
            bankkontoGuthaben = bankkontoGuthaben+auszahlenBank
            time05()
            println("Wir haben $auszahlenBank auf Ihr Bankkonto ausgezahlt.")
            time05()
            einAuszahlen()
        }
        auszahlenEingabe==2 -> {
//            TODO entweder ins Hauptmenü oder in die vorliegende Funktion
            einAuszahlen()
        }
        auszahlenEingabe>=3 -> {
            println("Ihr Eingabe war fehlerhaft.")
            time05()
            auszahlen()
        }
    }


}



