package pages;

public class PagePagamentos extends PageInicial {

	public void pagamentoTransf() {

		clicar(el.payBank);
		clicar(el.paymentConfirm);

	}

	public void pagamentoCheque() {

		clicar(el.payCheck);
		clicar(el.paymentConfirm);
	}

}
