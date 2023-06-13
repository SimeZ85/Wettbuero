class `06 DTM Autorennnen` (){

    var driverCar1 = driverCar.shuffled()

    var fahrer1: Fahrer = Fahrer(driverCar1.last(), ageList.random())
    var fahrer2: Fahrer = Fahrer(driverCar1.last(), ageList.random())
    var fahrer3: Fahrer = Fahrer(driverCar1.last(), ageList.random())
    var fahrer4: Fahrer = Fahrer(driverCar1.last(), ageList.random())
    var fahrer5: Fahrer = Fahrer(driverCar1.last(), ageList.random())


    init {
        println(fahrer1)
        println(fahrer2)
        println(fahrer3)
        println(fahrer4)
        println(fahrer5)
    }

//TODO Fahrer integrieren
//TODO Wetten platzieren
//TODO Simulation integrieren
//TODO Auswertung und Einsätze übertragen


}