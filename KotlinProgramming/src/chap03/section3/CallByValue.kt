package chap03.section3

fun main() {
    val result = callByValue(lambda()) // 람다식 함수를 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean{ //일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

var lambda: ()->Boolean = {
    println("lambda function")
    true // 여기가 반환
}