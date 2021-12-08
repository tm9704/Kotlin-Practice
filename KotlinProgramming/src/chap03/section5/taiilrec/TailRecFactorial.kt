package chap03.section5.taiilrec

import chap03.section5.factorial

fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if(n == 1) run.toLong() else factorial(n-1, run*n)
}