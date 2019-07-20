/**
 * This code was proudly written by PauLi
 *
 * 20th of July 2019
 */

fun main(args: Array<String>){
    var biggestInt: Int = Int.MAX_VALUE
    var smallestInt: Int = Int.MIN_VALUE

    var text:String = "My Name is Paul"

    println("The subsequence is ${text.subSequence(4,9)}")

    //Ans: ame

    println("This contains ${text.contains("Name")}")

    //Ans:True


    var mArray = arrayOf(1.2, 3, 4, "Goat")

   // mArray[2] = 5


    var partArray = mArray.copyOfRange( 0,1)

    println("This is : ${mArray.first()}")

    //Ans: 1.2
    println("This is the last :${mArray.last()}")

    //Ans:Goat
    var sqArray = Array(6 , {x->x*x})

    println("The square is : ${sqArray[2]}")

    //Ans: 4

    val OneToten = 1..10

    val  AtoZ = "A".."Z"

    println("AtoZ: ${AtoZ}")

    //Ans: A..Z

    println("F in AtoZ:  ${"F" in AtoZ}")

    //Ans: True

    val TentoOne = 10.downTo(1)
    val rangeto = 2.rangeTo(10)

    for(x in TentoOne) println("Print 10 to one :$x")
    for(x in rangeto) println("Yhe range is: $x")

    for(x in TentoOne.reversed()) println("Print in reversed : $x")

    //Ans:10,9,8,7,6,5,4,3,2,1
    //Ans:2,3,4,5,6,7,8,9,10

    //Ans: 1 to 10


    val  oneToTwenty = 1..20

    println("Odd is : ${oneToTwenty.any { it % 2 != 0  }}")
    println("Odd is : ${oneToTwenty.all { it % 2 != 0  }}")

    //Ans:True
    //Ans:False

    for( x in oneToTwenty) println("*7 : ${x*7}")

    //Run it yourself

    val map = mutableMapOf<Int , Any?>()

    map[1] = "Pauli"

    map[4] = 90

    map.put(3 , 'A')

    for((x , y) in map ) println( "Key: $x and Value:$y" )


 val answer = Animal("Goat" , 40 , 180 , 90.0)
    answer.getInfo()


val bowser = Yam("Lion " , 40 , 50 , 90.0,"Me")
    bowser.getInfo()


}

open class  Animal(val name :String , val age:Int , val height:Int , val weight:Double ){


    init {
        val  regex = Regex(".*//d+.*")

        require(!name.contains(regex)) {"Animal name musn't contain decimal "}

        require(age>10) {"It must be greater than 10" }

        require(height>100) {"The height must be greater than 100"}

        require(weight>89.0) {"Weight must be greater than 89"}


    }


    open fun getInfo():Unit{
        println("Name: $name , Age: $age , Height: $height , Weight : $weight")
    }


}



class Yam (name:String , age: Int,  height:Int , weight: Double , val owner :String):
        Animal(name  , age , height , weight ){


    override fun getInfo() {
        println("Name: $name , Age: $age , Height: $height , Weight : $weight")
    }



}

