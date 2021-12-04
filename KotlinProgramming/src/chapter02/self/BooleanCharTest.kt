package chapter02.self

fun main(){
    val isOpen = true // isOpen은 Boolean형으로 추론
    val isUploaded: Boolean // 변수를 선언만 한 경우 자료형(Boolean)을 반드시 명시

    val ch = 'c' // ch는 Char로 추론
    val ch2: Char // 변수를 선언만 한 경우 자료형(Char)을 반드시 명시

    val code: Int = 65
    val chFromCode: Char = code.toChar() //code에 해당하는 문자를 할당
    println(chFromCode) //결과

    //val ch4: Char = 'ab' => 2개 이상의 문자는 Char에 담을 수 없음

    val ch3 = '\uD55C' // 유니코드로 '한'이라는 문자 지정
}