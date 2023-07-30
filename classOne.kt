class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
)

fun main() {
    // name argument convention
    val remigiuszFrost = Teacher(
        name="Remigiusz", surname="Frost", birthday="23.07.1987",status="ACTIVE"
    )
    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)
    println(biology1.isObligatory)
    println(biology1.teacher.birthday)
    println(biology1.teacher.status)
}