package Class_Objects

fun main(args:Array<String>){

    val book : Kook = Kook("hello", "World", 5)

    println("The name pof the book is " + book.name )

    println ( " The author is " + book.Author)

}

data class  Kook(val name : String , val Author :String , val number : Int)