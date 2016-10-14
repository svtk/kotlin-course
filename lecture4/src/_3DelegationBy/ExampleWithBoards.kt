package _3DelegationBy

interface Cell {
    val i: Int
    val j: Int
}

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

interface SquareBoard {
    val width: Int

    fun getCell(i: Int, j: Int): Cell
    fun getCellOrNull(i: Int, j: Int): Cell?

    fun getAllCells(): Collection<Cell>

    fun getRow(i: Int, jRange: IntProgression): List<Cell>
    fun getColumn(iRange: IntProgression, j: Int): List<Cell>

    fun Cell.getNeighbour(direction: Direction): Cell?
}

interface GameBoard<T> : SquareBoard {

    operator fun get(cell: Cell): T?
    operator fun set(cell: Cell, value: T?)

    operator fun get(i: Int, j: Int): T?
    operator fun set(i: Int, j: Int, value: T?)

    operator fun contains(value: T): Boolean

    fun filter(predicate: (T?) -> Boolean): Collection<Cell>
    fun any(predicate: (T?) -> Boolean): Boolean
    fun all(predicate: (T?) -> Boolean): Boolean
}

class SquareBoardImpl(override val width: Int) : SquareBoard {

    override fun getCell(i: Int, j: Int): Cell = TODO()
    override fun getCellOrNull(i: Int, j: Int): Cell = TODO()
    override fun getAllCells(): Collection<Cell> = TODO()
    override fun getRow(i: Int, jRange: IntProgression): List<Cell> = TODO()
    override fun getColumn(iRange: IntProgression, j: Int): List<Cell> = TODO()
    override fun Cell.getNeighbour(direction: Direction): Cell = TODO()
}

class GameBoardImpl<T>(
        val squareBoardImpl: SquareBoardImpl
) : GameBoard<T>, SquareBoard by squareBoardImpl {

    override fun get(cell: Cell): T = TODO()
    override fun set(cell: Cell, value: T?) = TODO()
    override fun get(i: Int, j: Int): T = TODO()
    override fun set(i: Int, j: Int, value: T?) = TODO()
    override fun contains(value: T): Boolean = TODO()
    override fun filter(predicate: (T?) -> Boolean): Collection<Cell> = TODO()
    override fun any(predicate: (T?) -> Boolean): Boolean = TODO()
    override fun all(predicate: (T?) -> Boolean): Boolean = TODO()
}