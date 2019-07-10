package br.mg.ronemendes.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.mg.ronemendes.pages.LoginPage;
import br.mg.ronemendes.test.EnviarTest;
import br.mg.ronemendes.test.EstatisticaTest;
import br.mg.ronemendes.test.MonetizacaoTest;
import br.mg.ronemendes.test.PainelTest;


@RunWith(Suite.class)
@SuiteClasses({
	//MenuTest.class,
	PainelTest.class,
	EstatisticaTest.class,
	EnviarTest.class,
	MonetizacaoTest.class
})

public class SuiteGeral {
	
	private static LoginPage page = new LoginPage();
	
	@BeforeClass  //antes de executar a switch, ele vai logar. Quando os testes foram executados, ja estará logado. (Tem que estar em um método estático)
	public static void reset() {
		page.acessarTelaLogin();
		page.inserirEmail("avaliacao_qa_samba@sambatech.com.br");
		page.inserirSenha("123456789");
		
		page.clicarEntrar();
		
		//DriverFactory.killDriver();
	}
	
	@AfterClass
	public static void finaliza() {
		//DriverFactory.killDriver();
	}


}
