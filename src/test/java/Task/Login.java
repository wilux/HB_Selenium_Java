package Task;

import Config.Credenciales;
import Page.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Login extends LoginPage {
    WebDriver driver;


    public Login(WebDriver driver) {
        super ( driver );
        this.driver = driver;
    }

    //Set user name in textbox

    public void setUserName(String strUserName) {

        driver.findElement ( UserInput ).sendKeys ( strUserName );

    }


    public void setPassword(String strPassword) {

        driver.findElement ( PasswordInput ).sendKeys ( strPassword );

    }



    public void Ingresar() {

        Credenciales credenciales = new Credenciales ();
        driver.get ( "https://login.devtest.com.ar/cas//login?service=https%3A%2F%2Fonline.devtest.com.ar%2F#/context/30708769920/payments/hub" );
        setUserName( credenciales.username );
        setPassword (credenciales.password );
        driver.findElement ( IngresarButton ).click ();

    }
}
