//*****************************************Descrição Geral***********************************************************************
// Autor: Rone Mendes
// Data: 05/2019
//
// Classe: LoginPage.java
// Descrição: Contém os métodos referente ao login realizado pelo usuário 
//*************************************************************************************************************************


package br.mg.ronemendes.pages;

import org.openqa.selenium.By;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class LoginPage extends BasePage {

	public void acessarTelaLogin() {
		DriverFactory.getDriver().get("http://devel02.cellcard.com.br/testlink/login.php");
	}
	
	public void inserirLogin(String texto) {
		escrever(By.id("login"), texto);
	}
	
	public void inserirSenha(String texto) {
		escrever(By.name("tl_password"), texto);
	}
	
	public void logar() {
		clicarBotao(By.name("login_submit"));
	}
	
}
