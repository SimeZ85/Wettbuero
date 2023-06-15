

fun kundenportal (){
    println("----------Kundenportal----------")
    time10()
    println("--1: ---Kontaktdaten")
    time05()
    println("--2: ---Kontaktdaten ändern")
    time05()
    println("--3: ---Passwort ändern")
    time05()
    println("--4: ---Accountkontostand")
    time05()
    println("--5: ---24h Spielpause")
    time05()
    println("--6: ---Hauptmenü")
    var kundenportalEingabe = readln().toInt()
    when{
        kundenportalEingabe==1 -> {
//            TODO Kontaktdateneinsicht
            kontaktdaten()
            kundenportal()
        }
        kundenportalEingabe==2 -> {
//            TODO Kontaktdaten ändern
            kundenportal()
        }
        kundenportalEingabe==3 -> {
//            TODO Passwort ändern
            kundenportal()
        }
        kundenportalEingabe==4 -> {
            kontostand()
            kundenportal()
        }
        kundenportalEingabe==5 -> {
            println("Ab  und  zu ist es gut  ein Pause einzulegen.")
            time05()
            println("In 24 Stunden kannst du unsere Dienste erneut")
            time05()
            println("nutzen  und  eine  schöne  Zeit  auf  unserer")
            time05()
            println("Plattform haben.  Genieß  in der Zwischenzeit")
            time05()
            println("die  Zeit  mit  der  Familie  oder  Freunden.")
            time05()
            println("Bis bald")
            angemeldet = false
            logIn()
            time15()
        }
        kundenportalEingabe==6 -> {
            menue()
        }
        kundenportalEingabe>=7 -> {
            println("Fehlerhafte Eingabe.")
            kundenportal()
        }
    }

}


fun kontostand (){
    println("-----------Kontostandabfrage------------")
    println("---Dein aktueller Kontostand beträgt:---")
    println("----------------$kontostandAccount------------------")
    println("----------------------------------------")
}

fun kontaktdaten (){
    println("---------Kontaktdaten----------")
    println("")
//    TODO if logIn dann die und die Kontaktdaten ausgeben



    readln()
}