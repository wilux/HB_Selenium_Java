package Page.Pagos;

import org.openqa.selenium.By;

public class PagosHaberesPage {

    //Localizadores
    //Pantalla principal
    public By titutlo = By.xpath ( "//div[text()=' Pago de haberes ']" );
    public By txtTitulo = By.xpath ( "//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[1]/div[2]" );
    public By btnPagarHaberes = By.xpath ( "//*[@id='popupContainer']/div/button" );
    public By tabEnValidacion = By.xpath ( "//a[@title='En Validación']" );
    public By tabPendienteFirma = By.xpath ( "//a[@title='Pendientes de Firma']" );
    public By tabEnProceso = By.xpath ( "//a[@title='En proceso']" );
    public By tabHistorial = By.xpath ( "//a[@title='Historial']" );


    //Popup Pago de haberes
    //Pantalla 1
    public By txtSubTitutlo = By.xpath ( "//h2[text()='Ingresá los pagos']" );
    public By inputPeriodo = By.xpath ( "//*[@id='period']" ); //EJ 05/2023
    //public  By FechaSeleccion = By.xpath("//td[@aria-label='septiembre 2022']/following-sibling::td[1]");
    public By selectConcepto = By.xpath ( "//*[@id='paymentConcept']" );
    public By linkSubirArchivo = By.xpath ( "//p[text()='Subir archivo']" );
    public By selectCuentaCorriente = By.xpath ( "(//div[@class='account-info-container'])[1]" );
    public By btnContinuar = By.xpath ( "//button[text()=' Continuar ']" );
    public By msgError = By.xpath ( "//div[@ng-show='fileError']//div[1]" );

    //Pantalla 2
    public By iconResultado = By.xpath ( "result-form-img" );
    public By txtResultadoTitulo = By.xpath ( "//h3[@class='margin-20-b system-yellow']" );
    public By txtResultadoDescripcion = By.xpath ( "//p[contains(@class,'margin-20-b font-size-18')]" );
    public By btnCerrar = By.xpath ( "//button[text()=' Cerrar ']" );

}
