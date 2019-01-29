package rsk

fun main ( args:Array<String>){

    val a :Int = 20

    println("the major answer is --" + answer(a) )

    for (x in 1..10){

        if (x ==11){

            println("it will soon break --" + x)
            break
        }else {
            println("It will soon break --" + x)
            continue
        }
    }

}

fun answer (a:Int):Int{
    return 2*a

}

//Break and Continue
// Break -- It terminates the controller flow if a particular condition is met while Continue does
//opposite


