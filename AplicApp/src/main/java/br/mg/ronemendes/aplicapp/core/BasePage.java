package br.mg.ronemendes.aplicapp.core;

import org.openqa.selenium.By;

public class BasePage {

	public void escrever(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	
	
	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarPorTexto(String texto) {
		clicar(By.xpath("//*[@text='"+texto+"']"));
	}
	
	public String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
		
	}
	
	public String obterTexto() {
		return obterTexto(By.className("android.widget.TextView"));
	}
}
