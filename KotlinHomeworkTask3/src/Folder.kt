

class Folder(override var ParentObject: String, override var name: String, vararg inside: FileSystemNode) : AbstractFileSystemNode() {
    var filesInside: MutableList<FileSystemNode> = emptyList<FileSystemNode>().toMutableList()

    init {
        filesInside.addAll(inside.asList())
    }

    var i: Int = 0
    fun readFolder() {
        filesInside.forEach() {
            var num = i + 1
            println("$num)" + filesInside.get(i))
            i = i + 1
        }
    }

    fun getFile(list: MutableList<FileSystemNode>, i: Int) {
            return println(list[i].returnExtension())
    }

    override fun returnExtension(){
        return returnExtension()
    }

}
