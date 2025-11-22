package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class DropDownPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // tag name must be select to use select class features

       //<select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency" fdprocessedid="7lhrmn" class="valid">
        WebElement CurrencyDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(CurrencyDropDown);

        select.selectByIndex(3);
        //getFirstSelectedOption() – returns the currently selected <option> from the dropdown.
        //getText() – gets the visible text of that option.
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"USD");
        Thread.sleep(1000);

        select.selectByVisibleText("INR");
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"INR");
        Thread.sleep(1000);

       select.selectByContainsVisibleText("AE");
       System.out.println(select.getFirstSelectedOption().getText());
       Assert.assertEquals(select.getFirstSelectedOption().getText(),"AED");
        Thread.sleep(1000);

       select.selectByValue("INR");
       System.out.println(select.getFirstSelectedOption().getText());
       Assert.assertEquals(select.getFirstSelectedOption().getText(),"INR");

       //<div id="divpaxinfo" class="paxinfo">1 Adult</div>
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        /*for (int i=0;i<3;i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }*/
        int noOfPassengers = 4;

        int i=1;
        while (i<noOfPassengers){

            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        int noOfChildren = 2;

        int j=1 ;
        while (j<noOfChildren){

            //<span class="pax-add pax-enabled" id="hrefIncChd">+</span>
            driver.findElement(By.id("hrefIncChd")).click();
            j++;
        }

        //<input class="buttonN" id="btnclosepaxoption" value="Done" type="button">
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),noOfPassengers+" Adult");
        //Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),noOfChildren+" Children");
       // driver.quit();

  }
}
