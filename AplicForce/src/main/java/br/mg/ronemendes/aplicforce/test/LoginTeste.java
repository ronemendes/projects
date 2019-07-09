package br.mg.ronemendes.aplicforce.test;

import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.LoginPage;

public class LoginTeste extends BaseTest{

	private LoginPage login = new LoginPage();
	
	@Test
	public void realizarLogin(){
		
		esperar(2000);
		
		//preencher campo usuário
		login.digitarUsuario("ateste");
		
		//preencher campo senha
		login.digitarSenha("rn8xz8xz");
		
		//clicar botão ACESSAR MINHA CONTA
		login.clicarPorTexto("ACESSAR MINHA CONTA");
		login.clicarPorTexto("PERMITIR");
	}
	
	
}
