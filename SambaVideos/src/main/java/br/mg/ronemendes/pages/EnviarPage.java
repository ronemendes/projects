package br.mg.ronemendes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class EnviarPage extends BasePage {

	public String obterTextoTela() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='uploader-large']")));
		return obterTexto(By.xpath("//button[@id='uploader-large']"));
	}
	
	public void clicarUpload() throws InterruptedException {
//		  
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
//		Thread.sleep(3000);
//		clicarBotao(By.xpath("//button[@id='uploader-large']"));
		WebElement upload = DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Video.3gp");
		
		//clicarBotaoPorTexto("UPLOAD");
	}
	
	public String obterMensagem() {
		return obterTexto(By.xpath("//*[@id='uploader2']//h1[@class='init']"));
	}
	
}
