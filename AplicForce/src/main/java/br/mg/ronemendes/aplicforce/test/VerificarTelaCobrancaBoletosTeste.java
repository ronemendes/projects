package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;

public class VerificarTelaCobrancaBoletosTeste {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void testVerificarTelaCobrancaBoleto() {
		menu.acessarMenu();
		menu.acessarCobrancasBoletos();
		menu.esperar(2000);
		Assert.assertEquals("Cobranças / Boletos", menu.obterTitulo());
	}
	
}
