package rsk

fun main ( args:Array<String>){

    val obj = ore()

    println(obj.mp3())


    val obk = ope.nested()

    println(obk.mp4())

}

class ore {

    fun mp3() = "It is the normal class"
}

class ope{
     class nested {

         fun mp4 () = "It is the nested class yayyyy"
     }
}


