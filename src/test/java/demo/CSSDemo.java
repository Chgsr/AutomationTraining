package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSDemo {

    //CSS
    //class (.) -- tagname.classname
    //id (#) -- tagname#id
    //customized css  -- tagName[attributeName='attributeValue']

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //<input type="text" placeholder="Username" id="inputUsername" value="">
        //input#inputUsername, input[placeholder='Username'], input[id='inputUsername']
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Gunashekar");

        //<input type="password" placeholder="Password" name="inputPassword" value="">
        //input[placeholder='Password']
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Rainbow_3");

        //<button class="submit signInBtn" type="submit">Sign In</button>
        //button.submit.signInBtn
        driver.findElement(By.cssSelector("button.submit.signInBtn")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.quit();;

    }
}
