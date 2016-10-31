package _2HTMLBuilders

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun createSimpleTable() =
        createHTML().table {
            tr {
                for (i in 1..3) {
                    td { +"$i" }
                }
                td { +"cell" }
            }
        }

fun main(args: Array<String>) {
    println(createSimpleTable())
}