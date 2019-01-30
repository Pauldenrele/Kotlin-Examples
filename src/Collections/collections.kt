package Collections

fun main (args:Array<String>){

    //Using List

    var list = listOf("one" , "two" , "three" , "four")
    println(list)

    //Using Map

    var map = mapOf(Pair("one" , "1") , Pair("two" , "2") , Pair("THREE" , "3"))
    println(map)

    //Using set

    var sett = setOf("one" , "two" , "three" , "four")
    println(sett)
}