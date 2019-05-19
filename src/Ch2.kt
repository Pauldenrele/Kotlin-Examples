import sun.applet.Main

fun main (args:Array<String>) {
    val mList:IntArray = intArrayOf(1,2,3,4)
    val a :String= "It is true"
    val b :String= "It is false"

/* val x  =   mList[0] + mList[1] || mList[1] +mList[2] ||mList[0] + mList[2]
            || mList[0] +mList[3] || mList[1] + mList[3] || mList[2] +mList[3]*/

    //If k is 7
    val k :Int = 7


  when (  mList[0] + mList[1]==k || mList[1] +mList[2]==k ||mList[0] + mList[2]==k
            || mList[0] +mList[3]==k || mList[1] + mList[3]==k || mList[2] +mList[3]==k ){
        true-> println(ans(k))


        else ->{
            println(b)
        }
    }
}

fun ans (k:Int): Boolean {
    return  true
}