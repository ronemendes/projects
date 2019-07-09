package br.mg.ronemendes.aplicforce.test;

import static br.mg.ronemendes.aplicforce.core.DriverFactory.getDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.MenuPage;
import br.mg.ronemendes.aplicforce.page.RotaClientesPage;

public class RotaClientesTeste {

	private MenuPage menu = new MenuPage();
	private RotaClientesPage rota = new RotaClientesPage();	
	
	
	@Test
	public void iniciarRota() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		
		menu.acessarMenu();
		menu.acessarRotaClientes();
		//rota.selecionarPDV();   //descomentar apenas quando for executar apenas essa função
		rota.scrollDown();
		rota.selecionarPDV();
		rota.iniciarVisita();
		rota.clicarBotaoOK();
		rota.coletarEstoque();
		rota.preencherEstoque("1");
		rota.confirmarContagem();
		rota.clicarProdutos();
		rota.verificarExistenciaProdutos();
		rota.preencherQtdProdutos();
		rota.rastrear();
		rota.adicionarManual();
		rota.clicarBotãoAddSerial();		
		rota.clicarSerial();

		rota.esperar(3000);
		rota.voltar();
		
		rota.finalizarVenda();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("afv.aplic.com.br.dev:id/stepper_title")));
		rota.scrollDown();
		rota.formaPagamento();
		rota.confirmarFinalizar();
		rota.esperar(5000);  //sleep para esperar mensagem de confirmação ser exibida.
	}
	
	
	@Test
	public void rotaComRotaSemVenda() {
		
		menu.acessarMenu();
		menu.acessarRotaClientes();
		rota.selecionarPDV();
		rota.iniciarVisita();
		rota.clicarBotaoOK();
		rota.coletarEstoque();
		rota.preencherEstoque("1");
		rota.confirmarContagem();
		rota.clicarSemVenda();
		rota.motivoVisita();
		rota.confirmarMotivo();
		rota.confirmarFinalizar();
		rota.esperar(5000);  //sleep para esperar mensagem de confirmação ser exibida.
		
	}

}
