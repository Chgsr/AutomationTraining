package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //<input type="text" placeholder="Username" id="inputUsername" value="" fdprocessedid="oorxl">
        driver.findElement(By.id("inputUsername")).sendKeys("Raji123");

        //<input type="password" placeholder="Password" name="inputPassword" value="" fdprocessedid="34rnhg">
        driver.findElement(By.name("inputPassword")).sendKeys("Kamaraj@123");

        //<button class="submit signInBtn" type="submit" fdprocessedid="6ve3dw">Sign In</button>
        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.className("error")).getText());

        driver.quit();
    }
}
