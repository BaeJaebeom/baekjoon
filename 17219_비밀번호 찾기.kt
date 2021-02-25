import java.io.*
import java.util.*
import kotlin.collections.HashMap

fun main() {
    val reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val writer: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var input: String = reader.readLine()
    var tokenizer: StringTokenizer = StringTokenizer(input)

    val n:Int = tokenizer.nextToken().toInt()
    val m:Int = tokenizer.nextToken().toInt()

    val map: HashMap<String, String> = hashMapOf()

    for(i in 0 until n){
        input = reader.readLine()
        tokenizer = StringTokenizer(input)
        map[tokenizer.nextToken()] = tokenizer.nextToken()
    }

    for(i in 0 until m){
        input = reader.readLine()
        writer.write(map[input])
        writer.newLine()
    }
    writer.flush()
    reader.close()
    writer.close()
}
