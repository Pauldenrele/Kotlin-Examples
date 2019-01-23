package rsk

import java.sql.Time

interface  time {
    fun setTime ( hours: Int , mins : Int =0, sec: Int)
    fun setTime (time: PuluTime)
}

interface  Endof{
    open fun setTime ( time : PuluTime)
}
class PuluTime {
    var hours :Int = 0
    var mins :Int= 2
    var secs =3
}




