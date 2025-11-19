package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators1Demo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //driver.findElement(By.xpath("//form/input[1]")).sendKeys("Gunashekar");
        driver.findElement(By.cssSelector("#container div:nth-child(2) form input:nth-child(2)")).sendKeys("Gunashekar");
        //driver.findElement(By.cssSelector("form input:nth-child(2)")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("#container div:nth-child(2) form input:nth-child(3)")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(1000);

        String successMessage = driver.findElement(By.cssSelector("div p")).getText();

        System.out.println(successMessage);

        Assert.assertEquals(successMessage,"You are successfully logged in.");

        // //form/input
        // form input
        //testng junit

    }
}
