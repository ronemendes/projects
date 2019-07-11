//******************************************Descrição Geral**********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: ArquivosPage.java
// Descrição: Contém os métodos referente as ações da tela de "Documentação", onde os arquivos são anexados. 
//*****************************************************************************************************************************


package br.mg.ronemendes.aplicforce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.aplicforce.core.BasePage;
import br.mg.ronemendes.aplicforce.core.DriverFactory;

public class ArquivosPage extends BasePage {

	
	public void acessarArquivos() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnStepZeroSecondAction"));
	}
	
	public void acessarGaleria() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnGallery"));
	}
	
	public void permitirCamera() {
		clicarPorTexto("PERMITIR");
		clicarPorTexto("PERMITIR");
	}
	
	public void acessarGaleriaCelular() {
//		clicarPorTexto("Galeria");
//		clicarPorTexto("Só uma vez");
//		clicar(By.id("android:id/button_once"));
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//android:id/button_once")));

		WebElement upload = DriverFactory.getDriver().findElement(By.id("android:id/button_once"));
		upload.sendKeys("Este Computador\\ASUS_X017DA\\Armazenamento interno\\Pictures\\Imagem Teste.png");
	}
	
	
	public void selecionarArquivo() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnGallery"));
		
//		WebElement file_input = DriverFactory.getDriver().findElement(By.id("afv.aplic.com.br.dev:id/btnGallery"));
//		file_input.sendKeys("Este Computador\\ASUS_X017DA\\Armazenamento interno\\Pictures\\Imagem Teste.png");
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));

		WebElement upload = DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Video.3gp");
		
		
	}
	
	public void enviarArquivo() {
		clicar(By.id("afv.aplic.com.br.dev:id/btnUpload"));
	}
	
	
}
