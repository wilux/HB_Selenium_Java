package Page;

import org.openqa.selenium.By;

public class MailinatorPage {
    //Localizadores
    public By Fila = By.xpath ( "//td[contains(.,'[BPN] - Código de Autorización')]" );
    public By token = By.cssSelector ( "body > div > div:nth-child(2) > p > span" );
    public By FilaAsunto = By.xpath ( "//td[contains(normalize-space(),'just now') or contains(normalize-space(),'minute')]" );
    //public  By FilaAsunto = By.xpath("//td[contains(normalize-space(),'just now') or contains(normalize-space(),'an hour')]");


}
