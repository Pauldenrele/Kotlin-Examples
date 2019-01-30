package Functions

fun main (args:Array<String>){

    //Adding numbers to a while list

    fun addNum (x:Int) = x + 7

  val list =   listOf(1 , 2, 3 ,4).map(::addNum)

    println(list)

    println(hashSetOf(list))

    fun printNum ( vararg  numbers: Int){
        for ( number in numbers){

            println(number)
            println(printNum(1 , 2, 4 , 5))

        }

        printNum(1 , 2 , 3, 4, 5)
    }


}