class Buku (var judul : String, var pengarang : String, var penerbit : String,var tahun : String){

}

fun main(args : Array<String>) {
    val BukuDemo = Buku("Introduction to Java programming","Y. Daniel Liang","Beos","2009")
    val BukuDemo2 = Buku ("Buku Sakti HTML, CSS & Javascript: Pemrograman Web Itu Gampang","Adam Saputra, S.Si.","Anak Hebat Indonesia","2019" )
    println("Judul : "+BukuDemo.judul)
    println("Pengarang : "+BukuDemo.pengarang)
    println("Penerbit : "+BukuDemo.penerbit)
    println("Tahun : "+BukuDemo.tahun)
    println()
    println("Judul : "+BukuDemo2.judul)
    println("Pengarang : "+BukuDemo2.pengarang)
    println("Penerbit : "+BukuDemo2.penerbit)
    println("Tahun : "+BukuDemo2.tahun)
}
