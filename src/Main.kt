import java.io.File
import kotlin.system.exitProcess
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val file = File("C:\\Users\\Anna\\Desktop\\Tasks.txt")
    println(
        "\n=== TO-DO LIST ===" +
                "\n1. Показать все задачи" +
                "\n2. Добавить задачу" +
                "\n3. Найти задачу" +
                "\n4. Отметить как выполненную" +
                "\n5. Удалить задачу" +
                "\n6. Статистика" +
                "\n0. Выход"
    )
    while (true) {
        when (readln()) {
            "1" -> println(file.readText())
            "2" -> AddTask(file)
            "3" -> FindTask(file)
            "4" -> MarkTask(file)
            "5" -> Delete(file)
            "6" -> Statistics(file)
            "0" -> exitProcess(1)
            else -> {
                println("!!! ОШИБКА !!! ВВЕДИТЕ ВЕРНОЕ ЗНАЧЕНИЕ !!!")
                continue
            }
        }
    }
}

fun getCurrentDateTime(): String {
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    return currentDateTime.format(formatter)
}
