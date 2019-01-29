package rsk

fun main (args:Array<String>){

    //Adding numbers to a while list

    fun addNum (x:Int) = x + 7

  val list =   listOf(1 , 2, 3 ,4).map(::addNum)

    println(list)



}