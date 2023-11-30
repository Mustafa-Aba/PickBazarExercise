package pickBazar.tests.us_003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_001 {
    /*
    * "1-Kullanıcı ana sayfaya gider
 2-Kullanıcı Fare ile Shelf dropdown menu üzerine gelinir
 3-Kullanıcı İmlec butonun üzerine geldiğinde imleç tipinin parmak işaretine dönüştüğünü doğrular
 4-Eğer imleç tipi parmak işaretine dönüştüyse,kullanıcı Shelf dropdown menu tıklanabilir oldugu dogrular"
*/
    @Test
    public void test1(){
        HomePage homePage=new HomePage();


        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        WebElement body=Driver.getDriver().findElement(By.tagName("body"));
        String originalCursor = body.getCssValue("cursor");
        System.out.println("originalCursor = " + originalCursor);
        Actions action =new Actions(Driver.getDriver());
        action.moveToElement(homePage.shelfDropDownButon).perform();
        String hoveredCursor = homePage.shelfDropDownButon.getCssValue("cursor");
        System.out.println("hoveredCursor = " + hoveredCursor);
        Assert.assertNotEquals(originalCursor, hoveredCursor, "Mouse hover işlemi başarısız oldu");
        Assert.assertTrue(homePage.shelfDropDownButon.isEnabled(),"Button tıklanabilir değil");
        Driver.closeDriver();
    }




}
