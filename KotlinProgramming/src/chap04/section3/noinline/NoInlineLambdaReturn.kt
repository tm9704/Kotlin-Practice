package chap04.section3.noinline

import chap04.section3.retFunc

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a,b)
}

//fun retFunc(){
//    println("start of retFunc")
//    inlineLambda(13, 3) lit@{a,b -> // 1. 람다식 블록의 시작 부분에 라벨을 지정
//        val result = a + b
//        if(result > 10) return@lit // 2.라벨을 사용한 블록의 끝부분으로 반환
//        println("result: $result")
//    } // 3. 이부분으로 빠져나감
//    println("end of retFunc")
//}

//암묵적 라벨
//fun retFunc(){
//    println("start of retFunc")
//    inlineLambda(13, 3) {a,b ->
//        val result = a + b
//        if(result > 10) return@inlineLambda
//        println("result: $result")
//    }
//    println("end of retFunc")
//}

//ver 익명함수
fun retFunc(){
    println("start of retFunc")
    inlineLambda(13, 3, fun(a,b){
        val result = a + b
        if(result > 10) return
        println("result: $result")
    })
    println("end of retFunc")
}