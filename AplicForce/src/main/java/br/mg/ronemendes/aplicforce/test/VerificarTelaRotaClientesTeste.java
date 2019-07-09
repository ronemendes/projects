package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;


public class VerificarTelaRotaClientesTeste {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void testVerificaTelaRota() {
		menu.acessarMenu();
		menu.acessarRotaClientes();
		menu.esperar(2000);
		Assert.assertEquals("Rota / Clientes", menu.obterTitulo());
	}

}
