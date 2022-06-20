package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.IniciarTeste;

public class Metodos extends IniciarTeste {

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
	}

	public void preencher(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void apagarDados(By elemento) {

		driver.findElement(elemento).clear();
	}

	public void fecharNavegador() {

		driver.quit();
	}
}
