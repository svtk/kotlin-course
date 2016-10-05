package _1Questions

fun task3(list1: List<Int?>, list2: List<Int>?) {

    list1.size
    list2?.size
//
    val i: Int? = list1.get(0)

    val j: Int = list2?.get(0) ?: 0
    val j1: Int? = list2?.get(0)
}

//    List<Int?> - список, в котором могут храниться нулевые ссылки
//    [1, null, 2]

//    List<Int>? - переменная такого типа сама может быть null, но при этом в списке хранятся только ненулевые элементы
//    null | [1, 2, 3]

//    List<Int?>? - и сам список, и элементы в нем могут быть null
//    null |   [1, null, 2]
