//*****************************************Descrição Geral***********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: MenuTest.java
// Descrição: Contém os métodos de teste referente a navegação entre os menus realizada pelo usuário no site. 
//*************************************************************************************************************************

package br.mg.ronemendes.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.AplicativosPage;
import br.mg.ronemendes.pages.EnviarPage;
import br.mg.ronemendes.pages.EstatisticasPage;
import br.mg.ronemendes.pages.MenuPage;
import br.mg.ronemendes.pages.PainelPage;

public class MenuTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private PainelPage pnl = new PainelPage();
	private EnviarPage env = new EnviarPage();
	private EstatisticasPage est = new EstatisticasPage();
	private AplicativosPage app = new AplicativosPage();
			
	@Test
	public void testarMenu() {
		//menu.acessarTelaPainel();
		Assert.assertEquals("123", pnl.obterTituloTela());
		
		menu.acessarTelaEnviarArquivos();
		Assert.assertEquals("UPLOAD", env.obterTextoTela());
		
		menu.acessarTelaConteudos();
		
		menu.acessarTelaEstatisticas();
		Assert.assertEquals("- 04/06/2019 a 04/06/2019", est.obterTextoTela());
		
		menu.acessarTelaMonetizacao();
		
		menu.acessarTelaAplicativos();
		Assert.assertEquals("Gerenciar Apps", app.obterTextoTela());
	}	
	
	
	
}
