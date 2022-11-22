package oops

// parent class
open class Vehicle{

    open fun run(){
        println("Vehicle is running")
    }

    open fun drivenBy(name: String){
        println("Vehicle is driven by: $name")
    }
}
// child class
class Jeep: Vehicle(){

    override fun run() {
        println("Driving a Jeep")
    }

    override fun drivenBy(name: String) {
        println("Jeep is driven by $name")
    }
}

fun main() {
    val jeep = Jeep()
    jeep.run()
    jeep.drivenBy("Bhavesh")
}