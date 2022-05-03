// Все, что выделено желтым, предлагает вариант "Add documentation"
interface FileSystemNode {

    fun getParent(): FileSystemNode?

    fun getName(): String

    fun getPath(): String

    fun setParent(parent: FileSystemNode)
}