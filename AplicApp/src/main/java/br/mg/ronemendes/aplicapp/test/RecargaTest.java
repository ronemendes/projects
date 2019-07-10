package br.mg.ronemendes.aplicapp.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.aplicapp.core.BaseTest;
import br.mg.ronemendes.aplicapp.page.MenuPage;
import br.mg.ronemendes.aplicapp.page.RecargaPage;
import br.mg.ronemendes.aplicapp.page.RecargaTelefoniaPage;

public class RecargaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private RecargaPage rec = new RecargaPage();
	private RecargaTelefoniaPage rectel = new RecargaTelefoniaPage();
	
	@Test
	public void testeRecarga() {
		menu.acessarMenu();
		menu.acessarMenuRecargas();
		rec.clicarOpcaoTelefonia();
		Assert.assertEquals("PREFACE9.9",rectel.obterNome());
		rectel.clicarOpcaoTIM();
		rectel.preencherCampoCel();
		rectel.clicarBotaoConfirmCel();
		//Assert.assertEquals("PREFACE9.9",rectel.obterNome());
	}
	
}
