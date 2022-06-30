package Page;

import org.openqa.selenium.By;

public class MenuPage {
    //Localizadores
    public By Contexto = By.xpath ( "//*[@id='wrapper']/div/ng-include/div/section/div/ul/li[1]/a/div[2]/p[2]/span[2]" );
    public By ContextoPersona = By.xpath ( "//*[@id='wrapper']/div/ng-include/div/section/div/ul/li[1]/ul/li[1]" );
    public By ContextoEmpresa = By.xpath ( "//*[@id='wrapper']/div/ng-include/div/section/div/ul/li[1]/ul/li[2]" );
    public By Cuentas = By.xpath ( "//a[normalize-space() = 'Cuentas']" );
    public By Cheques = By.xpath ( "//a[normalize-space() = 'Cheques']" );
    public By PlazoFijo = By.xpath ( "//a[normalize-space() = 'Plazos fijos']" );
    public By Transferencias = By.xpath ( "//a[normalize-space() = 'Transferencias']" );
    public By Pagos = By.xpath ( "//a[normalize-space() = 'Pagos']" );
    public By Mas = By.xpath ( "//a[normalize-space() = 'Más']" );
    public By PagosDebin = By.xpath ( "//a[contains(.,'Pagos DEBIN')]" );
    public By FacturasElectronicas = By.xpath ( "//a[contains(.,'Facturas electrónicas')]" );
    public By Autorizados = By.xpath ( "//a[contains(.,'Autorizados')]" );
    public By GestionarProductos = By.xpath ( "//a[contains(.,'Gestionar productos')]" );
    public By AdmPerfil = By.xpath ( "//a[contains(.,'Administrar mi perfil')]" );
    //public  By Autorizados = By.xpath("//*[@id='wrapper']/div/ng-include/div/section/div/ul/li[7]/ul/li[3]/a");
    //public  By AdmPerfil = By.xpath("//*[@id='wrapper']/div/ng-include/div/section/div/ul/li[7]/ul/li[5]/a");
}
