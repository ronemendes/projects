package br.mg.ronemendes.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class EstatisticasPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);

	// Verifica texto na tela
	public String obterTextoTela() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='muted fontBold font16px']")));
		return obterTexto(By.xpath("//span[@class='muted fontBold font16px']"));
	}

	public void filtraPeriodo(String valor) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select-period")));
		selecionarCombo(By.id("select-period"), valor);
	}

	public void clicarBotaoFiltrar() {
		clicar(By.xpath("//button[@type='submit']"));
	}

	//Insere data início
	public void selecionarDataIni() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-dataIni")));
		clicar(By.id("input-dataIni"));

		
		WebElement dateWidget = DriverFactory.getDriver().findElement(By.id("ui-datepicker-div"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-datepicker-div")));

		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
//		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));  
		
		

		for (WebElement cell : columns) {
			// Select data
			
			if (cell.getText().equals("1")) {
				 Thread.sleep(5000); //coloquei sleep mas não sei se é a melhor solução. Verificar
				//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("1")));
				cell.findElement(By.linkText("1")).click();
				break;
			}
		}

	

	}

	
	//Insere data fim
	public void selecionarDataFim() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-dataFim")));
		clicar(By.id("input-dataFim"));
		
		WebElement dateWidget = DriverFactory.getDriver().findElement(By.id("ui-datepicker-div"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-datepicker-div")));

		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
//		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));  
		
		

		for (WebElement cell : columns) {
			// Select data
			
			if (cell.getText().equals("3")) {
				 Thread.sleep(5000); //coloquei sleep mas não sei se é a melhor solução. Verificar
				//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("1")));
				cell.findElement(By.linkText("3")).click();
				break;
			}
		}
	}
	
	//Obtem mensagem de retorno do filtro vazio
	public String obterMensagemFiltro() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class=\"muted\"]")));
		return obterTexto(By.xpath("//p[@class=\"muted\"]"));
	}

}
