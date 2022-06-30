package Tools;


import Action.Click;
import Action.Get;
import Page.MailinatorPage;
import com.google.common.base.Stopwatch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Mailinator {

    WebDriver driver;

    public String GetToken() throws InterruptedException {
        Get get = new Get ( driver );
        Click click = new Click ( driver );
        MailinatorPage mailinatorPage = new MailinatorPage ();
        System.setProperty ( "webdriver.chrome.driver", "C:\\webdriver\\geckodriver.exe" );
        //Firefox
        var options = new FirefoxOptions ();
        // Modo Invisible
        options.addArguments ( "-headless" );
        driver = new FirefoxDriver ( options );
        driver.navigate ().to ( "https://www.mailinator.com/v4/public/inboxes.jsp?to=delgadoe" );

        final Stopwatch stopwatch = Stopwatch.createStarted ();

        while ((stopwatch.elapsed ( TimeUnit.SECONDS ) < 30)) {
            try {
                if ( driver.findElement ( mailinatorPage.FilaAsunto ).isDisplayed () ) {
                    driver.findElement ( mailinatorPage.Fila ).click ();
                }
            } catch (Exception e) {
                System.out.println ( "No se encontró " + mailinatorPage.FilaAsunto );
                continue;

            }

        }
        driver.wait ( 1000 );
        //Capturar.Pantalla(driver);
        driver.switchTo ().frame ( "html_msg_body" );
        String token = get.ElementText ( driver, mailinatorPage.token );
        driver.quit ();

        if ( token != "" ) {

            return token;
        }
        else {
            return "Sin Token";
        }

    }
}
