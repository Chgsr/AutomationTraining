package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DynamicDropdownsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        ////a[@value='BLR']

        //(//a[@value='MAA'])[2]

        // //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']

        // //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        Thread.sleep(1000);
        List<WebElement> toDropdownValues =  driver.findElements(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTNR ul li a"));

        for (WebElement value:toDropdownValues){

            String city = value.getText();
            Assert.assertNotEquals(city,"Bangalore");
        }

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.quit();






    }
}
