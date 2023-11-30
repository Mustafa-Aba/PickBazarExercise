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

public class TC_003 {
    /*"1-Kullanıcı ana sayfaya gider
    2-Kullanıcı Contact butonuna tıklar
    3-Kullanıcı Submit Butonuna tıklar
    4-Kullanıcı Name alanının altında ""You must need to provide your name"" uyarı mesajının geldiğini doğrular
    5-Kullanıcı Email alanının altında ""You must need to provide your email address"" uyarı mesajının geldiğini doğrular
    6-Kullanıcı Subject  alanının altında ""What subject do you want to discuss with us?"" uyarı mesajının geldiğini doğrular
    7-Kullanıcı Description alanının altında ""Tell us more about it"" uyarı mesajının geldiğini doğrular"

    */
    @Test
    public void test1() {
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.contactButon.click();
        contactPage.submitButon.click();
        List<String> expectedUyariMesajlariList = new ArrayList<>();
        expectedUyariMesajlariList.add("You must need to provide your name");
        expectedUyariMesajlariList.add("You must need to provide your email address");
        expectedUyariMesajlariList.add("What subject do you want to discuss with us?");
        expectedUyariMesajlariList.add("Tell us more about it");

        for (int i = 0; i <expectedUyariMesajlariList.size(); i++) {
            Assert.assertTrue(contactPage.uyariMesajlariList.get(i).isDisplayed(),i+" .inci uyarı mesajı cıkmadı");
            Assert.assertEquals(contactPage.uyariMesajlariList.get(i).getText(), expectedUyariMesajlariList.get(i),
                    i+" inci Uyarı mesajı eşleşmedi");        }
        Driver.closeDriver();
    }
}
