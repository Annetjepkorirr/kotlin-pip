fun main() {
    println(identity("I am a student at AkiraChix"))

    println(numbers(20,50))

    val classify=listOf("mazda","audi","awd","axio","BMW","Lexus")
    val cars = content(classify)
    println(cars)


    var names= getName("personal","projects")
    println(names)




}
//write a function that takes in a string as a parameter and returns the reverse of that string

fun identity(stmt:String):String {
    return stmt.reversed()

}
//write a function that takes in two intergers as a parameter and returns the sum of all
// intergers between them

fun numbers(num1:Int, num2:Int):Int{
    return  num1+ num2
}


//write a function that takes in a list of strings as a parameter and returns a new list with only
//a string that contains a letter "a"

fun content(contents:List<String>):List<String>{
    return contents.filter { it.contains('a') }

}

fun getName(First: String, Second: String):String{
    var fullname = First + " " + Second
    return fullname
}
