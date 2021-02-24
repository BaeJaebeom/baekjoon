import java.util.*
import kotlin.math.min

fun main() {
    /*
        내가 잘 이해가 안 돼서 적어둔 풀이

        1 = 1^1
        2 = 1^1 + 1^1
        3 = 1^1 + 1^1 + 1^1
        4 = 2^2
        5 = 1^1 + 2^2
        6 = 1^1 + 1^1 + 2^2
        7 = 1^1 + 1^1 + 1^1 + 2^2
        8 = 2^2 + 2^2
        9 = 3^3
        10 = 3^3 + 1^1

        모든 수는 4개의 제곱수로 되니까 지금 자신에서 최대 자신까지의 제곱수를 뺀 수 중에 가장 작은수를 구함
        만약 10을 구한다고 하면 1^1, 2^2, 3^3까지가 되는데
        10 - 1^1 = 9 / dp[9] = 1
        10 - 2^2 = 6 / dp[6] = 3
        10 - 3^3 = 1 / dp[1] = 1
        이 수들도 역시 몇개의 제곱수들로 이루어진 수 이니까
        계산할 때 빼둔 제곱수 하나만 더해도 된다고 판단하여 가장 작은수에 1만 더하면 된다
    */

    val sc: Scanner = Scanner(System.`in`)
    val n: Int = sc.nextInt()
    val dp: MutableList<Int> = mutableListOf(0, 1)
    var minValue: Int = 0

    for (i in 2..n) {
        minValue = Int.MAX_VALUE
        var j = 1
        while (j * j <= i) {
            minValue = min(minValue, dp[i - (j * j)])
            j++
        }
        dp.add(minValue + 1)
    }
    println(dp[n])
}
