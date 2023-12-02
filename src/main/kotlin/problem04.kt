fun main(args:Array<String>) {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val media = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5)

    println("MEDIA = %.1f".format(media))
}