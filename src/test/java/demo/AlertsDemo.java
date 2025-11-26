package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class AlertsDemo {

    // Alerts
    // best practices and format (Ctrl+Alt+L)
    // debugging


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String name = "Guna";

        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();

        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        Assert.assertEquals(alertMessage, "Hello " + name + ", share this practice page and share your knowledge");
        driver.switchTo().alert().accept();

        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("confirmbtn")).click();

        alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        Assert.assertEquals(alertMessage, "Hello " + name + ", Are you sure you want to confirm?");

        driver.switchTo().alert().dismiss();

        //button[text()='ADD TO CART']

        driver.quit();


    }


}
