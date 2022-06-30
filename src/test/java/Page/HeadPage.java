package Page;

import org.openqa.selenium.By;

public class HeadPage {
    public By Logo = By.cssSelector ( "#barra-nav > div > a > div" );
    public By Aa = By.cssSelector ( "#barra-nav > ul > li.hidden-xs.margin-5-t.margin-10-r.ng-scope > div > button > img" );
    public By Telefono = By.cssSelector ( "//#buttonSupport > span" );
    //public  By Perfil = By.cssSelector("#barra-nav > ul > li.profile-mobile.ng-scope");
    //public  By Perfil2 = By.cssSelector("#profileImage > img");
    public By Perfil = By.xpath ( "//div[@id='profileImage']" );
    public By Perfil2 = By.xpath ( "//span[@class='icon-person ng-hide']" );
    public By PerfilMobile = By.cssSelector ( "#barra-nav-mobile > div.pull-right" );


    public By miCuenta = By.cssSelector ( "[alt='perfil']" );
    public By btnSalir = By.xpath ( "(//button[@id='signoutBtn']" );


    //Drop
    public By EditarPerfil = By.cssSelector ( "#profilePopup > div.popup-arriba > div.profile-text.ng-binding > a" );
    public By Salir = By.xpath ( "//*[@id='signoutBtn']" );
    public By SalirMobile = By.xpath ( "//*[@id='barra-nav-mobile']/md-sidenav/div/div[1]/button" );
}
