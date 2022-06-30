package Page.Pagos;

import org.openqa.selenium.By;

public class PagosPage {

    //Localizadores
    //PersonaFisica
    public By titulo = By.xpath ( "//*[@id='content-wrapper']/div[1]/div/div/div[1]/div/div/div[1]/p[2]" );
    public By pagosServicios = By.xpath ( "//p[text()='Pagos de servicios']" );
    public By pagosAfip = By.xpath ( "//p[text()='Pagos AFIP']" );
    //Empresa
    public By pagoHaberes = By.xpath ( "//p[text()='Pago de haberes']" );
    public By PagoProveedores = By.xpath ( "//p[text()='Pago a proveedores']" );
    public By TransferenciaJuducal = By.xpath ( "//p[text()='Transferencias Judiciales']" );
}
