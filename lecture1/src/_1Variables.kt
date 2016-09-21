package variables

fun main(args: Array<String>) {
    // read-only
    val question: String =
            "life, the universe, " +
                    "and everything"
    println("$question?")

    // mutable
    var answer: Int = 0
    answer = 42
    println(answer)

    // тип переменной выводится из инициализатора, если не указан явно и не может поменяться
//    answer = "no answer"

    // val обозначает неизменяемую ссылку, а не изменяемый объект
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
}