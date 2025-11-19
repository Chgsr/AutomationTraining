package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ParentChildLocatorsPractice {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // xpath - //form/input
        // css - form input
        //Assert class from testng frameowrk
        // Testng and junit are frameworks

        //<input type="text" placeholder="Username" id="inputUsername" value="" fdprocessedid="i6ds8d">
        //driver.findElement(By.cssSelector());


    }


}
