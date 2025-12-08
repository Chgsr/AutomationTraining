package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToCartPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Open the Website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        //Convert string array into list
        String[] productsToAdd = {"Brocolli", "Cauliflower", "Cucumber", "Beetroot", "Carrot"};
        List<String> productList = Arrays.asList(productsToAdd);

        //xpath for totalproducts to read all productnames
        List<WebElement> totalProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));

        List<String> productNames = new ArrayList<>();

        //Loop through each product
        for (int i = 0; i < totalProducts.size(); i++) {

            //Extract only the product name (“Cucumber”, “Carrot”)
            String productName = totalProducts.get(i).getText().split("-")[0].trim();
            productNames.add(productName);
            int j = 0;
            //Check if the name matches with productlist
            //If yes → click Add to Cart
            //Stop when all required items are added
            if (productList.contains(productName)) {

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                j++;
                if (j == productList.size()) {
                    break;
                }

            }

        }
        System.out.println("Total products added: " + productNames);
        driver.quit();


    }
}
