package Class_Objects


sealed class ops {
    class  my5 : ops()
   class  my3 : ops()


}

fun main ( args: Array<String>){
    val el: ops = ops.my3()
    val out = when( el){
        is ops.my3 -> ( " yay")
        is ops.my5 -> ("gsdgdg")
    }

    println ( out)

}