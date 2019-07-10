package br.mg.ronemendes.test;

import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.MenuPage;
import br.mg.ronemendes.pages.MonetizacaoPage;

public class MonetizacaoTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private MonetizacaoPage mon = new MonetizacaoPage();
	
	@Test
	public void criarCampanhaTest() throws InterruptedException {
		menu.acessarTelaMonetizacao();
		mon.clicarCriarCampanha();
		mon.digitarCampanha("Campanha Teste");
		mon.enviarVideoAnuncio();
		mon.selecionarHttpDestino("https://");
		mon.inserirUrlDestino("www.google.com");
		//mon.testarLinkDestino();
		mon.selecionarHttpRastreamento("http://");
		mon.inserirUrlRastreamento("www.globo.com");
		//mon.testarLinkRastreamento();
		mon.selecionarCategoria();
		mon.inserirInicioVeiculacao("30/06/2019", "04:00");
		mon.inserirFimVeiculacao("30/07/2019", "05:00");
		mon.inserirMeta("200");
		mon.inserirPreco("1000");
		mon.clicarBotaoCriarCampanha();
	}
	
}
