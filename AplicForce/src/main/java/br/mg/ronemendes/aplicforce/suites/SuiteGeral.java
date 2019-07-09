package br.mg.ronemendes.aplicforce.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.mg.ronemendes.aplicforce.core.DriverFactory;
import br.mg.ronemendes.aplicforce.page.LoginPage;
import br.mg.ronemendes.aplicforce.test.NavegarMenuTeste;
import br.mg.ronemendes.aplicforce.test.RealizarVisitaTeste;
import br.mg.ronemendes.aplicforce.test.RotaClientesTeste;
import br.mg.ronemendes.aplicforce.test.VerificarTelaCobrancaBoletosTeste;
import br.mg.ronemendes.aplicforce.test.VerificarTelaEstoqueTeste;
import br.mg.ronemendes.aplicforce.test.VerificarTelaRelatorioVendas;
import br.mg.ronemendes.aplicforce.test.VerificarTelaRemessasTeste;
import br.mg.ronemendes.aplicforce.test.VerificarTelaRotaClientesTeste;


@RunWith(Suite.class)
@SuiteClasses({
//	NavegarMenuTeste.class,
//	RealizarVisitaTeste.class,
	RotaClientesTeste.class,
//	VerificarTelaCobrancaBoletosTeste.class,
//	VerificarTelaEstoqueTeste.class,
//	VerificarTelaRelatorioVendas.class,
//	VerificarTelaRemessasTeste.class,
//	VerificarTelaRotaClientesTeste.class
	
})

public class SuiteGeral {

	
	public static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void reset() {
		page.clicarMudarAmbiente();
		page.digitarUsuario("ateste");
		page.digitarSenha("rn8xz8xz");
		page.clicarPorTexto("ACESSAR MINHA CONTA");
		page.clicarPorTexto("PERMITIR");
		esperar(20000);
		System.out.println("Entrou pela Suite");
	}
	
	public static void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}
}
