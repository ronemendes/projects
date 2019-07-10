package br.mg.ronemendes.aplicapp.page;

import org.openqa.selenium.By;

import br.mg.ronemendes.aplicapp.core.BasePage;

public class LoginPage extends BasePage {

	public void digitarCPFouCNPJ() {
		escrever(By.id("br.com.aplic.app:id/txtDocument"), "805.812.606-35");
	}
	
	public void digitarUsuario() {
		escrever(By.id("br.com.aplic.app:id/txtUsername"), "TESTEJOSE2");
	}
	
	public void digitarSenha() {
		escrever(By.id("br.com.aplic.app:id/txtPassword"), "123456");
	}
	
	public void clicarEntrar() {
		clicar(By.id("br.com.aplic.app:id/btnLogin"));
	}
	
}
