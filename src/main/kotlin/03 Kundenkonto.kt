

fun kundenportal (){
    println("----------Kundenportal----------")
    time10()
    println("--1: ---Kontaktdaten")
    time05()
    println("--2: ---Kontaktdaten ändern")
    time05()
    println("--3: ---Allgemeines")
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
            kundendaten()
            kundenportal()
        }
        kundenportalEingabe==2 -> {
//            TODO Kontaktdaten ändern
            kundendatenAendern()
            kundenportal()
        }
        kundenportalEingabe==3 -> {
//            TODO Passwort ändern
            allgemeines()
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

fun kundendaten (){

    println("-------------------------------")
    println("---------Deine Daten-----------")
    println("-------------------------------")
    time10()

    println("Bitte Log dich erneut ein, um deine Kundendaten zu sehen.")
    time05()
    println("Benutzername:")
    var benutzerNameKundendaten = readln()
    println("Passwort:")
    var passwortKundendaten = readln()
    angemeldet = benutzerNameKundendaten in kundendaten && passwortKundendaten == kundendaten[benutzerNameKundendaten]!!
    if (angemeldet) {
        println("Vielen Dank $benutzerNameKundendaten.")
        println("-------------------------------------")
        println("E-Mail: ${emailKunde[benutzerNameKundendaten]}")
//        println("Dein aktuelles Passwort ist: ${kundendaten[benutzerNameKundendaten]}")
        println("Alter: ${alterKunden[benutzerNameKundendaten]}")
        println("Adresse: ${adresseKunde[benutzerNameKundendaten]}")
        println("Telefonnummer: ${telefonKunde[benutzerNameKundendaten]}")
        println("-------------------------------------")
        println("Weiter mit Enter")

    } else {
        println("Einloggen fehlgeschlagen. Bitte versuch es erneut.")
        logIn()
    }
    readln()
}

fun kundendatenAendern (){

    println("-------------------------------")
    println("---------Daten Ändern----------")
    println("-------------------------------")
    time10()

    println("Bitte Log dich erneut ein, um deine Kundendaten zu ändern.")
    time05()
    println("Benutzername:")
    var benutzerNameKundendaten = readln()
    println("Passwort:")
    var passwortKundendaten = readln()
    angemeldet = benutzerNameKundendaten in kundendaten && passwortKundendaten == kundendaten[benutzerNameKundendaten]!!
    if (angemeldet) {
        println("Vielen Dank $benutzerNameKundendaten.")
        println("-------------------------------------")
        println("E-Mail: ${emailKunde[benutzerNameKundendaten]}")
//        println("Dein aktuelles Passwort ist: ${kundendaten[benutzerNameKundendaten]}")
        println("Alter: ${alterKunden[benutzerNameKundendaten]}")
        println("Adresse: ${adresseKunde[benutzerNameKundendaten]}")
        println("Telefonnummer: ${telefonKunde[benutzerNameKundendaten]}")
        println("-------------------------------------")
        println("Bitte Wähle die zuändernden Daten:")
        time05()
        println("--1: ---E-Mailadresse")
        time05()
        println("--2: ---Dein Alter")
        time05()
        println("--3: ---Deine Adresse")
        time05()
        println("--4: ---Deine Telefonnummer")
        time05()
        println("--5: ---Passwort ändern")

        var aendernKontaktdaten = readln().toInt()

        when {
            aendernKontaktdaten==1 ->{
                println("Bitte gib deine neue Emailadresse ein:")
                var email = readln()
                emailKunde.replace(benutzerNameKundendaten, email)
            }
            aendernKontaktdaten==2 -> {
                println("Bitte gib hier dein Alter ein:")
                var alter = readln().toInt()
                alterKunden[benutzerNameKundendaten] = alter
            }
            aendernKontaktdaten==3 -> {
                println("Bitte gib deine neue Adresse ein:")
                var adresse = readln()
                adresseKunde[benutzerNameKundendaten] = adresse
            }
            aendernKontaktdaten==4 -> {
                println("Bitte gib deine neue Telefonnummer ein:")
                var telefon = readln()
                telefonKunde[benutzerNameKundendaten] = telefon
            }
            aendernKontaktdaten==5 -> {
                println("Bitte gib hier dein neues Passwort ein:")
                var passwort = readln()
                kundendaten[benutzerNameKundendaten] = passwort
            }
            aendernKontaktdaten>=6 -> {
                println("Fehlerhafte Eingabe")
                kundenportal()
            }
        }

    } else {
        println("Einloggen fehlgeschlagen. Bitte versuch es erneut.")
        logIn()
    }
    println("Weiter mit Enter")
    readln()
}

fun allgemeines (){
    println("----------Allgemeines----------")
    time10()
    println("Dieser Text ist nur  ein Platzhalter und")
    time05()
    println("eignet sich perfekt, um allen das Gefühl")
    time05()
    println("zu  vermitteln  hier stünde  tatsächlich")
    time05()
    println("etwas  wirklich wichtiges,  was in naher")
    time05()
    println("Zukunft  ja tatsächlich so  sein könnte.")
    time05()
    println("In jedem  Fall ist  es nicht  so einfach")
    time05()
    println("aus  freien  Stücken  in  diesem  Moment")
    time05()
    println("einen  solchen Text zu verfassen.  Mario")
    time10()
    println("Weiter mit Enter")
    readln()
}