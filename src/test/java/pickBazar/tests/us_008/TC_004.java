package pickBazar.tests.us_008;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TC_004 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Email alanına "nenopey862@frandin.com" yazar
4-Kullanıcı Subject alanına "TestCase1" yazar
5-Kullanıcı Description alanına "TestSteps" yazar
6-Kullanıcı Submit Butonuna tıklar
7-Kullanıcı Name alanının altında "You must need to provide your name" uyarı mesajının geldiğini doğrular
"

*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.contactButon.click();
        contactPage.emailTextAlani.sendKeys("nenopey862@frandin.com");
        contactPage.subjectTextAlani.sendKeys("TestCase1");
        contactPage.descriptionTextAlani.sendKeys("TestSteps");
        contactPage.submitButon.click();
        String expectedUyariMesaji = "You must need to provide your name";
        Assert.assertTrue(contactPage.nameUyariMesaji.isDisplayed(),"Uyarı mesajı çıkmadı");
        Assert.assertEquals(contactPage.nameUyariMesaji.getText(), expectedUyariMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
