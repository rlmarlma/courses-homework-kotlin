// Все, что выделено желтым, предлагает вариант "Add documentation"
abstract class AbstractFileSystemNode : FileSystemNode {

    abstract var parentObject: FileSystemNode?
    abstract val fileNodeName: String

    override fun getParent(): FileSystemNode? =
        parentObject

    override fun getName(): String =
        fileNodeName

    override fun getPath(): String {
        return if (parentObject == null){
            ":/"
        } else {
            ":/${parentObject!!.getName()}/$fileNodeName"
        }
    }

    override fun setParent(parent: FileSystemNode) {
        parentObject = parent
    }

    override fun toString(): String =
        fileNodeName
}