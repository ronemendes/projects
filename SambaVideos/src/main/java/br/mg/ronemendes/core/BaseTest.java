package br.mg.ronemendes.core;

import static br.mg.ronemendes.core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

import br.mg.ronemendes.pages.LoginPage;

public class BaseTest {

	
	private LoginPage page = new LoginPage();
	
	@Before
	public void inicializar() {
		page.acessarTelaLogin();
		page.inserirEmail("avaliacao_qa_samba@sambatech.com.br");
		page.inserirSenha("123456789");
		page.clicarEntrar();
	}
	
	@After
	public void finaliza() throws IOException {
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}
