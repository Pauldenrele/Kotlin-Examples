package rsk


// declaring var
fun main (args: Array<String>){

//inheritance
    var a = BCD()

    a.thinkie()


    var b= ghi()
    b.think()


    val gen : Char

    gen = 'A'

    println("$gen")


    //boolean

    val ben : Boolean
    ben = true
    println(" Heyo i think the boolean is" + " $ben")

 //String

    val ken: String
    val hen:String
    ken = "Heyo this is ken"
    hen = "Heyo this is hen"


    println ("Introduce yourself" + ken)

    println("Introduhce yourself too  " + hen)


    //Array

    val nem : IntArray = intArrayOf(1,2,3,4,5)

    println ("The second number of the array is " + nem[2])


    //Collections

    val mute : MutableList<Int> = mutableListOf(1,2,3,4,5)
        println("The third number of the mutable arraylist is " + mute[2])
     val imute:List<Int> = listOf(6,7,8,9)

    mute.add(9)

    println(mute)

    println (imute)

    println ("The even number in this stuff is " + mute.filter { it % 2 == 0 } )

    println ( "The even number in  this stuff is " + imute.filter { it % 2 == 0 })

    val hash = hashMapOf( "foo"  to 1 , "gar" to 2 , " gor" to 4)
    println ("the hashMap  is " + hash["foo"])

    val sets = hashSetOf( "a" , "a" ,"b" , "b" , "b" , "c")

    println(sets)

    //Ranges

    val i : Int = 2

    for (j in 1..4){
        println (j)
    }

    if ( i in 1..9){
        println(i)
    }


    //ifelse






}

//Inheritance
//It is open so that it can be inherited
open  class  ABC{

    fun thinkie(){

        println("This is the inheritance ")
    }

}

class BCD:ABC(){

}

open class def{
   open fun think(){
        println("this is the second one ")
    }
}

class ghi:def(){

   override fun think(){
        println("this is the same thing as the second one ")

    }



}






