package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class SignInRahulShettyPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        String username = "Raji123";
        String password = "Kamaraj@123";
        String email = "kamaraj.raji@gmail.com";
        String phoneNumber = "7599988030";

        //<input type="text" placeholder="Username" id="inputUsername" value="" fdprocessedid="i6ds8d">
        //<input type="password" placeholder="Password" name="inputPassword" value="" fdprocessedid="yom2pr">
        //<button class="submit signInBtn" type="submit" fdprocessedid="k55wvk">Sign In</button>
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        String errorMessage = driver.findElement(By.className("error")).getText();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage , "* Incorrect username or password");

        driver.findElement(By.linkText("Forgot your password?")).click();

        //<input type="text" placeholder="Name" fdprocessedid="e2kuem">
        //<input type="text" placeholder="Email" fdprocessedid="fq4l0r">
        //<input type="text" placeholder="Phone Number" fdprocessedid="szpw6">
        //<button class="reset-pwd-btn" fdprocessedid="hhrbui">Reset Login</button>
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(phoneNumber);
        driver.findElement(By.className("reset-pwd-btn")).click();

        //<p class="infoMsg">Please use temporary password 'rahulshettyacademy' to Login. </p>
        String message = driver.findElement(By.className("infoMsg")).getText();
        password = message.split("'")[1].trim();

        //<button class="go-to-login-btn" fdprocessedid="6o7vhn">Go to Login</button>
        driver.findElement(By.className("go-to-login-btn")).click();

        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello Raji123,");
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Welcome to Rahul Shetty Academy");
        Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(),"You are successfully logged in.");

        //<button class="logout-btn" fdprocessedid="kexl4w">Log Out</button>
        driver.findElement(By.className("logout-btn")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("form h1")).getText(),"Sign in");
        System.out.println(driver.findElement(By.cssSelector("form h1")).getText());



























    }
}
