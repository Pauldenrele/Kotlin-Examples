package Fibonacci

fun main( args: Array<String>)
{
var program = Program()
program.fibonacci(8)
}

class Program{

    fun fibonacci (limit :Int ){
        var prev = 0
        var previous = 0
        var current = 1

        println ( current)

        for (i : Int in 1 ..limit){
            var tem = current
            prev = previous
            previous = tem
            current = prev + previous


        }
    }
}