package br.mg.ronemendes.aplicapp.core;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.mg.ronemendes.aplicapp.page.LoginPage;

public class BaseTest {

	
	private LoginPage login = new LoginPage();
	
	
	@AfterClass	
	public static void finalizaClasse() {
		//DriverFactory.killDriver();
	}
	
	@Before
	public void inicializa() {
		login.digitarCPFouCNPJ();
		login.digitarUsuario();
		login.digitarSenha();
		login.clicarEntrar();
		esperar(7000);
		//Assert.assertEquals("SERVIÇOS", login.obterTexto());  verificar xpath
	}

	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
