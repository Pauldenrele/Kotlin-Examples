package Class_Objects

fun  main( args: Array<String>){

    val book  = Book("GOAT", " MONEY", 4)

    println (" This is the" + book.Kotlin)
    println("This is the" + book.author)
    println ( " oya wait stop there " + book.toString())
    println ( " gbe fun won " + book.hashCode())

}
data class  Book ( var Kotlin : String , var author : String  , var num : Int )