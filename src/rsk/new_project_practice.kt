package rsk

import Interface.newInterface
import Interface.realInterface

fun main (args:Array<String>) {
    var mans :String = "goat"
    var man = arrayOf(arrayOf(1 , 2 , 3) , arrayOf(4,5,6) , arrayOf(6,7 ,8))

    for(i in man.indices) {
        println("This is the array + ${man[i]}")
    }

    fun add ( numi : Int , numj :Int) = numi + numj

    println("Add it ${add(9,8)}")

    var arr = arrayOf( 1, 2 , "dof" , 6.5 , 7.9)
    println("It contains it if:  ${arr.contains("dof")}"  )


fun got (nam:Int , nim:Int ):Int{

    var sum = nam + nim

    return sum

}
    println("The sum is ${got(9,9)}")
}













