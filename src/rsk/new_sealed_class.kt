package rsk

sealed class sealed{

    class mp1 : sealed()
    class mp2 : sealed()

}

fun main(args:Array<String>){

    val obj:sealed= sealed.mp2()

    val output = when (obj){
        is sealed.mp1 -> "It is mp1"
        is sealed.mp2-> "It is mp2"

    }
    println(output)

}

