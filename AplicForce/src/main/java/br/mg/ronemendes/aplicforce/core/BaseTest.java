package br.mg.ronemendes.aplicforce.core;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import br.mg.ronemendes.aplicforce.page.LoginPage;

public class BaseTest {
	
	private LoginPage login = new LoginPage();
	
	@AfterClass	
	public static void finalizaClasse() {
		//DriverFactory.killDriver();
	}
	
	@Before
	//@Test
	public void inicializa() {
		esperar(2000);
		
		//mudar ambiente de produção para teste
		login.clicarMudarAmbiente();
		
		//preencher campo usuário
		login.digitarUsuario("ateste");
		
		//preencher campo senha
		login.digitarSenha("rn8xz8xz");
		
		//clicar botão ACESSAR MINHA CONTA
		login.clicarPorTexto("ACESSAR MINHA CONTA");
		login.clicarPorTexto("PERMITIR");
		System.out.println("Entrou pelo Base Test");
		
		esperar(20000);
		
		
	}
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
