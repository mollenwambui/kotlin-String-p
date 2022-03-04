fun main(){
    string()
    var statement= nameAndage("Mollen",21)
    println(statement)
    var school= strings("Akirachix")
    println(school)

    println()
    myName("lucy")
}

//1.Given a string “akirachix”. Write a function that prints out a string composed of
//the first, third and fourth characters of the string .

fun string(){
    var school="akirachix"
    println(school[1].toString()+school[3]+school[4])
}
// a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively

fun nameAndage(name:String,age:Int):String{

    var statement=" Hi,My name is $name and i am $age years old"
    return statement
}
//Write a function that takes in a String and returns its length

fun strings(word:String):Int{
    var school= word.length
    return school
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun myName(name:String){
    if (name.equals("Mollen")){
        println("That's me")
    }  else
        println("I don't know who that is")
}