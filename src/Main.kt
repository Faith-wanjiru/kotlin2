fun main() {
    word(name = "Ada")
    answer(num1 = 42, num2 = 7)
    set(num1 = 34, num2 = 56, num3 = 34, num4 = 23)
    sentence(interest = "I Love Smiling")
}


fun  word(name: String) {
    var sentence = "Hello ${name}"
    println(sentence)
}


fun answer(num1: Int ,
           num2: Int):Int {
    var division = num1 % num2
    println(division)
    return division


}


fun set(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    println(sum)
    return sum
}


fun sentence(interest: String){
    println(interest)
}





