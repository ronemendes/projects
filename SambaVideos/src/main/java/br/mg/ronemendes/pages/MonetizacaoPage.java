//*****************************************Descrição Geral***********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: MonetizacaoPage.java
// Descrição: Contém os métodos base para a classe "MonetizacaoTest.java". 
//*************************************************************************************************************************


package br.mg.ronemendes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class MonetizacaoPage extends BasePage {

	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
	
	public String obterTextoTela() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='uploader-large']")));
		return obterTexto(By.xpath("//button[@id='uploader-large']"));
	}
	
	public void clicarCriarCampanha() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("create-campaign")));
		clicarBotao(By.id("create-campaign"));
	}
	
	public void digitarCampanha(String campanha) {
		//escrever(By.className("input-block-level maxable"), campanha);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class=\"input-block-level maxable\"]")));
		escrever(By.xpath("//input[@class=\"input-block-level maxable\"]"), campanha);
	}
	
	public void enviarVideoAnuncio() throws InterruptedException {
		  
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));

		WebElement upload = DriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Video.3gp");
		
	}
	
	public void selecionarHttpDestino(String valor) {
		selecionarCombo(By.name("ctProtocol"), valor);
	}
	
	public void inserirUrlDestino(String url) {
		escrever(By.name("urlClickThrough"), url);
	}
	
	public void testarLinkDestino() {
		clicar(By.linkText("Testar link"));
	}
	
	public void testarLinkRastreamento() {
		clicar(By.id("test_link_tracker"));
	}
	
	
	public void selecionarHttpRastreamento(String valor) {
		selecionarCombo(By.name("tProtocol"), valor);
	}
	
	public void inserirUrlRastreamento(String url) {
		escrever(By.name("urlTracker"),url);
	}
	
	public void selecionarCategoria() throws InterruptedException {
//		clicarCheckBox(By.xpath("//tr[@id='segmentation+0']"));
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[@id='segmentation+0']//input[@type='checkbox']")));
		clicarCheckBox(By.xpath("//tr[@id='segmentation+0']//input[@type='checkbox']"));
	}
	
	public void inserirInicioVeiculacao(String texto, String valor) {
		escrever(By.id("publishDate"), texto);
		selecionarCombo(By.name("startTime"), valor);
	}
	
	public void inserirFimVeiculacao(String texto, String valor) {
		escrever(By.id("unpublishDate"), texto);
		selecionarCombo(By.name("endTime"), valor);
	}
	
	public void inserirMeta(String texto) {
		escrever(By.xpath("//div[@class='input-append']//input[@name='target']"), texto);;
	}
	
	public void inserirPreco(String texto) {
		escrever(By.xpath("//div[@class='input-prepend']//input[@name='grossValue']"), texto);
	}
	
	public void clicarBotaoCriarCampanha() {
		clicarBotaoPorTexto("Criar campanha");
	}
}
