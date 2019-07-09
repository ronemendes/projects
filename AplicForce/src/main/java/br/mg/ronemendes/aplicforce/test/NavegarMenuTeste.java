package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;

public class NavegarMenuTeste {

	private MenuPage menu = new MenuPage();
	
	
	@Test
	public void verificarOpcoesMenu() {	
		menu.acessarMenu();
		menu.acessarRotaClientes();
		//Assert.assertEquals("Rota / Clientes", menu.obterTitulo());
		menu.acessarMenu();
		menu.acessarCobrancasBoletos();
		//Assert.assertEquals("Cobranças / Boletos", menu.obterTitulo());
		menu.acessarMenu();
		menu.acessarRelatorioVendas();
		//Assert.assertEquals("Relatório de Vendas", menu.obterTitulo());
		menu.acessarMenu();
		menu.acessarEstoque();
		//Assert.assertEquals("Estoque", menu.obterTitulo());
		menu.acessarMenu();
		menu.acessarRemessas();
		//Assert.assertEquals("Remessas", menu.obterTitulo());
		menu.acessarMenu();
		menu.clicarInicio();
	}
	
	@Test
	public void sincronizarApp() {
		menu.sincronizar();
		menu.esperar(20000);
	}
}
