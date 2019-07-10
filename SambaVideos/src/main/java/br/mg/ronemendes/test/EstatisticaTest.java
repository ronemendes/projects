package br.mg.ronemendes.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.EstatisticasPage;
import br.mg.ronemendes.pages.MenuPage;

public class EstatisticaTest extends BaseTest {
	
	private EstatisticasPage est = new EstatisticasPage();
	private MenuPage menu = new MenuPage();
	
	@Test
	public void pesquisarVisualizacoes() {
		menu.acessarTelaEstatisticas();
		est.filtraPeriodo("Últimos 30 dias");
		est.clicarBotaoFiltrar();
	}
	
	@Test
	public void pesquisarVisualizacoesPorData() throws InterruptedException {
		menu.acessarTelaEstatisticas();
		est.selecionarDataIni();
		est.selecionarDataFim();
		est.clicarBotaoFiltrar();
		Assert.assertEquals("Ainda não existem dados a serem exibidos", est.obterMensagemFiltro());
	}

}
