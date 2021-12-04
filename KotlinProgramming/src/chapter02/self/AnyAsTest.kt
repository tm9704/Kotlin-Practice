package chapter02.self

fun main(){
    val x: Any
    x = "Hello"
    if(x is String){
        println(x.length) // x는 자동적으로 String으로 스마트 캐스트
    }

    val z: Any = "String"
    val y: String = z as String //-> z가 null이면 형변환이 불가능
//    val y: String? = z as? String -> 예외 발생을 피하기 위한 ? 사용

    println("$y and $z")
}