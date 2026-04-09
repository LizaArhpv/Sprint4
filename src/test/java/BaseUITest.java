
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Before;
import org.junit.After;
import Pages.MainPage;

public class BaseUITest {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(MainPage.cookButton).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
