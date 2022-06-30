package Page.Pagos;

import org.openqa.selenium.By;

public class PagosServiciosPage {
    //Localizadores
    //Pantalla principal
    public By txtTitulo = By.xpath ( "//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[1]/div[2]" );
    public By txtPenditesFirma = By.xpath ( "//*[@id='page-content-wrapper']/div/div[1]/div/div/div/div[2]/div[1]/p[1]/span[1]" );
    //public By txtPendientesPago = By.xpath("//*[@id='page -content-wrapper']/div/div[1]/div/div/div/div[2]/div[1]/p[1]/span[1]");
    public By btnNuevoPago = By.xpath ( "//*[@id='popupContainer']/div/button" );
    public By tabAgendaPagos = By.xpath ( "//*[@id='tabs - list']/nav/div[1]/ul/li[2]/a" );
    public By tabHistorial = By.xpath ( "//*[@id='tabs - list']/nav/div[1]/ul/li[3]/a" );

    //PopUp pantalla  1
    //Nuevo Pago
    public By inputServicio = By.xpath ( "//*[@id='fl-input-17']" );
    public By selectServicio = By.xpath ( "//*[@id='ul-17']/li/md-autocomplete-parent-scope/span[2]/span[2]" );
    public By inputCodigo = By.xpath ( "//*[@id='txtAmount']" );
    public By btnVerificar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[1]/ng-include/div/section/form/div/div/button" );
    public By txtMensaje = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[1]/ng-include/div/section/form/alert-bind-message/div/div/div[2]/div/div" );

    //PopUp pantalla  2
    //Elegir Opcion
    public By chkOpcion = By.xpath ( "//*[@id='services']/div[1]/div/div[2]/div[1]/div/div[2]/p[2]" );
    public By btnSiguiente = By.xpath ( "//*[@id='services']/div[2]/div/button" );

    //PopUp pantalla  3
    //Elegir Cuenta e Importe
    public By btnCambiar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[3]/ng-include/div/div/section/form/div[1]/div/div[2]/div/button" );
    public By selectCuenta = By.xpath ( "//*[@id='select_value_label_18']" );
    public By selectCuentaPrimer = By.xpath ( "//*[@id='select_option_22']/div[1]/div/div[1]/span[1]" );
    public By inputImporte = By.xpath ( "//*[@id='amount']" );
    public By inputReferencia = By.xpath ( "//*[@id='txtReference']" );
    public By chkAgendar = By.xpath ( "//*[@id='agendaPayment']/div[1]" );
    public By btnContinuar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[3]/ng-include/div/div/section/form/div[3]/div/button" );

    //PopUp pantalla  4
    //Confirmar
    public By btnConfirmar = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[4]/ng-include/div/section/form/div[2]/div/button" );

    //PopUp pantalla 5
    //Token                                      
    public By selectMail = By.xpath ( "/html/body/div[5]/md-dialog/md-dialog/md-dialog-content/div/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/div/form[1]/div[2]/div[1]/md-input-container/md-select/" );
    public By selectMailPrimer = By.xpath ( "//*[@id='select_option_23']/div[1]" );
    public By btnEnviarCodigo = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/div/form[1]/div[2]/div[2]/button" );
    public By btnReEnviarCodigo = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/div/form[1]/div[2]/div[2]/button" );
    public By inputCodigoSeguridad = By.xpath ( "//*[@id='txtToken']" );
    public By btnConfirmarToken = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[5]/ng-include/div/div/section/div/div/form[2]/div/div[2]/button" );

    //PopUp pantalla  6
    //Pago en proceso
    public By btnImprimir = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[6]/ng-include/div/section/div[2]/div[1]/button" );
    public By btnIrAgenda = By.xpath ( "//*[@id='wrapper']/div[1]/div/div/div[5]/div[1]/div/div/section[6]/ng-include/div/section/div[2]/div[2]/button" );
}
