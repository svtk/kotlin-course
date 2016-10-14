package _0MemberExtension

import _0MemberExtension.Direction.*

interface Cell {
    val i: Int
    val j: Int
}

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

interface SquareBoard {
    fun getCell(i: Int, j: Int): Cell
    fun getCellOrNull(i: Int, j: Int): Cell?

    fun getRow(i: Int, jRange: IntProgression): List<Cell>
    fun getColumn(iRange: IntProgression, j: Int): List<Cell>

    fun Cell.getNeighbour(direction: Direction): Cell?
}

abstract class SquareBoardImpl: SquareBoard {
    override fun Cell.getNeighbour(direction: Direction): Cell? {

        // можно обратиться к instance объекту outer класса:
        this@SquareBoardImpl

        // можно обратиться к receiver объекту extension функции:
        this@getNeighbour
        this  // просто this ссылается на ближайший labeled this

        return when (direction) {
            UP -> getCellOrNull(i - 1, j)
            DOWN -> getCellOrNull(i + 1, j)
            RIGHT -> getCellOrNull(i, j + 1)
            LEFT -> getCellOrNull(i, j - 1)
        }
    }
}

fun useBoard(board: SquareBoard) {
    with(board) {
        val cell = this.getCell(1, 1) // this можно опустить
        cell.getNeighbour(UP)
    }
}