package br.mg.ronemendes.core;

import org.junit.Before;

import br.mg.ronemendes.pages.LoginPage;

public class BaseTest {

	private static LoginPage page = new LoginPage();
	
	@Before
	public void inicializar() {
		page.acessarTelaLogin();
		
		page.inserirLogin("ronemendes");
		page.inserirSenha("H@mmetT100110");
		page.logar();
	}
	
}
