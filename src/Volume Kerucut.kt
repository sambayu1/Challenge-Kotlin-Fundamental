import java.util.*

fun main() {
    var jari: Float
    var volumepi: Float
    val tinggi: Double

    val reader = Scanner(System.`in`)

    print("Masukkan Jari jari : ")
    jari = reader.nextFloat()

    print("Masukkan Tinggi : ")
    tinggi = reader.nextDouble()

    volumepi = (((jari * jari * 22 / 7 * tinggi) / 3).toFloat())
    val s = String.format("%.2f", volumepi)
    println("===========================")
    print("Jadi Volume Kerucut = $s")
}