package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;

public class TC_011 {
    /*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı ""Gift Voucher"" frame, içerisindeki ""Shop Cuopons"" buttonun tıklandığını doğrular
"


    * */

    @Test
    public void test11(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        Assert.assertTrue(groceryPage.giftVoucherFrame.isEnabled());
        Driver.closeDriver();

    }
}
