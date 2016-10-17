package _4MoreInlineFunctions

fun sendEmailTo(email: String) { /*...*/ }

fun example(email: String?) {

    if (email != null) sendEmailTo(email)

    email?.let { sendEmailTo(it) }
}

data class Person(val email: String)

fun getTheBestPersonInTheWorld(): Person? = null

fun example2() {
    val person: Person? = getTheBestPersonInTheWorld()
    if (person != null) sendEmailTo(person.email)

    getTheBestPersonInTheWorld()?.let { sendEmailTo(it.email) }
}