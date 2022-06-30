package Page;

import org.openqa.selenium.By;

public class PosicionPage {
    //Localizadores
    public By titulo = By.xpath ( "/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/h3" );
    public By fila = By.xpath ( "//*[@id='1']/td[1]" );
    public By movimientosHistoricos = By.xpath ( "//*[@id='contextual']/ul/li[1]/a/span" );
    public By fechaDesde = By.xpath ( "//*[@id='fechaDesde']" );
    public By fechaHasta = By.xpath ( "//*[@id='fechaHasta']" );
    public By botonConsultarMovimientos = By.xpath ( "//*[@id='botonRealizarConsultaMovimientos']" );
}
