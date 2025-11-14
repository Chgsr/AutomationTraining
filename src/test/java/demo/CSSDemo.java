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

    //Xpath
    // //tagName[@attributeName='attributeValue']

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

        driver.findElement(By.linkText("Forgot your password?")).click();

        //driver.findElement(By.partialLinkText("password?")).click();

        //<input type="text" placeholder="Name">  //input[@placeholder='Name'] //input[@type='text']

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gunashekar");

        //<input type="text" placeholder="Email">  //input[@placeholder='Email'] input[placeholder='Email']  //input[@type='text'][2]

        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("chgunareddy@gmail.co");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("chgunareddy@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9392705090");
        driver.findElement(By.className("reset-pwd-btn")).click();

        String rawPassword = driver.findElement(By.cssSelector(".infoMsg")).getText();

        String[] splittedString = rawPassword.split(" ");

        System.out.println(splittedString[4]);
        System.out.println(splittedString[3]);

        //Please use temporary password 'rahulshettyacademy' to Login.

        driver.quit();;

    }
}
