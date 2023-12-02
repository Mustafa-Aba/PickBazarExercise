package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_009 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı ""Express Delivery"" frame ve içerisinde ""Save Now"" buttonun tıklandığını doğrular
"

    * */

    @Test
    public void test9(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(groceryPage.expressDeliveryFrame.isEnabled());
        Driver.closeDriver();
    }
}
