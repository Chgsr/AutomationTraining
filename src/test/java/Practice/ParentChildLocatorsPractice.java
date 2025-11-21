package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class ParentChildLocatorsPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // xpath - //form/input
        // css - form input
        //Assert class from testing framework
        // Testng and junit are frameworks

        //<input type="text" placeholder="Username" id="inputUsername" value="" fdprocessedid="i6ds8d">
        driver.findElement(By.cssSelector("#container div:nth-child(2) form input:nth-child(2)")).sendKeys("Raji123");
        //<input type="password" placeholder="Password" name="inputPassword" value="" fdprocessedid="yom2pr">
        driver.findElement(By.cssSelector("#container div:nth-child(2) form input:nth-child(3)")).sendKeys("rahulshettyacademy");
        //<button class="submit signInBtn" type="submit" fdprocessedid="k55wvk">Sign In</button>
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(1000);

       String SuccessMessage = driver.findElement(By.cssSelector("div p")).getText();
       System.out.println(SuccessMessage);
       Assert.assertEquals(SuccessMessage, "You are successfully logged in.");

    }


}
