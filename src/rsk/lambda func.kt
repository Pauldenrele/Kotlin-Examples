package rsk

fun main (args:Array<String>){
    var n: (String) -> Unit = {s: String -> print(s)}
    var v = "hi oshey baddest"
    myg(v , n)
}

fun myg (a: String , action:(String) -> Unit){

    print("heyyy")
   action(a)




}
