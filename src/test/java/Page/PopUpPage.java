package Page;

import org.openqa.selenium.By;

public class PopUpPage {
    //Localizadores

    //boton cerrar "X"
    public By btnX = By.cssSelector ( "#form-close-btn > img" );

    //titulo
    public By titulo = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[2]/div/div/h1" );
    //Subtitulo
    public By subTitulo = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[3]/div[2]/h2" );

    public By loader = By.className ( "backdrop-loading" );
    public By btnVolver = By.cssSelector ( "#wrapper > div.container-fluid.max-width-xl > div > div > div.row" +
                                                   ".hidden-sm.hidden-xs > div.pull-left.div-back > a" );

    //Token
    public By selectMail = By.xpath ( "//*[@id='ddChannel']" );
    public By selectMailOpcion = By.xpath ( "/html/body/div[9]/md-select-menu/md-content/md-option/div[1]" );
    public By btnEnviarCodigo = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/form[1]/div[2]/div[2]/button" );
    public By inputCodigoSeguridad = By.xpath ( "//*[@id='txtToken']" );
    public By btnContinuar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/div/form[2]/div/div[2]/button" );

}
