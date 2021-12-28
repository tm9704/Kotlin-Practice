package chap03.section3

fun main() {
    noParam({"Hello World!"})
    noParam{"Hello World!"}

    oneParam({a->"Hello World! $a"})
    oneParam{a->"Hello World! $a"}
    oneParam{"Hello World! $it"}

    moreParam{a,b -> "Hello World! $a $b"} // 매개변수 이름 생략 불가

    withArgs("Args1", "Args2", {a,b-> "Hello World $a $b"})

    withArgs("Args1", "Args2"){a,b -> "Hello World $a, $b"}
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String){
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String){
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a:String, b: String, out: (String, String) -> String){
    println(out(a,b))
}