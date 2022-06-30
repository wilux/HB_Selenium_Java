package Page.Pagos;

import org.openqa.selenium.By;

public class PagosAfipPage {
    //Localizadores
    //Pantalla principal
    public By txtTitulo = By.xpath ( "//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[1]/div[2]" );
    public By btnPagarVeps = By.xpath ( "//*[@id='popupContainer']/div/button" );
    public By tabHistorialPago = By.xpath ( "//*[@id='tabs-list']/nav/div[1]/ul/li[1]/a" );
    public By tabContribuyentes = By.xpath ( "//*[@id='tabs-list']/nav/div[1]/ul/li[2]/a" );
    public By btnMas = By.xpath ( "//*[@id='floating-button']/img" );
    public By btnNuevoPagoAfip = By.xpath ( "//*[@id='contextual-menu-ul']/li[1]/a" );
    public By btnAdherirNuevoContribuyente = By.xpath ( "//*[@id='contextual-menu-ul']/li[2]/a" );


    //PopUp pantalla  1
    //Busca los VEPs generador
    public By btnPorMi = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section/ng-include/div/div[1]/section[1]/div/button[1]/div[1]/div[2]" );
    public By btnParaMi = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section/ng-include/div/div[1]/section[1]/div/button[2]/div[1]/div[2]" );
    public By btnParaOtros = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section/ng-include/div/div[1]/section[1]/div/button[3]/div[1]/div[2]/div[1]" );

    //PopUp pantalla Por Mi
    //No tengo en el demo

    //PopUp pantalla Para Mi
    public By inputCuit = By.xpath ( "//*[@id='txtOriginatingCuit']" );
    public By btnVerficiar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[1]/ng-include/div/section/form/div/div/button" );
    public By btnVolver = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[3]/div[1]/a/img" );
    //falta en demo como es para selccionar.

    //PopUp pantalla Para otros
    //inputCuit
    public By inputCuitContribuyente = By.xpath ( "//*[@id='txtTaxPayerCuit']" );
    public By inputVep = By.xpath ( "//*[@id='txtVepNumber']" );
    public By btnVerificar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[1]/ng-include/div/section/form/div/div/button" );

    //Elegir
    //No tengo ejemplo
}
