package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class DynamicDropdownsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // //a[@value='BLR']

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

        // 1. click senior citizen check box
        // 2. how many check boxes are there in webpage
        // 3. is checkbox enabled
        // 4. is dropdown displayed and enabled


        WebElement seniorCitizenCheckbox = driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']"));

        List<WebElement> checkboxesList = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println(checkboxesList.size());

        for (WebElement checkbox:checkboxesList){

            System.out.println(checkbox.isDisplayed());

        }

        if (seniorCitizenCheckbox.isDisplayed() && seniorCitizenCheckbox.isEnabled()) {

            seniorCitizenCheckbox.click();
        }

        System.out.println(seniorCitizenCheckbox.isSelected());

        Assert.assertTrue(seniorCitizenCheckbox.isSelected());

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        WebElement returnDate = driver.findElement(By.cssSelector("#Div1"));

       String attributeValue =  returnDate.getAttribute("style").split("opacity:")[1].trim().replace(";","");  // display: block; opacity: 0.5; //0.5

        float opacityValue = Float.parseFloat(attributeValue);

        if (opacityValue == 0.5){

            System.out.println("Return Date is Disabled");
        }
        else {
            System.out.println("Return Date is Enabled");
        }

        driver.quit();

    }
}
