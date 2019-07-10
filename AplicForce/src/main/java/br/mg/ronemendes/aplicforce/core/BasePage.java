package br.mg.ronemendes.aplicforce.core;

import static br.mg.ronemendes.aplicforce.core.DriverFactory.getDriver;
//import static br.mg.ronemendes.appium.core.DriverFactory.getDriver;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class BasePage {

	public void escrever(By by, String texto) {
		// getDriver().findElement(By.className("android.widget.EditText")).sendKeys(texto);
		getDriver().findElement(by).sendKeys(texto);

	}

	public String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}

	public String obterTexto() {
		return obterTexto(By.id("afv.aplic.com.br.dev:id/lblMessage"));
	}

	public String obterTitulo() {
		return obterTexto(By.className("android.widget.TextView"));
	}

	public String obterTextoBotao() {
		return obterTexto(By.id("afv.aplic.com.br.dev:id/btnStartVisit"));
	}

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarPorTexto(String texto) {
		clicar(By.xpath("//*[@text='" + texto + "']"));
	}

	
	public void selecionarData() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnStartDate"));
		clicar(MobileBy.AccessibilityId("01 maio 2019"));
		clicar(By.id("afv.aplic.com.br.dev:id/ok"));
		
	}
	
//	public void selecionarDataFim() {
//		clicar(By.id("afv.aplic.com.br.dev:id/btnEndDate"));
//		
//	}

	public void scroll(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();

		int x = size.width / 2;

		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);

		new TouchAction(getDriver()).press(x, start_y).waitAction(Duration.ofMillis(500)).moveTo(x, end_y).release()
				.perform();
	}

	public void scrollDown() {
		scroll(0.9, 0.1);
	}

	// concluir e verificar
	public void selecionarArquivo(String path) throws InterruptedException {

		WebElement fileInput = DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys(path);
	}
	
	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
		return elementos.size() > 0;
	}

}
