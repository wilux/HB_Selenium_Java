package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Grid {
    WebDriver driver;


    public Grid(WebDriver driver) {

        this.driver = driver;

    }

    public static void SeleccionarFila(WebDriver driver, By locator, By fila) {
        WebElement webElement = driver.findElement ( locator );
        webElement.findElement ( fila ).click ();
    }

}


