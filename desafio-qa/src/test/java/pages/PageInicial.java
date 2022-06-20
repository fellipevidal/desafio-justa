package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PageInicial extends Metodos {
	
	Elementos el = new Elementos();

	public void Login() {
		
		acessarSite("Chrome");
		clicar(el.signIn);
		preencher(el.login, "candidato@justa.com.vc");
		preencher(el.password, "tamojusto");
		clicar(el.submit);
		clicar(el.home);
	}
	

	
}
