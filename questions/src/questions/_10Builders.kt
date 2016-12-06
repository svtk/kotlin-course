package questions.builders

data class Course(val name: String, val students: List<Student>)
data class Student(val name: String)


fun buildCourse(name: String, init: CourseBuilder.() -> Unit): Course =
        CourseBuilder(name).apply(init).build()

open class CourseBuilder(val name: String) {

    private val students = mutableListOf<Student>()

    fun student(name: String) {
        students += Student(name)
    }

    fun build() = Course(name, students)
}


// Реализуйте функцию buildCourse и класс CourseBuilder,
// так чтобы функция возвращала объект Course с упомянутыми в лямбда-аргументе студентами.

fun kotlinCourse() = buildCourse("Kotlin") {
    student("Alice")
    student("Bob")
    for (i in 1..2) {
        student("Anonymous #$i")
    }
}

fun main(args: Array<String>) {
    println(kotlinCourse())
// Course(name=Kotlin, students=[Student(name=Alice), Student(name=Bob), Student(name=Anonymous #1), Student(name=Anonymous #2)])
}
