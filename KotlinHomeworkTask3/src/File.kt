class File(override var ParentObject: String, override var name: String, var extension: String) : AbstractFileSystemNode() {

    override fun returnExtension() {
        println(extension)
    }
}