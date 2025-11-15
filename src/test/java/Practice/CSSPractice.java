package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class CSSPractice {

    //CSS
    //class (.) -- tagname.classname
    //id (#) -- tagname#id
    //customized css  -- tagName[attributeName='attributeValue']

    //Xpath
    // //tagname[@attribute='attributeValue']

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

        //driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.partialLinkText("password?")).click();

        //<input type="text" placeholder="Name">
        // //input[@placeholder='Name']
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rajakumari");

        //<input type="text" placeholder="Email">
        // //input[@placeholder='Email']
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("raji@gmail.co");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("raji@gmail.com");

        //<input type="text" placeholder="Phone Number">
        // //input[@placeholder='Phone Number']
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");

        //<button class="reset-pwd-btn">Reset Login</button>
        //button.reset-pwd-btn
        driver.findElement(By.className("reset-pwd-btn")).click();

        //<p class="infoMsg">Please use temporary password 'rahulshettyacademy' to Login. </p>
        String rawPassword = driver.findElement(By.cssSelector(".infoMsg")).getText();

        String[] splittedString = rawPassword.split(" ");

        System.out.println(splittedString[4]);
        System.out.println(splittedString[3]);

        driver.quit();

           }
}
