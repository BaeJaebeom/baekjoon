import java.util.*

fun main(args: Array<String>) {

    var sc: Scanner = Scanner(System.`in`)
    var t: Int = sc.nextInt()

    for (i in 0 until t) {
        var n: Int = sc.nextInt()

        var list0 = mutableListOf<Int>(1, 0)
        var list1 = mutableListOf<Int>(0, 1)

        for (j in 2..n) {
            list0.add(list0[j - 1] + list0[j - 2])
            list1.add(list1[j - 1] + list1[j - 2])
        }
        println("${list0[n]} ${list1[n]}")
    }
}