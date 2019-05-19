package rsk

import com.sun.tools.corba.se.idl.constExpr.Positive

fun main (args:Array<String>){

    val num = 1

    loop@ for (num in 1..12){

        println(num * 2)


        when (num){
            10 -> println("stop")

        }

        if(num ==10){
            break
        }
    }


    //Given a list of numbers and a number k , return whether any two number from the list add up
    //to k

    val mList:IntArray = intArrayOf(1,2,3,4)
    val a :String= "It is true"
    val b :String= "It is false"

/* val x  =   mList[0] + mList[1] || mList[1] +mList[2] ||mList[0] + mList[2]
            || mList[0] +mList[3] || mList[1] + mList[3] || mList[2] +mList[3]*/
    val k :Int = 7


    when (  mList[0] + mList[1]==k || mList[1] +mList[2]==k ||mList[0] + mList[2]==k
            || mList[0] +mList[3]==k || mList[1] + mList[3]==k || mList[2] +mList[3]==k ){
        true-> println(a)


        else ->{
            println(b)
        }
    }


    val list = intArrayOf(1,2,2 ,2 ,0)

    println(hashSetOf(list.average()))



    println(list.average())

    fun addthree (x :Int) = x + 3

     val fuk = listOf(1 , 2 , 3 , 4).map ( ::addthree )

    println(fuk)




}

