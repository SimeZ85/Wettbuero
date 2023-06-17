
//TODO ----------Globale Maps----------

var kundendaten = mutableMapOf<String, String>("Mario Schindler" to "015226182842",
                                                "Porno Paul" to "GinaWild123",
                                                "Peter Pansky" to "Polsky")

var person1 = Person("Mario Schindler", 25, "Rendsburger Straße 32, 25782 Tellingstedt", "01522/6182842")
var person2 = Person("Porno Paul", 38, "Kumschot Straße 33, 10405 Berlin", "04821/43151345")
var person3 = Person("Peter Pansky", 48, "Bresslauer Alleski 22, 4345 Warschau", "02346/52635")

var kundendatenTest = mutableMapOf(person1 to "015226182842", person2 to "GinaWild123", person3 to "Polsky")
var kundendatenListeMehr = mutableListOf(person1, person2, person3)


//TODO ----------Globale Listen----------
//Fahrerliste Auto-Motorsport

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
