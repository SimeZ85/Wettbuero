

fun testSimulation(): Int{

    if(simListDriver.random()==1){
        println(" |   §  §  §  §  §   | ")
        time05()
        println(" |   §  .  .  .  .   | ")
        return 1
    } else if (simListDriver.random()==2){
        println(" |   §  §  §  §  §   | ")
        time05()
        println(" |   .  §  .  .  .   | ")
        return 2
    } else if (simListDriver.random()==3){
        println(" |   §  §  §  §  §   | ")
        time05()
        println(" |   .  .  §  .  .   | ")
        return 3
    } else if (simListDriver.random()==4){
        println(" |   §  §  §  §  §   | ")
        time05()
        println(" |   .  .  .  §  .   | ")
        return 4
    } else {
        println(" |   §  §  §  §  §   | ")
        time05()
        println(" |   .  .  .  .  §   | ")
        return 5
    }


}

fun simulation ():Int {

    var fahrer1 = "Fahrer1"
    var fahrer2 = "Fahrer2"
    var fahrer3 = "Fahrer3"
    var fahrer4 = "Fahrer4"
    var fahrer5 = "Fahrer5"

    println(" |   §  §  §  §  §   | ")
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    testSimulation()
    time10()
    if (testSimulation() == 1) {
        println("$fahrer1 hat gewonnen")
        return 1
    } else if (testSimulation() == 2) {
        println("$fahrer2 hat gewonnen")
        return 2
    } else if (testSimulation() == 3) {
        println("$fahrer3 hat gewonnen")
        return 3
    } else if (testSimulation() == 4) {
        println("$fahrer4 hat gewonnen")
        return 4
    } else if (testSimulation() == 5) {
        println("$fahrer5 hat gewonnen")
        return 5
    } else {
        println("Das Rennen wurde abgebrochen!")
        return 6
    }

}
