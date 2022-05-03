// Все, что выделено желтым, предлагает вариант "Add documentation"
class File(
    override var parentObject: FileSystemNode?,
    override val fileNodeName: String,
    val extencion: String
) : AbstractFileSystemNode() {

    fun getExtension(): String =
        extencion
}