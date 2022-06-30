package Action;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Get {
    WebDriver driver;


    public Get(WebDriver driver) {

        this.driver = driver;

    }

    public String ValueOnInput(By locator) {
        String value = "";

        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            try {

                value = driver.findElement ( locator ).getAttribute ( "value" );
                System.out.println ( "Valor Actual de " + locator + "=" + value + " length: " + value.length () );


            } catch (Exception e) {
                System.out.println ( "No se encontró " + locator );
                System.out.println ( "Reintentando..." );
            }
        }

        return value;
    }

    public String TextOnTag(By locator) {
        String value = "";
        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            try {
                value = driver.findElement ( locator ).getText ();
                System.out.println ( "Value de " + locator + "=" + value + " length: " + value.length () );
            } catch (Exception e) {
                System.out.println ( "No se encontró " + locator );
                System.out.println ( "Reintentando..." );
            }
        }

        return value;
    }

    public String ValueJS(By locator, String id) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String value = "";
        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            try {
                value = (String) js.executeScript ( "return document.getElementById('" + id + "').innerHTML" );
                System.out.println ( "Value de " + locator + "=" + value + " length: " + value.length () );
            } catch (Exception e) {
                System.out.println ( "No se encontró " + locator );
                System.out.println ( "Reintentando..." );
            }
        }

        return value;
    }

    public String ElementText(WebDriver driver, By locator) {
        WebElement l = driver.findElement ( locator );
        return l.getText ();
    }
}


