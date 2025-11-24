import java.io.File
data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val priority: Priority, // HIGH, MEDIUM, LOW
    val dueDate: String,
    val isCompleted: Boolean = false,
    val createdAt: String
){


}
