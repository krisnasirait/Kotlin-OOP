interface MahlukHidup { //hanya bisa modififer public dan private
    fun bernafas()
    fun berkembangBiak()
    fun tempatTinggal()
    fun bergerakDengan()
}

class Manusia : MahlukHidup { // abstraction concept

    private var nama: String = "" //hanya bisa diakses dalam satu class yang sama

    fun tulisNama(){
        println(nama)
    }

    fun tulisNama(namaBelakang: String) { //polymorphism
        println(nama + " " + namaBelakang)
    }

    override fun bernafas() {
        "bernafas dengan paru-paru"
    }

    override fun berkembangBiak() {
        "berkembang biak dengan cara melahirkan"
    }

    override fun tempatTinggal() {
        "di rumah"
    }

    override fun bergerakDengan() {
        "bergerak dengan kaki"
    }
}

class Tumbuhan : MahlukHidup {

    private var jumlahDaun: Int = 0

    fun tambahJumlahDaun() {
        jumlahDaun++
    }

    fun tampilkanJumlahDaun() {
        println(jumlahDaun)
    }

    fun tampilkanJumlahDaun(daunKering: Int) { //polymorphism
        println(jumlahDaun + daunKering)
    }

    override fun bernafas() {
        "bernafas dengan berfotosintesis"
    }

    override fun berkembangBiak() {
        "berkembang biak dengan biji"
    }

    override fun tempatTinggal() {
        "tempat tinggalnya di hutan"
    }

    override fun bergerakDengan() {
        "bergerak mengikuti cahaya matahari"
    }
}