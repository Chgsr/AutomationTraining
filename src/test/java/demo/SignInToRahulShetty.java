package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class SignInToRahulShetty {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        String userName = "Gunashekar";
        String password = "Rainbow_3";
        String email = "chgunashekar@gmail.com";
        String phoneNumber = "9392705090";

        driver.findElement(By.id("inputUsername")).sendKeys(userName);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        String errorMessage = driver.findElement(By.className("error")).getText();

        Assert.assertEquals(errorMessage,"* Incorrect username or password");

        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(userName);
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys(phoneNumber);
        driver.findElement(By.className("reset-pwd-btn")).click();
        String message = driver.findElement(By.className("infoMsg")).getText();
        password = message.split("'")[1].trim();
        driver.findElement(By.className("go-to-login-btn")).click();

        driver.findElement(By.id("inputUsername")).sendKeys(userName);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+userName+",");  //Hello gunashekar,
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(),"Welcome to Rahul Shetty Academy");  //Hello gunashekar,
        Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(),"You are successfully logged in.");  //Hello gunashekar,

        driver.findElement(By.className("logout-btn")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("form h1")).getText(),"Sign in");  //Hello gunashekar,







    }

}
