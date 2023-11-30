package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_001 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ""Questions, Comments, Or Concerns?"" bölümünü görüntelendiğini doğrular"
*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.contactButon.click();
        Assert.assertTrue(contactPage.questionsCommentsConcernsText.isDisplayed());
        Driver.closeDriver();
    }


}
