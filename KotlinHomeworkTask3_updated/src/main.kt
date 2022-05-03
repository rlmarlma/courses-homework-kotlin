import java.util.Scanner

// Все, что выделено желтым, предлагает вариант "Add documentation"
fun main() {
    val numberOffset: Int = -1 //Для менюшки, чтобы номера не с 0 начинались.

    val file11 = File(null, "Picture1.png", ".png")
    val file12 = File(null, "Picture2.jpeg", ".jpeg")
    val file13 = File(null, "Picture3.bmp", ".bmp")

    val file21 = File(null, "Text1.txt", ".txt")
    val file22 = File(null, "Text2.fb2", ".fb2")
    val file23 = File(null, "Text3.epub", ".epub")

    val file31 = File(null, "Video1.avi", ".avi")
    val file32 = File(null, "Video2.mp4", ".mp4")
    val file33 = File(null, "Video1.mov", ".mov")

    val pictures = Folder(null, "Pictures", file11, file12, file13)

    val texts = Folder(null, "Texts", file21, file22, file23)

    val videos = Folder(null, "Videos", file31, file32, file33)

    val root = Folder(null, "root", pictures, texts, videos)

    root.getPath()
    root.readFolder()

    println("Select a folder")

    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()

    when (input) {
        1 -> {
            pictures.getPath()
            pictures.readFolder()
            println("Choose a file to get a file extension:")
            input = scanner.nextInt() + numberOffset
            pictures.getFile(pictures.getFolder(), input)
        }
        2 -> {
            texts.getPath()
            texts.readFolder()
            println("Choose a file to get a file extension:")
            input = scanner.nextInt() + numberOffset
            texts.getFile(texts.getFolder(), input)
        }
        3 -> {
            videos.getPath()
            videos.readFolder()
            println("Choose a file to get a file extension:")
            input = scanner.nextInt() + numberOffset
            videos.getFile(videos.getFolder(), input)
        }
    }
}
