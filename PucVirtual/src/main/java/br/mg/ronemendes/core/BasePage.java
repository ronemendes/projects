package br.mg.ronemendes.core;

import org.openqa.selenium.By;

public class BasePage {

	
	public void clicarPorLink(String link) {
		DriverFactory.getDriver().findElement(By.linkText(link)).click();
	}
	
	public void escrever(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	
	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}
	
	public void clicarBotao(String id) {
		DriverFactory.getDriver().findElement(By.id(id)).click();
	}
}
