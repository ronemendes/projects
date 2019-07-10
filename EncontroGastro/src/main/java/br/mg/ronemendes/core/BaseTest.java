package br.mg.ronemendes.core;

import static br.mg.ronemendes.core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

	
	@Before
	public void inicializa() {
		DriverFactory.getDriver().get("http://www.encontrogastro.com.br/gastro/bh");
	}
	
	@After
	public void finaliza() throws IOException {
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}
