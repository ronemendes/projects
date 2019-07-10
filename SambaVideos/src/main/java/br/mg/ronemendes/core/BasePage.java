package br.mg.ronemendes.core;

import static br.mg.ronemendes.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	
	public void escrever(By by, String texto){
		DriverFactory.getDriver().findElement(by).clear();
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
		
	}
	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	
//******************* Texto *****************************************	

	public String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
	
	public void clicarBotao(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	
	public void clicarBotaoPorTexto(String texto) {
		clicarBotao(By.xpath("//button[.='"+texto+"']"));
	}
	
	public void clicarNext() {
		clicarBotao(By.xpath("//*[@id='central-tips']//button[@id='next']"));
	}
	
	public void clicarPrev() {
		clicarBotao(By.xpath("//*[@id='central-tips']//button[@id='prev']"));
	}
	
	public void selecionarCombo(By by, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void clicarCheckBox(By by) {
		
		getDriver().findElement(by).click();
	}

}
