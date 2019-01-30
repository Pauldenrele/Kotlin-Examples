package Functions

class alien {

    var skills: String = "hello watsup"

    fun priintMyskills(){
        println(skills)
    }
}

fun main(args: Array<String>){

    var a1 = alien()

    a1.skills= "Kotlin"

    var a2 = alien()

    a2.skills = "JAVA"


    var a3 = alien()

    a3.skills = a1.addMyskills(a2)
    


}

fun alien.addMyskills(a2: alien) : String {


  var a4 = alien()

    a4.skills =this.skills + " " + a2.skills
    return a4.skills


}
