package rsk

import org.omg.CORBA.ARG_IN.value

fun main (args: Array<String>){

    val a : Int = 4
    val b : Int = 5

    var max : Int


     max = if ( a > b ) a else b

    print ( "min is" + max)



//when
    val x = 9

    when ( x ) {
        8-> println("it is 8")
        10->println ("it is not 8")
    else ->{
        println("it is none ")
    }
    }



    //forloops

    val list = listOf(1,2,3,4,5)

    for (i in list ) println ( "This is number " + i)


    for (x in 1..9) println ("The number is   " + x)


    for (( index , value) in list.withIndex() ){

        var mar = index + 1
        println(" The number $mar  on the list is $value ")


    }





}

