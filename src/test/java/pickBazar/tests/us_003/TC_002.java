package pickBazar.tests.us_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_002 {
    /*
1-Kullanıcı ana sayfaya gider
 2-Kullanıcı Shelf dropdown menu görüntüler
 3-Kullanıcı Shelf dropdown ""Grocery"" seçenegi ile geldiğini doğrular
 4-Kullanıcı Shelf dropdown menu tıklar
 5-Kullanıcı aşağıdaki seceneklerin geldiğini doğrular
  - Grocery
 - Bakery
 - MakeUp
 - Bags
 - Clothing
 - Furniture
 - Daily Needs"*/

    @Test
    public void test2() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        Assert.assertEquals(homePage.shelfDropDownButon.getText(), "Grocery");
        homePage.shelfDropDownButon.click();
        String shelfDropDownMenuListAllText = homePage.shelfDropDownMenu.getText();
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Grocery"));
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Bakery"));
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Makeup"));
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Bags"));
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Clothing"));
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Furniture"));
        Assert.assertTrue(shelfDropDownMenuListAllText.contains("Daily Needs"));

        Driver.closeDriver();

    }


}
