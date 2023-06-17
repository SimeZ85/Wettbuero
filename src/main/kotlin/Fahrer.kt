

class Fahrer(name: String, alter: Int): Person(name="", alter=0, adresse="", telefon=""){
    //var name: String
    //var alter: Int


    override fun toString(): String {
        return "$name, $alter"
    }

//    fun steckbrief (){
//        println("""
//        $name
//        $alter
//        """.trimIndent())
//    }

}