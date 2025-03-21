package test.teststeps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OrderSteps {

    private WebDriver driver;

    @Given("User is on the Orders page")
    public void userIsOnTheOrdersPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("URL_OF_ORDERS_PAGE"); // Replace with actual URL
    }

    @Then("User should see the list of orders")
    public void userShouldSeeTheListOfOrders() {
        List<WebElement> orders = driver.findElements(By.xpath("//table/tbody/tr"));
        Assert.assertFalse("Order list is empty!", orders.isEmpty());
    }

    @Then("User verifies the first order details")
    public void userVerifiesTheFirstOrderDetails() {
        WebElement firstOrder = driver.findElement(By.xpath("//table/tbody
