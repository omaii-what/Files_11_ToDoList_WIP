import java.io.File

class FindTask(file: File) {
    init {
        println("=== Найти задачу ===")
        println("1. Найти по названию")
        println("2. Найти по категории")
        println("3. Найти по приоритету")
        when (readln()) {
            "1" -> {
                println("Введите название задачи:")
                val taskname = readln()
                val lines = file.readLines()
                var found = false
                for (line in lines) {
                    if (line.contains(taskname, ignoreCase = true)) {
                        println(line)
                        found = true
                    }
                }
                if (!found) println("Задачи не найдены")
            }
            "2" -> {
                println("Введите категорию:")
                val category = readln()
                val lines = file.readLines()
                var found = false
                for (line in lines) {
                    val parts = line.split("|")
                    if (parts.size > 3 && parts[3].contains(category, ignoreCase = true)) {
                        println(line)
                        found = true
                    }
                }
                if (!found) println("Задачи не найдены")
            }
            "3" -> {
                println("Выберите приоритет:")
                println("1 - HIGH")
                println("2 - MEDIUM")
                println("3 - LOW")
                val priority = when (readln()) {
                    "1" -> "HIGH"
                    "2" -> "MEDIUM"
                    "3" -> "LOW"
                    else -> ""
                }
                if (priority.isNotEmpty()) {
                    val lines = file.readLines()
                    var found = false
                    for (line in lines) {
                        if (line.contains("|$priority|")) {
                            println(line)
                            found = true
                        }
                    }
                    if (!found) println("Задачи не найдены")
                }
            }
            else -> println("!!! ОШИБКА !!! ВВЕДИТЕ ВЕРНОЕ ЗНАЧЕНИЕ !!!")
        }
    }
}