package Interface


interface  newInterface {

    var myInt:Int

    fun myAbs():String

    fun Hello(){
        println("heyo this is my first interface shit ")
    }

}

open class realInterface: newInterface {

    override  var myInt:Int = 35
    override fun myAbs() :String = "This another real sturv"
}

fun main ( args: Array<String>){
    val obj = realInterface()

    println ("This is my integer + ${obj.myInt}")

    println("This is the one for hello + ${obj.Hello() }")

    val obil = newestInterface()

    println("This is from the newest interface  + ${obil.A()}")
}


interface  A{

    fun A (){
        println ( " Heyo ")
    }


}

interface  B {

    fun B (){
        println("Heyo this is the seconf nigga")

    }

}

class newestInterface : A, B
{
    override fun A() {
        println("This is the override ")
    }


}


