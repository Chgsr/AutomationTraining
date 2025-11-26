package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SuggestedDropdownsPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);

        List<WebElement> DropDownValues = driver.findElements(By.cssSelector("#ui-id-1 li a"));

        for(WebElement Value : DropDownValues) {

            String City = Value.getText();
            if (City.equalsIgnoreCase("India")) {
                Value.click();
                break;
            }
        }

        driver.quit();


    }
}
