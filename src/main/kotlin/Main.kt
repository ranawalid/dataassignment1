import java.util.*

fun main() {
    var arr1 = mutableListOf<String>()
    println("please enter number of elements:")
    var N = Scanner(System.`in`).nextInt()

    println("please enter your values ")
    var inp = ""
    for ( i in 0 until N){
        print("${i + 1} : ")
        inp = readln()
        inp = inp.uppercase()
        arr1.add(inp)
    }

    var arr2 = arr1.filter { it.contains("M") || it.contains("B") } as MutableList<String>

    arr2.forEach(){
        println(it)
    }

}
