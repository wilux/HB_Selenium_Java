package Action;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Choose {
    WebDriver driver;


    public Choose(WebDriver driver) {

        this.driver = driver;

    }

    public void byText(By locator, String value) {
        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 10)) {
            try {
                driver.findElement ( locator ).click ();
                driver.findElement ( By.xpath ( "//div[contains(text(), '{" + value + "}') and @class='md-text ng-binding']" ) ).click ();
            } catch (Exception e) {
                System.out.println ( "No se encontro " + locator );
                System.out.println ( "Reintentando..." );
            }
        }

    }


}

