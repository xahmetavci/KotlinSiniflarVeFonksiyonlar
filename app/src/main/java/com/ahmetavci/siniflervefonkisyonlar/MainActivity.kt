package com.ahmetavci.siniflervefonkisyonlar

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //ilkFonksiyon() ,onCreate fonskiyonu içinde ilkFonksiyon adında ki fonksiyonmuzu çağırdır onCreate fonskiyonundan çıkmadan önce tanımladığımız ilkFonksiyon cağırıp öyle çıkacaktır.

        var j = -9

        if (j==0){
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma(50,23)
        var x = toplama(10,20)
        println(x) //logcat üzerinden x değişkeninin değerinin 30 olduğunu göreceğim

        var denemeText = findViewById<TextView>(R.id.textView) //Java Hiyerarşisinden kalma yapı. Layout(tasarım) kısmındaki elemanları adresleme için kullanılır.

        denemeText.text = "Sonuç: ${x}" //bunu çalıştırdığımda sanal cihazımda ekranda 30 değerimi göreceğim


        var butonum = findViewById<Button>(R.id.button) //farkında olduğunuz üzere onCreate fonksiyonun içine yazıldı uygulama çalıştırıldığında çalışmayacaktır. Button üstüne tıkladığımızda ne olcağına karar veren yapıya bürünecektir program ilk açıldığında.
        butonum.setOnClickListener {
            val toplamaSonucu = toplama(43,80)
            denemeText.text = "Sonuç = ${toplamaSonucu}"
        }

        sinifCalismasi()
        nullGuvenligi()

    }

    fun ilkFonksiyon() { //'ilkFonksiyon' diye bir fonskiyon tanımladım önündeki parantezler bu fonksiyonun çalıştırılabilir ve içerisinde parametre(girdi) alabilceğini göstermektedir
        println("İlk Fonksiyon Çalıştırıldı")

    }
    /*kodumuzu çalıştırdığımızda "ilk fonskiyon çalıştırıldı" yazısını göremicez sebebi
    ilkFonskiyon diye bir fonksiyon tanımladık ve hiçbiryerde kullanmadık. Hiçbir kod satırında bu fonskiyonu çağırmadık. */

    fun ikinciFonksiyon() {
        println("İkinci Fonskiyon Çalıştırıldı")
    }
    /*fonksiyonlar düzenli kod blokları yazmamıza olanak tanıyor,
     istediğimiz zaman isteğimiz yerde çağırmamıza olanak tanıyor,
     girdi alıp çıktı verebilmesi,
     son olarak birden fazla yerde, istediğim her yerde tanımladığım 'ilkFonksiyon' u çağırabilirim
     */

    //Girdi Almak
    fun cikarma(x: Int, y:Int){
        var denemeText = findViewById<TextView>(R.id.textView)
        denemeText.text = "Sonuç: ${x-y}"
    }

    //Değer Döndürmek (Return)
    fun toplama(a:Int, b:Int) : Int {
        return a + b
    }


    //Görünümler ve Fonskiyonlar

    /*
    //görünüm tarafından çağıracağımız tanımladığımız fonksiyonların içinde "view : View" yazıyoruz
    fun degistir(view : View){ // noktalı virgülden sonraki 'View' altı kırmızı ise alt+enter yapıp import edebilirsiniz
        val toplamaSonucu = toplama(14,56)
        var denemeText = findViewById<TextView>(R.id.textView)
        denemeText.text = "Sonuç: ${toplamaSonucu}"
    }

    onCreate Fonskiyonu içinde oluşturduğumuz "butonum.setOnClickListener{ }" ve yukarıdaki Layout kısmında fonksiyonumuzu atadığımız
    onClick yapıları ile aynı işlevleri yapmış oluruz.
    Not:
    tasarım kısmında ki onClick yapısı ile tanımladığımız fonskiyonu direk atayabilmekteyiz.
    onCreate fonskiyonu altında çağırmamıza gerek yoktur.
    İki yoldan birini yerine göre kullanarak, görünümler ve fonksiyonlar arasındaki ilişkiyi kurabiliriz
    */

    fun sinifCalismasi(){ //Sınıf büyük bir plan denebilir. Planın içinde icra ediceğimiz işin nesneler/oluşturulan objeler farklı farklı özelliklerini ve fonsiyonalitelerini tanımlarız
    // fonksiyonalite (functionality): Bir yazılımın belirlenen ve varsayılan ihtiyaçları yerine getiren fonksiyonları sağlayabilme yeteneği [ISO 9126]

        /*
        var superman = SuperKahraman() //SuperKahraman Sınıfınfan(Class) bir nesne oluştur
        superman.isim =  "Clark Kent - Christopher Reeve"
        superman.meslek = "Gazeteci"
        superman.yas = 52

        var deadpool = SuperKahraman()
        deadpool.isim = "Wade Wilson - Ryan Reynolds"
        deadpool.meslek = "Paraklı Asker"
        deadpool.yas = 47

        var batman = SuperKahraman()
        batman.isim = "Bruce Wayne - Christian Bale"
        batman.meslek = "Emlakçı"
        batman.yas = 50

        var denemeText = findViewById<TextView>(R.id.textView)
        denemeText.text = "Deadpool Karakterinin filmdeki ve gerçekteki ismi: ${deadpool.isim}"

        programı çalıştırdığımızda sanal cihazımızda "Deadpool Karakterinin filmdeki ve gerçekteki ismi: Wade Wilson - Ryan Reynolds"
        yazısını göreceğiz. sebebi ise onCrate fonskiyonu altında en son sinifCalisması fonksiyonumuzu çağırdığımız için.
        */

        var superman = SuperKahraman("Clark Kent",52,"Gazeteci")

        var denemeText = findViewById<TextView>(R.id.textView)
        denemeText.text = "Superman'in yaşı ${superman.yas}"

        superman.testFonksiyonu()

        println(superman.sacRenginiAl())

    }

    fun nullGuvenligi(){
        //Null, Nullability, Null Safety diye geçmektedir.

        //Tanımlamak, Definening
        var benimString: String? //sonuna soru işareti koyduğum takdirde null değeri alabilen bir string konumana geçmektedir. Not: Sadece string sınıfında geçerli değildir Double,Long,Int snıfları içinde geçerlidir.

        //ikisnin arasında 'benimString' bir değere sahip değil "Null" konumunda. Bir değere sahip olmadığı zaman başımıza sorunlar çıkartabilir.

        //İnitialization, Başlatmak (Tanımladığımız objeyi burada başlatıyoruz)
        benimString = "Ahmet"

        var benimYasim : Int? = null
        println(benimYasim)
        benimYasim = 21

        //Null Safety steps, Null kontrolü yolları

        //1
        if (benimYasim != null){
            println(benimYasim * 2)
        } else {
            println("null geldi")
        }

        //2
        //"!!" -> null olmayacak, "?" -> null olabilir
        println(benimYasim?.minus(2))

        //3
        //elvis operatörü
        //benimYasim = 21

        //null da olabilir olmayabilir güvenli olması açından ".?" koymak daha sağlıklı bu tür durumlarda.
        val sonuc = benimYasim?.minus(2) ?: 10 // ":" işaretinin sol tarafı sonuç 'null' gelmediği durumlarda çalışacak sağ tarafı ise null gelirse 10 değerine artıcak. şuan sonuç null olduğu için elvis opatörü logcat de sonuc değerini 10 yazdıracaktır.
        println(sonuc)

        //4
        //let

        //benimYasim = 23
        benimYasim?.let {//kısaca .let kod blogu oluşturuyor çalışma prensibi if else yapısına çok benzemektedir. Eğer benimYasim null ise kod blogu çalıştırılmıyor; null değil ise "benimYasim" değeri "it" e atanıyor/yazılıyor
            println(it * 5)

        }

    }

}