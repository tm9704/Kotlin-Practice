package chap04.secton1

fun main() {
    cases("Hello") // String형
    cases(1) //Int형
    cases(System.currentTimeMillis()) //현재시간(밀리초)을 Long형 값으로 반환
    //cases(MyClass()) //객체
}

fun cases(obj: Any){
    when(obj){
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}