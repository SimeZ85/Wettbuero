
//TODO ----------Globale Maps----------

var kundendaten = mutableMapOf<String, String>("Mario Schindler" to "015226182842",
                                                "Porno Paul" to "GinaWild123",
                                                "Peter Pansky" to "Polsky")

//TODO ----------Globale Listen----------
//Fahrerliste Auto-Motorsport

var driverCar = mutableListOf<String>("Mario Schindler", "Enes Kasap", "Eduard Lukanskyy",
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
    Thread.sleep(500.toLong())
}

fun time10(){
    Thread.sleep(1000.toLong())
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
