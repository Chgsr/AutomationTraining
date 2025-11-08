package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

    public static void main(String[] args) {

        //Webdriver

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        driver.findElement(By.id("inputUsername")).sendKeys("Gunashekar939");

        //driver.quit();


    }
}
