package rsk

fun main ( args: Array<String>){
 val tri:IntArray = intArrayOf(1 , 2, 3)
    val a:String = "It is forms a triangle "
    val b:String = "it is doesnt form a triangle"

    when(tri[0] + tri[1] > tri[2] || tri[2] + tri[0] > tri[1]
            || tri[2] + tri[1] >tri[0]){
        true -> println(a)

        else->{
            println(b)
        }
    }

}