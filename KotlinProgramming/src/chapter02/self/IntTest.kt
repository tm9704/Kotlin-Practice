package chapter02.self

fun main(){
    val num05 = 127 //Int형 추론
    val num06 = -32768 //Int형 추론
    val num07 = 2147483647 //Int형 추론
    val num08 = 9223372036854775807 //Long형 추론

    val exp01 = 123 //Int형 추론
    val exp02 = 123L //접미사 L을 사용해 Long형으로 추론
    val exp03 = 0x0F //접두사 0x를 사용해 16진 표기가 사용된 Int형으로 추론
    val exp04 = 0b00001011 //접두사 0b를 사용해 2진 표기가 사용된 Int형으로 추론

    val exp08: Byte = 127 //명시적으로 자료형을 지정 (Byte)
    val exp09 = 32767 //명시적으로 자료형을 지정하지 않으면 Short형 범위의 값도 Int형으로 추론
    val exp10: Short = 32767 //명시적으로 자료형을 지정(Short)
}