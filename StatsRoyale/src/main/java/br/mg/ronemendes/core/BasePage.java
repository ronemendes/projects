package br.mg.ronemendes.core;

import static br.mg.ronemendes.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	
	public void escrever(By by, String texto){
		//getDriver().findElement(by).clear();  //limpa e escreve
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	public void clicarBotao (By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	
//	public void clicarBotaoPorTexto(String texto) {
//		//clicarBotao(By.xpath("//*[@class='refresh__button refresh__disabled']"));
//		clicarBotao(By.xpath("//button[.='"+texto+"']"));
//	}
}
