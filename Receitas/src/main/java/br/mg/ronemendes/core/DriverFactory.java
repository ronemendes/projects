package br.mg.ronemendes.core;
//*****************************************Descrição Geral*********************************************************************
//Autor: Rone Mendes
//Data: 07/2019
//
//Classe: DriverFactory.java
//Descrição: Utilizada para centralizar o driver. Padrões Singleton e Factory. 
//*****************************************************************************************************************************


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver; 

	//construtor
	private DriverFactory() {}
	
	//para acessar algo dessa classe, tera q vir através de um método estatico
	public static WebDriver getDriver() {
		
		//se driver diferente de null, ou seja, ja esta instanciado, ele nao entra aqui
		if(driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;	
			}
			driver.manage().window().setSize(new Dimension(1200, 765));
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) { 
			driver.quit();
			driver = null; 
		}
	}
}
