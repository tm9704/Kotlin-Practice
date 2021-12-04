package chapter02.self

fun main(){
    val a: Int = 1 //Int형 변수 a를 선언하고 1을 할당
//    val b: Double = a //자료형 불일치로 오류 발생
//    val c: Int = 1.1 //자료형 불일치 오류 발생

    val b: Double = a.toDouble() // 변환 메서드
    val result = 1L + 3 // Long형 + Int형 -> result는 Long형
}








