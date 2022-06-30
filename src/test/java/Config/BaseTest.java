package Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void before() throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe" );

        driver = new ChromeDriver ();

        ChromeOptions Options = new ChromeOptions ();

        //Options.setHeadless ( true );

    }

    @AfterSuite
    public void after() throws InterruptedException {

        int reply = JOptionPane.showConfirmDialog ( null, "¿Queres Cerrar Navegador?", "Test Terminado", JOptionPane.YES_NO_OPTION );
        if ( reply == JOptionPane.YES_OPTION ) {
            driver.quit ();

        }
        else {
            System.exit ( 0 );
        }


    }

//    public void iniciar() {
//
//        System.setProperty ( "webdriver.ie.driver", "C:\\webdriver\\IEDriverServer_back.exe" );
//        InternetExplorerOptions ieOptions = new InternetExplorerOptions ();
//        ieOptions.ignoreZoomSettings ();
//        ieOptions.setCapability ( "ignoreProtectedModeSettings", true );
//        driver = new InternetExplorerDriver ( ieOptions );
//        driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
//
//    }

}
