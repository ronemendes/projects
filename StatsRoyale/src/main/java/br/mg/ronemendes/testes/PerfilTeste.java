package br.mg.ronemendes.testes;

import org.junit.Test;
import org.openqa.selenium.By;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.PerfilPage;

public class PerfilTeste extends BaseTest {

	private PerfilPage perfilPage = new PerfilPage();
	
	@Test
	public void testAtualizarPerfil() {
		perfilPage.clicarBotao(By.xpath("//*[@class='refresh__buttonText']"));
	}
}
