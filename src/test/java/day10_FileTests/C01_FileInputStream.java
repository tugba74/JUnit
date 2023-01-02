package day10_FileTests;

import com.github.javafaker.File;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_FileInputStream {

    @Test
    public void test01() throws FileNotFoundException {
        String dosyaYolu = "C:\\Users\\as\\Desktop\\MerhabaJava.docx";

        FileInputStream fis= new FileInputStream(dosyaYolu);

        /*
            File testlerinde genellikle dowloads'a indirilecek bir dosyanin
            indirildigini test etmek
            veya masaustundeki bir dosyanin web'e yuklenebildigini test etmek isteriz
            Ancak herkesin bilgisayirinin ismi, kullanici isimleri gibi farkliliklar
            olacagindan testler tek bir bilgisayda calisacak gibi yazilmak zorunda kalinir.
            Bu karisikligin onune gecebilmek icin Java
            2 basit kod blogu sunmus
         */

        System.out.println(System.getProperty("user.dir"));
        // o anda calisan dosyanin (C01_FileInputStreeam) yolunu verir
        // /Users/as/Desktop/com.Team105JUnit


        System.out.println(System.getProperty("user.home"));
        // kullanicinin temel path'ini verir.
        // /Users/as
        // Masaustune gitmek istersek
        // /Users/as + /Desktop eklememiz yeterlidir
        // Downloads'a gitmek istersek
        // /Users/ahmetbulutluoz + /Downloads eklememiz yeterlidir
        // Kodlarimizin dinamik olmasi yani kisinin bilgisayarindaki
        // kullanici adi gibi detaylara takilmamasi icin
        // File testlerinde kullanilacak dosya yolunu
        // user.home... temel path'ini calistigi bilgisayardan alacak sekilde
        // olustururuz
        // dosyaYolu="/Users/as/Desktop/MerhabaJava.docx";

        String dinamikDosyaYolu= System.getProperty("user.home") +"/Desktop/MerhabaJava.docx";


    }
}
