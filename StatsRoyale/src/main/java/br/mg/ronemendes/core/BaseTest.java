package br.mg.ronemendes.core;

import org.junit.Before;

import br.mg.ronemendes.pages.TelaInicialPage;

public class BaseTest {

	private static TelaInicialPage page = new TelaInicialPage();
	
	@Before
	public void inicializa() {
		page.abrirTelaInicial();
		
		page.setTag("800Q008R0");
		page.Pesquisar();
		
	}
}
