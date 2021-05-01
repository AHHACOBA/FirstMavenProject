import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Owl/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");

        // xPath
        //driver.findElement(By.className("gLFyf"));

        WebElement input = driver.findElement(By.className("gLFyf"));
        input.sendKeys("123\n");

        //WebElement result = driver.findElement(
        //        By.xpath("//h3[text() = 'Jess Glynne - 123 [Official Live Video] - YouTube']"));

        WebElement result = driver.findElement(
                By.xpath("//*[@id='wp-tabs-container']/div[1]/div[1]/div/div/div/div/div/div/div[2]/h3/a/h3"));
        Assert.assertEquals(result.getText(), "Jess Glynne - 123 [Official Live Video] - YouTube");



        Thread.sleep(5000);

        driver.quit();

    }
}
