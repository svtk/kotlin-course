package _2HTMLBuilders

fun createTable() =
        table {
            tr {
                td {
                }
            }
        }

fun table(init: TABLE.() -> Unit): TABLE {
    return TABLE().apply(init)
}

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) {
        doInit(TR(), init)
    }
}

class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) {
        doInit(TD(), init)
    }
}

class TD : Tag("td")

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()
    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString() =
            "<$name>${children.joinToString("")}</$name>"
}

fun createAnotherTable() = table {
    for (i in 1..2) {
        tr {
            td {
            }
        }
    }
}

fun main(args: Array<String>) {
    println(createTable())
}