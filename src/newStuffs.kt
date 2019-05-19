fun main(array: Array<String>){
    //To now the data type
    if(true is Boolean){
        println("True is a boolean")
    }

    var letters : Char = 'A'
    println("A is a char : ${letters is Char}")

    println("-------------------------------------------------------------------------")

    //Conversions
    println("Double to Int :" + (3.45.toInt()))
    println("A to Int " + ('D'.toInt()))

    println("--------------------------------------------------------------------------")

    //Strings
    //Val means a value that is not going to change

    val myName = "Pauli"
    val yName = "Denre"

    val lStr = """This is the longest string i have ever seen in my entire damn fucking life mehn this crazy and this is real shit""".trimMargin()

    val fullName = myName + yName
    println("NAME : ${fullName}")
    println("The length ${lStr.length}")

    println( "Are they Equal : ${myName.equals(yName)}")

    println("Comparison : ${"A".compareTo("C")}")

    println("SECOND Index : ${lStr.get(2)}  OR ${lStr[2]}")

    println("Index 2-9 : ${lStr.subSequence(2,9)}")

    println("It Contains : ${lStr.contains("longest")}")

    println("------------------------------------------------------------------------------")

    println("Arrays")
    //Arrays
     var myArray = arrayOf(1 ,5 ,"foat"  )
    println(myArray[2])

    myArray[1] = 6

    println("Arrays Length : ${myArray.size}")

    println("foat in the array : ${myArray.contains("foat")}")

    println("The index of : ${myArray.indexOf("foat")}")

    println("First Array : ${myArray.first()}")

    var sqArray = Array(5 , {x->x*x})
    println(sqArray[4])

    println("-------------------------------------------------------------------------------")

    //Ranges
    val oneToTen = 1..10
    println("the range of 1to10 ${oneToTen}")

    val alpha = "A".."Z"

    println("The alphabets : ${alpha}")

    println("The alphabets : ${"R" in alpha}")

    val tentoone = 10.downTo(1)
    val range = 2.rangeTo(30)
    val steps = oneToTen.step(2)

    for(x in steps) println("steps : ${x}")

    for(x in tentoone.reversed()) println("reverse : ${x}")

    println("------------------------------------------------------------------------------")

    //Conditionals

    // We have if , else , elseif , when

    var age = 7
    if(age < 7){
        println("Go to daycare")
    }
    else if (age == 7){
        println("Go to Kindergarten")
    }
    else {
        println("No fvcking school for you")
    }
//Using when func for the principle

    when(age ){
        0,1,2,3,4,5,6-> println("Go to kindergarten")

         7 -> println("Go to kindergarten")

        in 6..19 -> println("Go to preschool")

    }


}