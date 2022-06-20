package pages;

public class PageProdutos extends PageInicial {

	public void selecionarProduto() throws InterruptedException {

		clicar(el.produto);
		clicar(el.addCart);
		Thread.sleep(5000);
		clicar(el.proceed);
		clicar(el.sumary);

	}

}
