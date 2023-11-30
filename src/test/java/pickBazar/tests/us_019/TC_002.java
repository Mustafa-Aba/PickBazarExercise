package pickBazar.tests.us_019;

import org.testng.annotations.Test;
import pickBazar.pages.DailyNeedsPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_002 {
    @Test
    public void DailyNeedsPage() throws InterruptedException {
       /*
        Daily Needs ekraninda;
        1- Daily Needs ekraninda sepet ikonu gelmelidir.
        2- Daily Needs ekraninda sepet ikonu tiklandiginda sepet ekrani sagda acilabilmeli. "Checkout" secenegi butonu gelmeli.
         */

        DailyNeedsPage dailyNeedsPage = new DailyNeedsPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        dailyNeedsPage.dailyNeedButton.click();
        dailyNeedsPage.clicktoDaily.click();


    }
}
