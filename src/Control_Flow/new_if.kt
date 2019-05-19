package Control_Flow

fun main (args: Array<String>){

    val a : Int = 4
    val b : Int = 5

    var max : Int


     max = if ( a > b ) a else b

    print ( "min is" + max)


    //while

    var e :Int = 0

    println("Ehyo this for the while part")

    while (e<10){
        println(e)
        e++
    }
//when
    val x = 9

    when ( x ) {
        8-> println("it is 8")
        10->println ("it is not 8")
    else ->{
        println("it is none ")
    }
    }



    //forloops

    val list = listOf(1,2,3,4,5)

    for (i in list ) println ( "This is number " + i)


    for (x in 1..9) println ("The number is   " + x)


    for (( index , value) in list.withIndex() ){

        var mar = index + 1
        println(" The number $mar  on the list is $value ")


    }


    var k :Int = 0

    do {
        k =k +10

        println("The ages of the guys are --" + k)
    }while(k <70)



    val q:String = "pauki"
 val names = listOf("ade" , "pauki" , "pauli" , "iyin")

    when(q){

        in names -> println("Yes it is part of the list")
        else -> {
            println("it is not there")
        }
    }

    val str = "Hello"

    if (str.length==0){
        println ("The string is empty")
    }
    else if (str.length==2){

    }


}

