package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;


public class VerificarTelaEstoqueTeste{

	private MenuPage menu = new MenuPage();
	
	
	@Test
	public void testVisualizarEstoque() {
		menu.acessarMenu();
		menu.acessarEstoque();
		menu.esperar(2000);
		Assert.assertEquals("Estoque", menu.obterTitulo());
	}
}
