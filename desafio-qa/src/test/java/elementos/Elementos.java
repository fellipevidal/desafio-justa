package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Page Inicial
	public By signIn = By.xpath("//a[@class='login']");
	public By login = By.id("email");
	public By password = By.id("passwd");
	public By submit = By.id("SubmitLogin");
	public By home = By.xpath("//a[@title='Home']");
	
	// Page Produtos
	public By produto = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a");
	public By addCart = By.xpath("//button[@name='Submit']");
	public By proceed = By.xpath("//a[@title='Proceed to checkout']");
	public By sumary = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']");
	
	// Page Endereço
	public By updateaddress = By.xpath("//*[@id=\"address_delivery\"]/li[9]/a/span");
	public By updateaddresscobranca = By.xpath("//*[@id=\"address_invoice\"]/li[9]/a/span");
	public By address = By.id("address1");
	public By addressSecond = By.id("address2");
	public By city = By.id("city");
	public By state = By.xpath("//select[@id='id_state']//option[@value='5']");
	public By submitaddress = By.xpath("//button[@id='submitAddress']");
	public By proceedAddress = By.xpath("//button[@name='processAddress']");
	
	// Page Envio
	public By termos = By.xpath("//input[@id='cgv']");
	public By proceedShipping = By.xpath("//button[@name='processCarrier']");
	
	// Page Pagamentos
	public By payBank = By.xpath("//a[@title='Pay by bank wire']");
	public By payCheck = By.xpath("//a[@title='Pay by check.']");
	public By paymentConfirm = By.xpath("//button[@class='button btn btn-default button-medium']");

}
