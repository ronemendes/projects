package br.mg.ronemendes.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.MenuPage;
import br.mg.ronemendes.pages.PainelPage;

public class PainelTest extends BaseTest {

	private PainelPage pnl = new PainelPage();
	private MenuPage menu = new MenuPage();
	
	@Test
	public void testCentraldeSuporte() {
		menu.acessarTelaPainel();
		pnl.clicarBotaoCentralSuporteNext();
		Assert.assertEquals("Monetização", pnl.obterTextoSuporte());
		pnl.clicarBotaoCentralSuportePrev();
		Assert.assertEquals("Estatísticas", pnl.obterTextoSuporte());
	}
	
}
