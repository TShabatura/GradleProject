package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import util.DriverManager;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp() {
        driver = DriverManager.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }
}
