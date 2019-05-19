package Class_Objects

//Base_Class -> Class that is inherited from
//Derived_Class -> Class that inherits from base class
//Init Arguments -> Arguments passed to the constructor of a base class
// Function_Definition -> Function in a derived class that is different than the same in base class
//DC-Object -> "Derived class Object" Object that has a type of derived class


//Notes
//Classes are final by default in Kotlin which means they cannot be inherited from
//The SubClass can access both the derived and the base class


open class obj1 {  //Base_Class
    val x = 5
}

class  obj2: obj1() {   //Derived Class
    fun obj3 (){
        println("This the third object $x" )
    }
}

fun main (args:Array<String>){  //SubClass
    val derived = obj2()
    derived.obj3()
}




