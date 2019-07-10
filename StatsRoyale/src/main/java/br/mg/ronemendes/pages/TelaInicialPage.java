package br.mg.ronemendes.pages;

import org.openqa.selenium.By;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class TelaInicialPage extends BasePage {

	public void abrirTelaInicial() {
		DriverFactory.getDriver().get("https://statsroyale.com/pt");
	}
	
	public void setTag(String texto) {
		escrever(By.xpath(".//input"), texto);
	}
	
	public void Pesquisar() {
		clicarBotao(By.xpath(".//button"));
	}
}
