package _1Questions

fun main(args: Array<String>) {
    breakfastMenu {
        item {
            name = "Belgian Waffles"
            price = 5.95
            calories = 650
        }
    }
}

class BreakfastMenu {
    val items = mutableListOf<BreakfastMenuItem>()

    fun item(f: BreakfastMenuItem.() -> Unit) =
            BreakfastMenuItem().apply { f(); items += this }
}

fun breakfastMenu(init: BreakfastMenu.() -> Unit): BreakfastMenu {
    // can be rewritten using 'apply' as well
    val breakfastMenu = BreakfastMenu()
    breakfastMenu.init()
    return breakfastMenu
}

class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null

}