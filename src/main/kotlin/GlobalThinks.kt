
//TODO ----------Globale Maps----------

var roulette = mutableMapOf(0 to "Grün", 1 to "Rot", 2 to "Schwarz", 3 to "Rot",
                            4 to "Schwarz", 5 to "Rot", 6 to "Schwarz", 7 to "Rot",
                            8 to "Schwarz", 9 to "Rot", 10 to "Schwarz", 11 to "Schwarz",
                            12 to "Rot", 13 to "Schwarz", 14 to "Rot", 15 to "Schwarz",
                            16 to "Rot", 17 to "Schwarz", 18 to "Rot", 19 to "Rot",
                            20 to "Schwarz", 21 to "Rot", 22 to "Schwarz", 23 to "Rot",
                            24 to "Schwarz", 25 to "Rot", 26 to "Schwarz", 27 to "Rot",
                            28 to "Schwarz", 29 to "Schwarz", 30 to "Rot", 31 to "Schwarz",
                            32 to "Rot", 33 to "Schwarz", 34 to "Rot", 35 to "Schwarz",
                            36 to "Rot")

var kundendaten = mutableMapOf<String, String>("Mario Schindler" to "015226182842",
                                                "Porno Paul" to "GinaWild123",
                                                "Peter Pansky" to "Polsky")
var alterKunden = mutableMapOf("Mario Schindler" to 37, "Porno Paul" to 25, "Peter Pansky" to 28)
var adresseKunde = mutableMapOf("Mario Schindler" to "Rendsburger Straße 32, 25782 Tellingstedt",
                                "Porno Paul" to "Süderholmer Straße 78, 25782 Heide",
                                "Peter Pansky" to "Ella-Kay-Straße 14, 10405 Berlin")
var telefonKunde = mutableMapOf("Mario Schindler" to "015226182842",
                                "Porno Paul" to "0483278878822",
                                "Peter Pansky" to "0900666666")
var emailKunde = mutableMapOf("Mario Schindler" to "dj.simez3@googlemail.com",
                                "Porno Paul" to "pornopaul25@pHub24.de",
                                "Peter Pansky" to "p.pansky123@nimmerlandsky.nim")

var person1 = Person("Mario Schindler", 25, "Rendsburger Straße 32, 25782 Tellingstedt", "01522/6182842")
var person2 = Person("Porno Paul", 38, "Kumschot Straße 33, 10405 Berlin", "04821/43151345")
var person3 = Person("Peter Pansky", 48, "Bresslauer Alleski 22, 4345 Warschau", "02346/52635")

var kundendatenTest = mutableMapOf(person1 to "015226182842", person2 to "GinaWild123", person3 to "Polsky")
var kundendatenListeMehr = mutableListOf(person1, person2, person3)


//TODO ----------Globale Listen----------


var driverCar = mutableListOf<String>("Mario Schindler", "Enes Kasap", "Eduard Lukatskyy",
                                      "Peter Pan", "Bratwurst Bernhard", "Hubertus Humbuck",
                                      "Barnabas Basilius", "Steckzapfen Steffan", "Holz Harald",
                                      "Thomas Müller", "Mett Machmut", "Wurstfach Werner")

var jockeys = mutableListOf<String>("Oscar Schindler", "Leonardo DaVinci", "Arnold Schwarzenegger",
                                    "Thomas Mann", "Ernst Thälmann", "Christopher Columbus",
                                    "Alice Weidel", "Shawn Michaels", "Archibald Blake")

var driverBike = mutableListOf<String>("Märchen Mohamet", "Porno Paul", "Dängel Dethlef",
                                       "Gustaf Ganz", "Mila Superstar", "Sailor Moon",
                                       "Dagobert Duck", "Tick Trick und Track", "Donald Duck",
                                        "Die Panzerknacker", "Daisy Duck")

var angepissteFahrer = driverCar.shuffled()

//TODO ----------Zeitschleifen----------

fun time05(){
    Thread.sleep(300.toLong())
}

fun time10(){
    Thread.sleep(500.toLong())
}

fun time15(){
    Thread.sleep(1500.toLong())
}

fun time20(){
    Thread.sleep(2000.toLong())
}

//TODO ----------Verschiedenes----------

var simListDriver = mutableListOf(1, 2, 3, 4, 5)

var m01 = simListDriver.random()

//TODO ----------Kundenspezifisch----------

var bankkontoGuthaben = 5000.0
var kontostandAccount = 500.0
