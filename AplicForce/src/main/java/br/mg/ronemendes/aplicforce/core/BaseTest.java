//*****************************************Descrição Geral**********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
// App: AplicForce - Aplicativo para realização de cadastro de clientes em geral bem como venda de produtos.
// Plataforma: Android
// 
// Classe: BaseTest.java
// Descrição: Classe base de teste para as demais classes do sistema. Utilizada para logar/deslogar no sistema, após a execução da bateria de testes. 
//************************************************************************************************************************

package br.mg.ronemendes.aplicforce.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.mg.ronemendes.aplicforce.page.LoginPage;

public class BaseTest {
	
	private LoginPage login = new LoginPage();
	
	
	@Rule
	public TestName testName = new TestName();   //para criar o nome do arquivo
	
	@After	
	public void finalizaClasse() {
		DriverFactory.killDriver();
	}
	
	@Before
	//@Test
	public void inicializa() {
		esperar(2000);
		
		//mudar ambiente de produção para teste
		login.clicarMudarAmbiente();
		
		//preencher campo usuário
		login.digitarUsuario("ateste");
		
		//preencher campo senha
		login.digitarSenha("rn8xz8xz");
		
		//clicar botão ACESSAR MINHA CONTA
		login.clicarPorTexto("ACESSAR MINHA CONTA");
		login.clicarPorTexto("PERMITIR");
		
		esperar(20000);
		
		
	}
	
	@After
	public void tearDown() {
		gerarScreenShot(); //chamadada do método de screenshot. Com o @After, será executado sempre depois de cada teste
	}
	
	//função para gerar os screenshots na pasta "screenshots"
	public void gerarScreenShot() {
		
		try {
			File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE); //cast
			FileUtils.copyFile(imagem, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
