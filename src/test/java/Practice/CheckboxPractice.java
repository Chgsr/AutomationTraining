package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CheckboxPractice {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //<input id="ctl00_mainContent_chk_SeniorCitizenDiscount" type="checkbox" name="ctl00$mainContent$chk_SeniorCitizenDiscount">
        //driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        //* - smart CSS Selector technique — partial attribute matching using *=
        //WebElement is a Selenium interface used to represent elements on a webpage and its datatype
        //Examples of web elements: Button ,Textbox, Checkbox, Link, Dropdown

        // 1. click senior citizen check box
        WebElement SeniorCitizenCheckbox = driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']"));
        //SeniorCitizenCheckbox.click();


        // 2. how many check boxes are there in webpage

        //<input id="ctl00_mainContent_chk_friendsandfamily" type="checkbox" name="ctl00$mainContent$chk_friendsandfamily">
        //<input id="ctl00_mainContent_chk_SeniorCitizenDiscount" type="checkbox" name="ctl00$mainContent$chk_SeniorCitizenDiscount">
        //<input id="ctl00_mainContent_chk_IndArm" type="checkbox" name="ctl00$mainContent$chk_IndArm">
        //<input id="ctl00_mainContent_chk_StudentDiscount" type="checkbox" name="ctl00$mainContent$chk_StudentDiscount">
        //<input id="ctl00_mainContent_chk_Unmr" type="checkbox" name="ctl00$mainContent$chk_Unmr">

        List<WebElement> CheckboxesList = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println(CheckboxesList.size());

        //1. click senior citizen check box
        // 3. is checkbox enabled
        // 4. is dropdown displayed and enabled

        for (WebElement checkbox : CheckboxesList){

            System.out.println(checkbox.isDisplayed());
        }

        if(SeniorCitizenCheckbox.isDisplayed() && SeniorCitizenCheckbox.isEnabled()){

            SeniorCitizenCheckbox.click();
        }

        System.out.println(SeniorCitizenCheckbox.isSelected());

        Assert.assertTrue(SeniorCitizenCheckbox.isSelected());

        //Return Date
        //Round trip - <input id="ctl00_mainContent_rbtnl_Trip_1" type="radio" name="ctl00$mainContent$rbtnl_Trip" value="RoundTrip" checked="checked">
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();








    }
}
