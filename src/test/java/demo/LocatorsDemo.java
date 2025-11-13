package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LocatorsDemo {

    public static void main(String[] args) {

        //Webdriver
        //implicit 5






        //tagname.classname

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("Gunashekar939");

        driver.findElement(By.name("inputPassword")).sendKeys("Rainbow_3");

        //driver.findElement(By.className("submit")).click(); button.signInBtn button.submit button.submit.signInButton
        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.className("error")).getText());

        driver.quit();

    }
}
