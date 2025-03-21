package test.teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class OrderTableHelper {

    public static String getOrderName(WebDriver driver, String orderId) {
        // Locate the order table
        WebElement table = driver.findElement(By.cssSelector("table.table"));

        // Retrieve all rows within the table body
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Traverse rows to find the row containing the specified Order ID
        for (WebElement row : rows) {
            List<WebElement> headerCells = row.findElements(By.tagName("th"));

            if (!headerCells.isEmpty()) {
                String currentOrderId = headerCells.get(0).getText().trim();

                if (currentOrderId.equals(orderId)) {
                    // Retrieve the Name column (assumed to be the second cell)
                    WebElement nameCell = row.findElements(By.tagName("td")).get(1);
                    return nameCell.getText().trim();
                }
            }
        }

        return "Order ID not found";
    }
}
