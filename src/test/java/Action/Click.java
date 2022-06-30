package Action;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Click {
    WebDriver driver;


    public Click(WebDriver driver) {

        this.driver = driver;

    }

    public void On(WebDriver driver, By locator) {
        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {

            try {

                driver.findElement ( locator ).click ();
                System.out.println ( "Click Avanzado en " + locator );


            } catch (Exception e) {
                System.out.println ( "No se encontró " + locator );

            }

        }

    }

    public void Js(WebDriver driver, String locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ( "$('{locator}').click();" );
    }


}


