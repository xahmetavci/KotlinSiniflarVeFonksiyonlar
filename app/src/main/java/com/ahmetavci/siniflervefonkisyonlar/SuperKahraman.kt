package com.ahmetavci.siniflervefonkisyonlar

class SuperKahraman(var isim:String, var yas:Int, var meslek:String) { //Primary Constructor yapısı (birincil constructor)

    /*
    //Property (Sınıfların Özellikleri)
    var isim = ""
    var yas = 0
    var meslek = ""

    /*Constructor
    (İnşa Etmek yapıyı oluşturmak manasına gelmektedir) Cunstructor ise özel bir fonksiyonun ismine denmekte
    nerdeyse bütün programlama dillerinde olan bir yapıdır. Constructor bir sınıftan oluşturduğumuz nesneyi/objeyi çağıran bir fonskiyondur.
    */
    constructor(isim: String, yas: Int, meslek: String){
        this.isim = isim
        this.yas = yas
        this.meslek = meslek
        println("constructor çağırıldı")
    }
    */

    fun testFonksiyonu(){ //private fun yazdığım taktirde MainActivity.kt dosyamızdan bu fonksiyona erişimimiz olmayacaktır.
        println("test")
    }

    private var sacininRengi = "Sarı"

    //Getter - Alıcı
    fun sacRenginiAl() : String{
        return this.sacininRengi
    }

    /*
    Setter - Ayarlayıcı
    fun sacRenginiDegistir(){
        this.sacininRengi = "Kırmızı"
    }
    */

    /*
    Access Levels - Erişebilirlik Seviyeleri
    Kısaca açıklamak gerekirse yazdığımız bir fonskiyonu yada yazdığımız bir değişkeni nerden? nasıl? ulaşabiliriz sorularına cevap verdiği yapılardır.
    Bu yapılardan dört adet bulunmaktadır.
    private - protected - internal - public/open

    private: Yazdığım fonkiyonu sadece o sınıf içersinden kullanılabilir. Başka bir yerden erişim sağlanamaz
    protected: Korunmuş, Aynı dosya içersinden başka bir sınıfın dışından ulaşılabilir.
    internal: sadece kendi modüllerimiz içersinden ulaşılabilir demek. Kendi Android uygulamıza dış bir kütüphane eklediğimizde o kütüpahene içersinden ulaşılamayacaktır.
    public: her yerden ulaşılabilir demek
    */


}