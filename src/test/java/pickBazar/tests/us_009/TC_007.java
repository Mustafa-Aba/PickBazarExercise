package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_007 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı text alanına ""iphone 15"" yazar
4-Kullanıcı ""Search"" butonuna tıklar
5-Kullanıcı ""iphone 15"" ile ilgili ürünlerin gelmediğini doğrular "

    * */

    @Test
    public void test7(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.waitFor(3);
        groceryPage.searchBox.sendKeys("iphone 15");
        ReusableMethods.waitFor(3);
        groceryPage.searchButton.click();
        Assert.assertTrue(groceryPage.noProductText.isDisplayed());
        Driver.closeDriver();

        Driver.closeDriver();
    }
}
