package Functions

fun main (args:Array<String>){


    fun doOndays(days: Days){

        when(days){
            Days.Sunday -> "Good Morning it is sunday"
            Days.Monday -> "Good moerning sir it is Monday"
            Days.Tuesday -> "Good morning sir it is tuesday"
            Days.Wednesday ->"Good morning sir it is wednesday"

        }

    }

}

enum class Days{

    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,

}





