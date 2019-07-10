package br.mg.ronemendes.core;

import static br.mg.ronemendes.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.mg.ronemendes.pages.PesquisaPassPage;

public class BaseTest {

	private PesquisaPassPage page = new PesquisaPassPage();
	WebDriver driver = new ChromeDriver();
	
	//@Before
	@Test
	public void inicializar() {
		page.acessarTelaPesquisa();
	}
	
	@After
	public void finalizar() {
		if(Propriedades.FECHAR_BROWSER) {
			DriverFactory.getDriver().quit();
			//killDriver();
		}
	}
	
}
