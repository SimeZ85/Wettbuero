

//TODO LogIn entwickeln

var angemeldet = false //Gilt für alle Benutzer auf diesem Gerät. Daher auch Global

fun logIn ():String{

    println("----------------------------------")
    println("----------Wet dich Fett-----------")
    println("----------------------------------")
    time05()
    println("Dem Wettbüro mit fairen Quoten.")
    time05()
    println("Bitte Log dich ein, um zu Spielen.")
    time05()
    println("Benutzername:")
    var benutzerName = readln()
    println("Passwort:")
    var passwort = readln()
    angemeldet = benutzerName in kundendaten && passwort == kundendaten[benutzerName]!!
    if (angemeldet) {
        println("Herzlich Willkommen $benutzerName")
        return benutzerName
    } else {
        println("Einloggen fehlgeschlagen. Bitte versuch es erneut.")
        logIn()
        return ""
    }
}