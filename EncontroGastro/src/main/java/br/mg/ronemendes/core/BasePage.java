package br.mg.ronemendes.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicar(String id) {
		clicar(By.id(id));
	}
	
	public void clicarBotaoPorTexto(String texto) {
		clicar(By.xpath("//class[.='"+texto+"']"));
	}
	
	public void selecionarCombo(String id, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
}
