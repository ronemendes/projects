//*****************************************Descrição Geral**********************************************************************
// Autor: Rone Mendes
// Data: 05/2019
// App: TestLink - Sistema Web responsável pela gestão de Casos e Planos de Teste.
// Plataforma: Android
// 
// Classe: BaseTest.java
// Descrição: Classe base de teste para as demais classes do sistema. Utilizada para logar/deslogar no sistema, após a execução da bateria de testes. 
//************************************************************************************************************************


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
