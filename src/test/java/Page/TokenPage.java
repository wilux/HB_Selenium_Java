package Page;

import org.openqa.selenium.By;

public class TokenPage {

    //Localizadores

    //Token
    public By selectMail = By.xpath ( "//*[@id='ddChannel']" );
    public By selectMailOpcion = By.xpath ( "/html/body/div[8]/md-select-menu/md-content/md-option" );
    public By btnEnviarCodigo = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/form[1]/div[2]/div[2]/button" );
    public By inputCodigoSeguridad = By.xpath ( "//*[@id='txtToken']" );
    public By btnContinuar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/form[2]/div/div[2]/button" );

}
