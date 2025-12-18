import java.io.File

class MarkTask(file: File) {
    val content = file.readLines().toMutableList()
    val notdone = mutableListOf<String>()
    var count = 0
    init {
        for (i in content) {
            if (i.contains("false")) {
                println(i)
                notdone.add(i)
            }
        }
        println("=== Отметить задачу ===")
        println("Введите id задачи, которую вы хотите отметить: ")
        val result = readln().toInt() - 1
        val rewrite = content[result].split("|").toMutableList()
        rewrite[6] = "true"
        content[result] =
            "${rewrite[0]}|${rewrite[1]}|${rewrite[2]}|${rewrite[3]}|${rewrite[4]}|${rewrite[5]}|${rewrite[6]}|${rewrite[7]}"
        while(count!=content.size-1) {
            content[count] += "\n"
            count++
        }
        file.delete()
        for (i in content) {
            file.appendText(i)
        }
    }
}