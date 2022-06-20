package pages;

public class PageEndereco extends PageInicial {
	
	public void alterarEndereco() {
		
		clicar(el.updateaddress);
		apagarDados(el.address);
		preencher(el.address,"Rua Ali Saad");
		apagarDados(el.addressSecond);
		preencher(el.addressSecond, "159");
		apagarDados(el.city);
		preencher(el.city, "Osasco");
		clicar(el.state);
		clicar(el.submitaddress);
		clicar(el.proceedAddress);
	}
	
	public void alterarEndCobranca() {
		
		clicar(el.updateaddresscobranca);
		apagarDados(el.address);
		preencher(el.address, "Rua José Eugenio");
		apagarDados(el.addressSecond);
		preencher(el.addressSecond, "30");
		apagarDados(el.city);
		preencher(el.city, "Carapicuiba");
		clicar(el.state);
		clicar(el.submitaddress);
		clicar(el.proceedAddress);
	}
	
	public void confirmarEndereco() {
		
		clicar(el.proceedAddress);
	}

}
