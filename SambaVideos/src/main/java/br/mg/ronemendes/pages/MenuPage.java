package br.mg.ronemendes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class MenuPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
	
	public void acessarTelaPainel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mn-dashboard")));
		clicarBotao("mn-dashboard");
		
	}
	
	public void acessarTelaEnviarArquivos() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mn-upload")));
		clicarBotao("mn-upload");
	}
	
	public void acessarTelaConteudos() {
		clicarBotao("mn-content");
	}
	
	public void acessarTelaEstatisticas() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mn-statistics")));
		clicarBotao("mn-statistics");
	}
	
	public void acessarTelaMonetizacao() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mn-monetization")));
		clicarBotao("mn-monetization");
	}
	
	public void acessarTelaAplicativos() {
		clicarBotao("mn-apps");
		clicarBotao("mn-marketplace");
	}
}
