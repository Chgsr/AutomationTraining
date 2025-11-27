package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class AlertPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String name = "Raji";

        //<input id="name" name="enter-name" class="inputs" placeholder="Enter Your Name" type="text" fdprocessedid="wdk3po">
        driver.findElement(By.id("name")).sendKeys(name); //dynamic input
        //<input id="alertbtn" class="btn-style" value="Alert" onclick="displayAlert()" type="submit" fdprocessedid="mxj01h">
        driver.findElement(By.id("alertbtn")).click();

        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        Assert.assertEquals(alertMessage, "Hello " + name + ", share this practice page and share your knowledge");
        driver.switchTo().alert().accept();

        //<input id="confirmbtn" class="btn-style" value="Confirm" onclick="displayConfirm()" type="submit" fdprocessedid="r5xucr">
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("confirmbtn")).click();

        alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        Assert.assertEquals(alertMessage, "Hello " + name + ", Are you sure you want to confirm?");
        driver.switchTo().alert().dismiss();

        driver.quit();

    }
}
