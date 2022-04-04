abstract class AbstractFileSystemNode : FileSystemNode {

    abstract var ParentObject: String
    abstract var name: String

    override fun returnParent() : String {
        return ParentObject
    }

    override fun returnName(): String {
        return name
    }

    override fun returnPath() {
        if (ParentObject == "none") {
            println(":/" + name)
        }else{
            println(":/" + ParentObject + "/" + name)
        }
    }

    override fun setParent(parent: FileSystemNode) {
        ParentObject = parent.returnName()
    }

    override fun toString(): String {
        return name
    }
}