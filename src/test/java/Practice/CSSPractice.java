package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSPractice {

    //CSS
    //class (.) -- tagname.classname
    //id (#) -- tagname#id
    //customized css  -- tagName[attributeName='attributeValue']

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //<input type="text" placeholder="Username" id="inputUsername" value="" fdprocessedid="oorxl">
        //input[type='text'] , input[placeholder='Username'] , input#inputUsername
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Raji123");

        //<input type="password" placeholder="Password" name="inputPassword" value="" fdprocessedid="34rnhg">
        //input[type='password'] , input[placeholder='Password'] , input[name='inputPassword']
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Kamaraj@123");

        //<button class="submit signInBtn" type="submit" fdprocessedid="6ve3dw">Sign In</button>
        //button.submit.signInBtn , button[type='submit']
        driver.findElement(By.cssSelector("button.submit.signInBtn")).click();

        //<p class="error">* Incorrect username or password </p>
        //p.error
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.quit();

           }
}
