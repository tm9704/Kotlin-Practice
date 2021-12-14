package chap04.section2

fun main() {
    print("Enter the lines: " )
    val n = readLine()!!.toInt() // 콘솔 입력

    for(line in 1..n){
        for(space in 1..(n - line)) print(" ") // 공백 출력
        for(star in 1..(2 * line - 1)) print("*") // 별 출력
        println() // 개행
    }
}