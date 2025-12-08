package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AddToCartDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        //click on cucumber Add to Cart
        // //button[text()='ADD TO CART']  --  30 items  29
        // //h4[@class='product-name'] -- 30 items

        String name = "Beetroot";

        String[] productsToAdd = {"Beetroot", "Cucumber", "Carrot", "Brinjal","Apple"};

        List<String> productList = Arrays.asList(productsToAdd);

        // iterate all elements one by one
        // get the text of each element and match with name variable and click on add to cart.

        List<WebElement> totalProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < totalProducts.size(); i++) {

            //Cucumber - 1 Kg
            String productName = totalProducts.get(i).getText().split("-")[0].trim();

            int j = 0; //3

            if (productList.contains(productName)) {

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                j++;
                if (j == productList.size()) {
                    break;
                }
            }

        }
        //driver.quit();

    }

}
