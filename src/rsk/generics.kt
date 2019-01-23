package rsk

fun main ( args: Array<String>){
    var a = gene<String>("java")
    var b  = gene<Int> (10)

}

class gene<T>(input: T){

 init {
     println(" i am the baddest$input")
 }

}