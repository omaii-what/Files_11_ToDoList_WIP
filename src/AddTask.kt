import java.io.File

class AddTask(file: File) {
    val linenumber = file.readLines().last()
    val id = linenumber[0]
    val nextid = id + 1
    init {
        println("=== Добавить задачу ===")
        println("Введите название задачи: ")
        val title = readln()
        println("Добавьте описание: ")
        val description = readln()
        println("Назначьте категорию: ")
        val category = readln()
        println("Выберите приоритет: " +
                    "\n 1 = LOW" +
                    "\n 2 = MEDIUM" +
                    "\n 3 = HIGH"
        )
        var prioritet: Priority = Priority.LOW
        when (readln()) {
            "1" -> prioritet = Priority.LOW
            "2" -> prioritet = Priority.MEDIUM
            "3" -> prioritet = Priority.HIGH
        }
        println("Введите срок задачи (гггг-мм-дд: ")
        val dueDate = readln()
        val createdAt = getCurrentDateTime()
        val taskLine = "$nextid|$title|$description|$category|$prioritet|$dueDate|false|$createdAt"
        val lines = file.readLines()
        if (lines.isNotEmpty()) {
            file.appendText("\n")
        }
        file.appendText(taskLine)
        println("Задача добавлена!")
    }
}