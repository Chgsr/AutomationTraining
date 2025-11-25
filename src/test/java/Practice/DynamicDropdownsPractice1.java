package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DynamicDropdownsPractice1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // //a[@value='BLR'] -- Xpath for bengaluru from "From dropdown"

        // //(//a[@value='MAA'])[2] -- Xpath for Chennai from "To dropdown" - short but will break when any changes to dropdown

        // //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] - lengthy but will not break if any changed to dropdown

        // //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']


        // To open the dropdown and click
        //<input id="ctl00_mainContent_ddl_originStation1_CTXT" name="ctl00_mainContent_ddl_originStation1_CTXT" selectedtext="" selectedvalue="" value="Departure City" class="select_CTXT" menuselection="false" autocomplete="off" style="width: 250px; height: 43px; border: 1px solid rgb(153, 153, 153);" fdprocessedid="033puh">
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);

        //From dropdown
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        Thread.sleep(1000);

        //Checking from value not present in to values
        List<WebElement> toDropdownValues = driver.findElements(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTNR ul li a"));

        for (WebElement value : toDropdownValues){

            String City = value.getText();
            Assert.assertNotEquals(City,"Bengaluru");
        }

        //To dropdown
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.quit();

    }
}
