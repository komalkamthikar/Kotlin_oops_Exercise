package oops

fun main(args: Array<String>) {

    val car=Car("2016","blue",4000,12000)
    car.displayCarInfo()
    println(car.checkCarStatus())
}

class Car
{

    var modelNo:String=""
    var color:String=""
    var price:Int=0
    var kilometerDriver=0
    constructor(modelNo:String,color:String,price:Int,kilometerDriver:Int)
    {
        this.modelNo=modelNo
        this.color=color
        this.price=price
        this.kilometerDriver=kilometerDriver
    }

    fun checkCarStatus():String
    {
        if(kilometerDriver<=5000)
            return "car is in new condition"
        else if(kilometerDriver in 5001..20000)
            return "car is in good condition"
        return "car is old"
    }

    fun displayCarInfo()
    {
        println("ModelNo: $modelNo \nPrice: $price \nKilometer_Driver: $kilometerDriver  \nColor: $color")
    }

}