package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChildParentPractice {

    public static void main(String[] args){

        /*1.Absolute Xpath  --- beginning of html(follows complete path from root)
          -- /html/body/header/div/button[1] --- Starts with /(single slash) ---
          Easily breaks if page structure changes -- slower */

        /* 2.Relative Xpath  --- middle of html or from any where(start from anywhere
        in DOM) -- //div/button[1] -- Starts with //(double slash) --- More stable
        and faster */

        //following sibling -- //header/div/button[1]/following-sibling::button[1] [xpathofParent/following-sibling::tagName]
        //scenario : need to click the button which present beside practice

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");






    }
}
