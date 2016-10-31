package _3DropdownExample.impl

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun buildDropdown3() = createHTML().dropdown {
    dropdownButton { +"Dropdown" }
    dropdownMenu {
        item("#", "Action")
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }
}

fun main(args: Array<String>) {
    println(buildDropdown3())
}

fun UL.item(href: String, name: String) = li { a(href) { +name } }

fun UL.divider() = li { role = "separator"; classes = setOf("divider") }

fun UL.dropdownHeader(text: String) =
        li { classes = setOf("dropdown-header"); +text }

fun DIV.dropdownMenu(block: UL.() -> Unit) = ul("dropdown-menu", block)

fun DIV.dropdownButton(block: BUTTON.() -> Unit) = button(classes = "btn dropdown-toggle") {
    block()
    span(classes = "caret")
}

fun TagConsumer<String>.dropdown(
        block: DIV.() -> Unit
): String = div("dropdown", block)