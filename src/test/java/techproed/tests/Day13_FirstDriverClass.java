package techproed.tests;
import org.testng.annotations.Test;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;
public class Day13_FirstDriverClass {
    @Test
    public void firstDriverTest(){
        // driver ---- If I extent a test base class
        // driver = Driver.getDriver();
//        Driver.getDriver().get("https://www.amazon.com");
//        Driver.getDriver().navigate().to("https://www.google.com");
//        Driver.closeDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("google_url"));
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
    }
}