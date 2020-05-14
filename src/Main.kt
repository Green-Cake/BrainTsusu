@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

import java.nio.file.Files
import java.nio.file.Paths
import kotlin.Exception

enum class Mode {
    NORMAL,
    JUMP_F,
    JUMP_B
}

fun convert(str: String): String =
    str.replace(">", "つつ")
        .replace("<", "つす")
        .replace("+", "つう")
        .replace("-", "すつ")
        .replace(".", "すす")
        .replace(",", "すう")
        .replace("[", "うつ")
        .replace("]", "うす")

fun main(args: Array<String>) {

    val src = when {
        args.getOrNull(0) == "-file" -> {
            String(Files.readAllBytes(Paths.get(args[1])))
                .replace("(//.*$)".toRegex(RegexOption.MULTILINE), "")
                .replace("\n|\r|\\s|　|\t".toRegex(), "")
        }
        args.getOrNull(0) == "-con" -> {
            println(convert(String(Files.readAllBytes(Paths.get(args[1])))))
            throw Exception()
        }
        else -> {
            readLine()!!
        }
    }

    println(src)
    println("# # # # # # # # # #")

    var cur = 0
    val heap = Array<UByte>(512) { 0u }
    var ptr = 0
    var mode = Mode.NORMAL

    fun getToken(i: Int) = src[i*2].toString() + src[i*2+1]

    try { a@while(cur*2+1 < src.length) {

        when (mode) {
            Mode.JUMP_F -> {
               var d = 0
                    while(true) {

                        if(getToken(cur) == "うつ")
                            d++
                        else if(getToken(cur) == "うす")
                            d--

                        if(getToken(cur) == "うす" && d == 0)
                            break

                    ++cur

                }
                ++cur
                mode = Mode.NORMAL
                continue@a
            }
            Mode.JUMP_B -> {
                var d = 0
                while(true) {

                    if(getToken(cur) == "うす")
                        d++
                    else if(getToken(cur) == "うつ")
                        d--

                    if(getToken(cur) == "うつ" && d == 0)
                        break

                    --cur

                }
                ++cur
                mode = Mode.NORMAL
                continue@a
            }
            else -> when(getToken(cur)) {
                "つつ" -> {
                    ++ptr
//                    println("$ptr P:$cur")
                }
                "つす" -> {
                    --ptr
//                    println("$ptr M:$cur")
                }
                "つう" -> heap[ptr]++
                "すつ" -> heap[ptr]--
                "すす" -> print(heap[ptr].toInt().toChar())
                "すう" -> heap[ptr] = readLine()?.get(0)?.toByte()?.toUByte() ?: 0u
                "うつ" -> if(heap[ptr] == 0u.toUByte()) { mode = Mode.JUMP_F; continue@a }
                "うす" -> if(heap[ptr] != 0u.toUByte()) { mode = Mode.JUMP_B; continue@a }
                "うう" -> print(heap[ptr])
                "まて" -> Thread.sleep(heap[ptr].toLong() * 100)
            }
        }

        ++cur
    } } catch (e: Throwable) {

        throw Exception("cur: $cur", e)

    }

}