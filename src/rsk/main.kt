

package rsk


fun main (args: Array<String>  ){
   val text = "spaces       kaxhsgh       ksjnxshb"
  println(replace(text))
}

fun replace (value :String ) : String {
    var regex = Regex("\\s+")
    return regex.replace(value , " ")

}



