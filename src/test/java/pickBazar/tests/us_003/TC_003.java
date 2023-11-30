package pickBazar.tests.us_003;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_003 {
    /*
"1-Kullanıcı ana sayfaya gider
 2-Kullanıcı Shelf dropdown menu tıklar
 3-Kullanıcı aşağıdaki seceneklerin geldiği doğrular
  -Grocery
 - Bakery
 - MakeUp
 - Bags
 - Clothing
 - Furniture
 - Daily Needs
 4-Kullanıcı herbir seceneğin tıklanabilir olduğunu doğrular"
*/
    @Test
    public void test3() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.shelfDropDownButon.click();
        for (WebElement e : homePage.shelfDropDownMenuList) {
          Assert.assertTrue(e.isEnabled());
        }
        for (WebElement e : homePage.shelfDropDownMenuList) {
            System.out.println("e.getText() = " + e.getText());
        }


        Driver.closeDriver();

    }


}
