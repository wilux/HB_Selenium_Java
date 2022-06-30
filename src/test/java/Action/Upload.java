package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Upload {

    public void File(WebDriver driver, By locator) throws InterruptedException {
        String filePath = "C:\\Users\\floresnes\\Documents\\Haberes-Template" + ".xls";
        WebElement addFile = driver.findElement ( locator );
        addFile.sendKeys ( "filePath" );
    }
}
