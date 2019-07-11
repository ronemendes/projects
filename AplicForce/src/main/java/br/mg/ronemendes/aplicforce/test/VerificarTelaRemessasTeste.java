//*************************************************Descrição Geral*******************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: VerificarTelaCobrancaBoletos.java
// Descrição: valida as informações da tela Remessas
//*******************************************************************************************************************************

package br.mg.ronemendes.aplicforce.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BasePage;
import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;

public class VerificarTelaRemessasTeste {

	private MenuPage menu = new MenuPage();
	private BasePage page = new BasePage();
	
	@Test
	public void testVisualizarRemessas() {
		menu.acessarMenu();
		menu.acessarRemessas();
		menu.esperar(2000);
		Assert.assertEquals("Remessas", menu.obterTitulo()); //Confere se está na tela correta
	}
	
	//@Test
	public void testFiltroData() {
		menu.acessarMenu();
		menu.acessarRemessas();
		page.selecionarData();
	}
	
}
