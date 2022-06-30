package Action;


import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Write {
    WebDriver driver;


    public Write(WebDriver driver) {

        this.driver = driver;

    }

    public void On(By locator, String text) {
        driver.findElement ( locator ).clear ();
        driver.findElement ( locator ).sendKeys ( text );
    }

    public void Js(By locator, String text) {

        WebElement i = driver.findElement ( locator );
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript ( "arguments[0].value='" + text + "';", i );

    }

    public void Clear(By locator) {

        driver.findElement ( locator ).clear ();


    }

}


