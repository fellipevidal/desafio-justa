package teste;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.PageEndereco;
import pages.PageEnvio;
import pages.PageInicial;
import pages.PagePagamentos;
import pages.PageProdutos;

public class Teste {

	PageInicial pageinicial = new PageInicial();
	PageProdutos pageprodutos = new PageProdutos();
	PageEndereco pageendereco = new PageEndereco();
	PageEnvio pageenvio = new PageEnvio();
	PagePagamentos pagepagamentos = new PagePagamentos();

	
	@Dado("que eu selecione o produto no site")
	public void que_eu_selecione_o_produto_no_site() throws InterruptedException {

		pageinicial.Login();
		pageprodutos.selecionarProduto();

	}

	@Quando("alterar o endereco de entrega")
	public void alterar_o_endereco_de_entrega() {

		pageendereco.alterarEndereco();

	}

	@Quando("confirmar o envio")
	public void confirmar_o_envio() {

		pageenvio.termosEnvio();
	}

	@Quando("confirmar pagamento")
	public void confirmar_pagamento() {

		pagepagamentos.pagamentoTransf();
	}

	@Entao("a compra sera efetuada com sucesso")
	public void a_compra_sera_efetuada_com_sucesso() {

		pagepagamentos.fecharNavegador();

	}
	
	@Quando("alterar o endereco de cobranca")
	public void alterar_o_endereco_de_cobranca() {
	    
		pageendereco.alterarEndCobranca();
	}

	@Dado("confirmar endereco")
	public void confirmar_endereco() {
	    
		pageendereco.confirmarEndereco();
	}

	@Quando("selecionar pagamento com cheque")
	public void selecionar_pagamento_com_cheque() {
	  
		pagepagamentos.pagamentoCheque();
		
	}

}
