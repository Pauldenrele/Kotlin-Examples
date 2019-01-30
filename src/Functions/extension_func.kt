package Functions

fun main (args:Array<String>){

  val exText = "There are too        much space       in       this thing"

    println(replacethisspaces(exText))
    println(exText.replacethosespaces())
}

fun replacethisspaces(value: String): String {

    val regex = Regex("i")
    return regex.replace(value , " ")
}

fun String.replacethosespaces():String{

    val regex= Regex("i")
    return regex.replace(this , " ")
}

