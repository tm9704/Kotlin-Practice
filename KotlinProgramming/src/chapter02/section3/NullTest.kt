package chapter02.section3

fun main(){
    var str1 : String = "Hello Kotlin"
    //str1 = null => 오류 null을 허용하지않음
    println("str1: $str1")

    var str2 : String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2")

   // println("str2: $str2 length: ${str2.length}") => 세이프콜(?.)이나 non-null 단정 기호(!!.)만 허용
    println("str2: $str2 length: ${str2?.length}") //세이프콜 사용

    //println("str2: $str2 length: ${str2!!.length}") => NPE 강제 발생

    //조건시을 이용해 null 상태 검사
    val len = if(str2 != null) str2.length else -1
    println("str2: $str2 length: ${len}")
}