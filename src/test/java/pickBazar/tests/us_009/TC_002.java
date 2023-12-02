package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;

public class TC_002 {
    /*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı arama yapmak icin text alanının görüntülendiğini doğrular
4-Kullanıcı ""Search"" butonunun görüntülendiğini doğrular
"


    * */

    @Test
    public void test2(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        Assert.assertTrue(groceryPage.searchBox.isDisplayed());
        Assert.assertTrue(groceryPage.searchButton.isDisplayed());
        Assert.assertTrue(groceryPage.searchButton.isEnabled());

        Driver.closeDriver();
    }
}
