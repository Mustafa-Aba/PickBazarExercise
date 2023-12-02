package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;

public class TC_010 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı ""Cash On Delivery"" frame, içerisindeki ""Save Now"" buttonun tıklandığını doğrular
"

    * */

    @Test
    public void test10(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        Assert.assertTrue(groceryPage.cashOnDeliveryFrame.isEnabled());
        Driver.closeDriver();
    }
}
