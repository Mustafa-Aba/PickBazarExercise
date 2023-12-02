package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_008 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı - ""Express Delivery"" frame ve içerisinde ""Save Now"" buttonun görüntülendiğini doğrular
5-""Cash On Delivery"" frame ve içerisinde ""Save Now"" buttonun görüntülendiğini doğrular
6-""Gift Voucher"" frame ve içerisinde ""Shop Cuopons"" buttonun görüntülendiğini doğrular"

    * */

    @Test
    public void test8(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.scrollDownByJS();
        Assert.assertTrue(groceryPage.expressDeliveryFrame.isDisplayed());
        Assert.assertTrue(groceryPage.cashOnDeliveryFrame.isDisplayed());
        Assert.assertTrue(groceryPage.giftVoucherFrame.isDisplayed());

        Driver.closeDriver();
    }
}
