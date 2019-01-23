package rsk

fun main (args:Array<String>){
    val b = Student("hello" , "mana ")

    val (name , don) = b


    println("fomr $name thing $don")

}

data class Student (val a :String , val b : String){

    val name :String = a
    val don : String = b

}
