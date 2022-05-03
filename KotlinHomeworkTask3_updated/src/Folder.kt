// Все, что выделено желтым, предлагает вариант "Add documentation"
class Folder(
    override var parentObject: FileSystemNode?,
    override val fileNodeName: String,
    vararg inside: FileSystemNode
) : AbstractFileSystemNode() {
    private var filesInside: MutableList<FileSystemNode> = emptyList<FileSystemNode>().toMutableList()

    init {
        filesInside.addAll(inside)
        filesInside.forEach {
            it.setParent(this)
        }
    }

    fun readFolder() {
        var i = 0
        filesInside.forEach() {
            val number = i + 1
            i++
            println("$number)${it}")
        }
    }

    fun getFile(list: MutableList<FileSystemNode>, i: Int) {
        if (list[i] is File) {
            val fileSystemNode: File = list[i] as File
            println(fileSystemNode.getExtension())
        } else {
            println("This is not a file.")
        }
    }

    fun getFolder(): MutableList<FileSystemNode> = filesInside
}