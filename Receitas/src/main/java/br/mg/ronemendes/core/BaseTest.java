//*****************************************Descrição Geral*************************************************************************************************************
// Autor: Rone Mendes
// Data: 07/2019
// Projeto: Processo Seletivo QA - Take
// Plataforma: Web
// 
// Classe: BaseTest.java
// Descrição: Classe base de teste para as demais classes do sistema. Neste projeto, está sendo utilizada para gerar os screenshots ao final do teste e abrir o site  
//*********************************************************************************************************************************************************************

package br.mg.ronemendes.core;

import static br.mg.ronemendes.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	
	
	@Rule
	public TestName testName = new TestName(); //para criar o nome do arquivo de screenshot
	
	//Antes de todos os testes, abre o site
	@Before
	public void inicializar() {
		DriverFactory.getDriver().get("https://qadatake.wordpress.com/2018/07/12/the-journey-begins/");
	}
	
	
	//Depois de todos os testes, função para gerar screenshots. Guarda na pasta target dentro do projeto
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver(); 
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshots" +
				File.separator + testName.getMethodName() + ".jpg")); //cria o arquivo com o nome do método de teste. File separator trata a barra de separação das pastas
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver(); 
		}
	}
	
	
}
