import java.io.File
import kotlin.system.exitProcess
fun main() {
    val file = File("C:\\Users\\androidstd\\Desktop\\tasks.txt")
    println("=== TO-DO LIST ===" +
                "\n1. Показать все задачи" +
                "\n2. Добавить задачу" +
                "\n3. Найти задачу" +
                "\n4. Отметить как выполненную" +
                "\n5. Удалить задачу" +
                "\n6. Статистика" +
                "\n0. Выход")
    while (true) {
        when (readln()) {
            "1" -> println(file.readText())
            "2" -> 1
            "3" -> 1
            "4" -> 1
            "5" -> 1
            "6" -> 1
            "0" -> exitProcess(1)
            else -> {
                println("!!! ОШИБКА !!! ВВЕДИТЕ ВЕРНОЕ ЗНАЧЕНИЕ !!!")
                continue
            }
        }
    }
}