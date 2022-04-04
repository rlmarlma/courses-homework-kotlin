interface FileSystemNode {
    fun returnParent() : String

    fun returnName() : String

    fun returnPath() : Unit

    fun setParent(parent: FileSystemNode) : Unit

    fun returnExtension()
}