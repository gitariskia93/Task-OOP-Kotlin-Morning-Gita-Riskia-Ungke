package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        print("Enter N2:")
        var n2:Int= readLine()!!.toInt()
        var Div=100/n2
        println("DIV:$Div")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("app is done")
}

