package br.mg.ronemendes.pages;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class PesquisaPassPage extends BasePage {
	
	public void acessarTelaPesquisa() {
		DriverFactory.getDriver().get("https://www.viajanet.com.br/");
	}

}
