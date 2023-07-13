import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronTest extends BaseTest{

    POupPage pOupPage;

    @BeforeMethod
    public void setpOup(){

        driver = openBrowser();
        pOupPage = new POupPage(driver);

    }
   @Test
   public void ShopTest(){
        pOupPage.clicOnPopup();
        pOupPage.clickPrihvati();
   }

    @BeforeMethod
    public void after(){
        driver.quit();
    }
}
