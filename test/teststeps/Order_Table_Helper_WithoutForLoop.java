package test.teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderTableHelper {

    public static String getOrderName(WebDriver driver, String orderId) {
        try {
            // Locate the row containing the specified Order ID
            WebElement orderRow = driver.findElement(
                    By.xpath("//table[contains(@class, 'table')]/tbody/tr[td[text()='" + orderId + "']]")
            );

            // Retrieve the Name column from the located row (assuming it's the second <td>)
            WebElement nameCell = orderRow.findElements(By.tagName("td")).get(1);

            // Return the trimmed text of the Name cell
            return nameCell.getText().trim();

        } catch (IndexOutOfBoundsException e) {
            return "Name cell not found for Order ID: " + orderId;
        } catch (Exception e) {
            return "Error locating Order ID or unexpected issue: " + e.getMessage();
        }
    }
}
