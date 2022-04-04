import java.util.Scanner

fun main(){
    val numOffset: Int = -1 //Для менюшки, чтобы номера не с 0 начинались.

    val file11 = File("Parent", "Picture1.jpeg", ".jpeg")
    val file12 = File("Parent", "Picture2.png", ".png")
    val file13 = File("Parent", "Picture3.bmp", ".bmp")

    val file21 = File("Parent", "Text1.txt", ".txt")
    val file22 = File("Parent", "Text2.fb2", ".fb2")
    val file23 = File("Parent", "Text3.epub", ".epub")

    val file31 = File("Parent", "Video1.avi", ".avi")
    val file32 = File("Parent", "Video2.mp4", ".mp4")
    val file33 = File("Parent", "Video1.mov", ".mov")

    val Pictures = Folder("Parent", "Pictures", file11, file12, file13)

    val Texts = Folder("Parent", "Texts", file21, file22, file23)

    val Videos = Folder("Parent", "Videos", file31, file32, file33)

    val root = Folder("none", "root", Pictures, Texts, Videos)

    file11.setParent(Pictures)
    file12.setParent(Pictures)
    file13.setParent(Pictures)

    file21.setParent(Texts)
    file22.setParent(Texts)
    file23.setParent(Texts)

    file31.setParent(Videos)
    file32.setParent(Videos)
    file33.setParent(Videos)

    Pictures.setParent(root)
    Texts.setParent(root)
    Videos.setParent(root)

    root.returnPath()
    root.readFolder()

    println("Select a folder")

    val scanner_variable = Scanner(System.`in`)
    var input = scanner_variable.nextInt()

    when(input){
        1 -> {
            Pictures.returnPath()
            Pictures.readFolder()
            println("Choose a file to get a file extension:")
            input = scanner_variable.nextInt() + numOffset
            Pictures.getFile(Pictures.filesInside, input)
        }
        2 -> {
            Texts.returnPath()
            Texts.readFolder()
            println("Choose a file to get a file extension:")
            input = scanner_variable.nextInt() + numOffset
            Texts.getFile(Texts.filesInside, input)
        }
        3 -> {
            Videos.returnPath()
            Videos.readFolder()
            println("Choose a file to get a file extension:")
            input = scanner_variable.nextInt() + numOffset
            Videos.getFile(Videos.filesInside, input)
        }
    }
}

