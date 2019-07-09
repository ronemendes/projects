package br.mg.ronemendes.aplicforce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.aplicforce.core.BasePage;
import br.mg.ronemendes.aplicforce.core.DriverFactory;
import io.appium.java_client.MobileBy;

public class MenuPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);

	public void acessarMenu() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageButton")));
		clicar(By.className("android.widget.ImageButton"));

	}
	
	public void clicarInicio() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[@text='Início']")));
		clicar(By.xpath("//android.widget.CheckedTextView[@text='Início']"));
	}

	public void acessarRotaClientes() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[@text='Rota / Clientes']")));
		clicar(By.xpath("//android.widget.CheckedTextView[@text='Rota / Clientes']"));
	}

	public void acessarCobrancasBoletos() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[@text='Cobranças / Boletos']")));
		clicar(By.xpath("//android.widget.CheckedTextView[@text='Cobranças / Boletos']"));
	}

	public void acessarRelatorioVendas() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[@text='Relatório de Vendas']")));
		clicar(By.xpath("//android.widget.CheckedTextView[@text='Relatório de Vendas']"));
	}

	public void acessarEstoque() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[@text='Estoque']")));
		clicar(By.xpath("//android.widget.CheckedTextView[@text='Estoque']"));
	}

	public void acessarRemessas() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.CheckedTextView")));
		clicarPorTexto("Remessas");
	}

	public void sincronizar() {
//		clicar(By.className("android.widget.ImageView"));
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Mais opções")));
		clicar(MobileBy.AccessibilityId("Mais opções"));
		clicar(By.id("afv.aplic.com.br.dev:id/title"));
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
