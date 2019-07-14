//*****************************************Descrição Geral**********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
// App: App: Sambavideos - Página para upload de videos em geral.
// Plataforma: Web
// 
// Classe: BaseTest.java
// Descrição: Classe base de teste para as demais classes do sistema. Utilizada para logar/deslogar no sistema, após a execução da bateria de testes. 
//************************************************************************************************************************


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
