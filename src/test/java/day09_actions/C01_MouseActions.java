package day09_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.Set;

public class C01_MouseActions extends TestBase {

    @Test
    public void test01(){
        // 1- Yeni bir class olusturalim: MouseActions1
        // 2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //3- Cizili alan uzerinde sag click yapin
        Actions actions=new Actions(driver);
        WebElement ciziliAlanElementi=driver.findElement(By.xpath("//*[@id='hot-spot']"));

        actions.contextClick(ciziliAlanElementi).perform();
        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String expectedAlertyazisi="You selected a context menu";
        String actualAlertyazisi=driver.switchTo().alert().getText();

        Assert.assertEquals(expectedAlertyazisi,actualAlertyazisi);
        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        //6- Elemental Selenium linkine tiklayalim

        String ilksayfaWHD=driver.getWindowHandle(); //
        System.out.println(ilksayfaWHD);
        driver.findElement(By.linkText("Elemental Selenium")).click();

        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

        Set<String> ikisayfaninWHDSeti=driver.getWindowHandles();

        String ikinciSayfaWHD="";

        for (String eachWHD: ikisayfaninWHDSeti){
            if(!eachWHD.equals(ilksayfaWHD)){

            }

        }
        driver.switchTo().window(ikinciSayfaWHD);
        String expectedYenisayfaYazi="Elemental Selenium";
        String actualYeniSayfaYazi= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedYenisayfaYazi,actualYeniSayfaYazi);
        ReusableMethods.bekle (5);

    }

}
