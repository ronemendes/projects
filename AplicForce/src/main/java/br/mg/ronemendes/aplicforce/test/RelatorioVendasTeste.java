package br.mg.ronemendes.aplicforce.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;

public class RelatorioVendasTeste extends BaseTest {

	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void testVisualizarRelatorioVendas() {
		menu.acessarMenu();
		menu.acessarRelatorioVendas();
		assertEquals("Relatório de Vendas", menu.obterTitulo());
	}
}
