package Page;

import org.openqa.selenium.By;

public class PrestamoPage {
    //Localizadores
    public By chkAcepto = By.xpath ( "//*[@id='tycAcept']" );
    public By btnAceptar = By.xpath ( "//*[@id='aceptar']" );
    public By comboLinea = By.xpath ( "/html/body/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/select[1]" );
    public By comboImportes = By.xpath ( "/html/body/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/select[2]" );
    public By comboDestinos = By.xpath ( "/html/body/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/select[3]" );
    public By detalle = By.xpath ( "/html/body/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[3]/table/thead/tr/th[1]/div" );

}
