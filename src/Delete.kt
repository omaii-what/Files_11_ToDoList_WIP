import java.io.File

class Delete(file: File) {
    val content = file.readLines().toMutableList()
    var result = 0
    var count = 0

    init {
        for (i in content) {
            println(i)
        }
        println("=== Удалить задачу ===")
        println("Введите id задачи, которую вы хотите удалить: ")
        val delete = readln().toInt() - 1
        content.removeAt(delete)
        for (i in content) {
            val rewrite = content[result].split("|").toMutableList()
            rewrite[0] = "${result+1}"
            content[result] =
                "${rewrite[0]}|${rewrite[1]}|${rewrite[2]}|${rewrite[3]}|${rewrite[4]}|${rewrite[5]}|${rewrite[6]}|${rewrite[7]}"
            result++
        }
        while (count != content.size - 1) {
            content[count] += "\n"
            count++
        }
        file.delete()
        for (i in content) {
            file.appendText(i)
        }
    }
}