package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class DropdownDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // tag name must be select to use select class features

        WebElement currencyDropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select select = new Select(currencyDropdown);

        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"USD");
        select.selectByVisibleText("INR");
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"INR");
        select.selectByContainsVisibleText("AE"); //AED
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"AED");
        select.selectByValue("INR");
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"INR");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        /*for (int i=0;i<3;i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }*/
        int noOfPassengers = 8;


        int i=1;
        while (i<noOfPassengers){

            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),noOfPassengers+" Adult");

        driver.quit();
    }
}
