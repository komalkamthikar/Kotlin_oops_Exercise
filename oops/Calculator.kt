package oops

import java.util.Scanner;

fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    println("Enter the First number:")
    var num1=sc.nextInt()
    println("Enter the Second number: ")
    var num2=sc.nextInt()
    var cal=Calculation(num1,num2)
    println("Choose you option \n1.Addition\n2.Subtract\n3.Multiplication\n4.Division")
    var option=sc.nextInt()
    when(option){
        1->cal.Add()
        2->cal.Subtract()
        3->cal.Multiply()
        4->cal.Division()
        else->
            println("Choose correct option")
    }
}
class Calculation(num1:Int,num2:Int) {
    var number1: Int = num1
    var number2: Int = num2

    //add
    fun Add() {
        println("$number1 + $number2 = ${number1 + number2}")
    }

    //subtract
    fun Subtract() {
        println("$number1 - $number2 = ${number1 - number2}")
    }

    //multiply
    fun Multiply() {
        println("$number1 * $number2 = ${number1 * number2}")
    }

    //divide
    fun Division() {
        println("$number1 / $number2 = ${number1 / number2}")
    }

}