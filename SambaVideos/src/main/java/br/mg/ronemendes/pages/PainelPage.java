package br.mg.ronemendes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class PainelPage extends BasePage {
		
	
	public String obterTituloTela() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='muted']")));
		return obterTexto(By.xpath("//span[@class='muted']"));
	}
	
	public void clicarBotaoCentralSuporteNext() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='central-tips']//button[@id='next']")));
		clicarNext();													//*[@id='central-tips']//button[@id="next"]
	}																		
	
	public void clicarBotaoCentralSuportePrev() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='central-tips']//button[@id='prev']")));
		clicarPrev();
	}
	
	public String obterTextoSuporte() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='central-tips']/div/div[2]/h3/a")));
		return obterTexto(By.xpath("//*[@id='central-tips']/div/div[2]/h3/a"));
	}
	
}
