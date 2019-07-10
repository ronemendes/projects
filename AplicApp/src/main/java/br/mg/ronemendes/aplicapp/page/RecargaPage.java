package br.mg.ronemendes.aplicapp.page;

import br.mg.ronemendes.aplicapp.core.BasePage;

public class RecargaPage extends BasePage {

	
	public void clicarOpcaoTelefonia() {
		clicarPorTexto("Telefonia");
	}
	
	public void clicarOpcaoTVPrePago() {
		clicarPorTexto("TV Pré-Pago");
	}
	
	public void clicarOpcaoSteam() {
		clicarPorTexto("Steam");
	}
	
	public void clicarOpcaoMais() {
		clicarPorTexto("Mais...");
	}
	
}
