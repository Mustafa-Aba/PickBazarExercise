package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_003 {
    /*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı ""Search"" butonuna tıklar
4-Kullanıcı sayfada değişiklik olmadığını doğrular"


    * */

    @Test
    public void test3(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        groceryPage.searchButton.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("groceryUrl"));
        Driver.closeDriver();
    }
}
