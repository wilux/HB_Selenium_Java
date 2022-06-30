package Page;


import Config.Credenciales;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends Credenciales {
    public By UserInput = By.xpath ("//*[@id='BPN_u']");
    public By PasswordInput = By.xpath("//*[@id='BPN_p']");
    public By IngresarButton = By.xpath("/html/body/section/div/div[2]/div/div[3]/form/div[2]/div/button");
    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

}


