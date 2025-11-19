package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class ChildParentDemo {

    public static void main(String[] args) {

        //1.Absolute Xpath  --- beginning of html  -- /html/body/header/div/button[1]
        //2.Relative Xpath  --- middle of html or from any where -- //div/button[1]

        //following sibling -- //header/div/button[1]/following-sibling::button[1] [xpathofParent/following-sibling::tagName]

        //scenario : need to click the button which present beside practice

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Assert.assertEquals(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText(), "Login");

        //scenario: find out Login button by using sibling and traverse to Header section using parent and again traverse to login button using sibling

        // //header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/div/button[1]/following-sibling::button[1]

        Assert.assertEquals(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/div/button[1]/following-sibling::button[1]")).getText(), "Login");

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/div/button[1]/following-sibling::button[1]")).getText());


        driver.quit();


    }
}
