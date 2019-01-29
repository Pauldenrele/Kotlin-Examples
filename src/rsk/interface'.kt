package rsk

interface mainInterface {

    fun word() :String = "speak the word of God"

}

class  fakeInterface:mainInterface{

    override  fun word(): String = "I really mean you should speak the word of God"
}

fun main(args:Array<String>){

    val mainWord =fakeInterface()

    println(mainWord.word())
}