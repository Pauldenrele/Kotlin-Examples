package rsk

fun main ( args: Array < String> ){

 val h1 = Head("H1")
    val h2 = Head("H2")
    val h3 = h1.plus(h2)


}
class Head (var name : String ){}

 fun Head.plus(other:Head):Head{
     return Head ( this.name + other.name)
 }
