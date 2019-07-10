package br.mg.ronemendes.page;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class LoginPage extends BasePage{

	
	public void acessarTelaPrincipal() {
		DriverFactory.getDriver().get("https://www.pucminas.br/PucVirtual/Paginas/default.aspx");
		//DriverFactory.getDriver().get("https://ava.virtual.pucminas.br/login/index.php");
	}
	
	public void acessarLogin() {
		clicarPorLink("AVA – Moodle");
	}
	
	public void setLogin(String texto) {
		escrever("username", texto);
	}
	
	public void setSenha(String texto) {
		escrever("password", texto);
	}
	
	public void acessar() {
		clicarBotao("loginbtn");
	}
}
