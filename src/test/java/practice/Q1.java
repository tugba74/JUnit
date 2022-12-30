package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
/*..........Exercise1............
    BeforeClass ile driver'i olusturun ve class icinde static yapin
    Maximize edin ve 10 sn bekletin
    http://www.google.com adresine gidin
    arama kutusuna "The Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Harry Potter" yazip, cikan sonuc sayisini yazdirin
    AfterClass ile kapatin
     */

   static WebDriver driver;
   /*
   @AfterClass
   public  static  void tearDown(){
       driver.close();
   }
   */

   //Beforeclass le drver olusturun ve class çnde statc yapın
    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //maximize edin ve 10sn bekletn
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    //http://www.google.com adresine gidin
    @Test
    public void test01(){
       driver.get("http://www.google.com");


    }

}
