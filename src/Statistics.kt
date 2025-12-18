import java.io.File

class Statistics(file: File) {
    val filee = file.readLines().toMutableList()
    val losh = mutableListOf<String>()
    val pravda = mutableListOf<String>()
    val LOW = mutableListOf<String>()
    val MEDIUM = mutableListOf<String>()
    val HIGH = mutableListOf<String>()
    init {
        for (i in filee) {
            if (i.contains("false")) {
                losh.add(i)
            }
        }
        for (i in filee) {
            if (i.contains("true")) {
                pravda.add(i)
            }
        }
        for (i in filee) {
            if (i.contains("LOW")) {
                LOW.add(i)
            }
        }
        for (i in filee) {
            if (i.contains("MEDIUM")) {
                MEDIUM.add(i)
            }
        }
        for (i in filee) {
            if (i.contains("HIGH")) {
                HIGH.add(i)
            }
        }
        println("=== Статистика ===")
        println("Задач всего: ${filee.size}")
        println("Задач выполнено: ${pravda.size}")
        println("Задач не выполнено: ${losh.size}")
        println("Задач с низким приоритетом: ${LOW.size}")
        println("Задач с средним приоритетом: ${MEDIUM.size}")
        println("Задач с высоким приоритетом: ${HIGH.size}")
    }
}