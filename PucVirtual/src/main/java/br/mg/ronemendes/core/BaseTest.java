package br.mg.ronemendes.core;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import br.mg.ronemendes.page.LoginPage;

public class BaseTest {

	private LoginPage page = new LoginPage();
	// private DriverFactory driver = new DriverFactory();

	@Test
	public void inicializa() {

		page.acessarTelaPrincipal();
		page.acessarLogin();
//		System.out.println(DriverFactory.getDriver().getWindowHandle());
//		System.out.println(DriverFactory.getDriver().getWindowHandle());
		String parentWindow = DriverFactory.getDriver().getWindowHandle();
		Set<String> handles = DriverFactory.getDriver().getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				DriverFactory.getDriver().switchTo().window(windowHandle);
				// <!--Perform your operation here for new window-->
				DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				page.setLogin("L566997");
				page.setSenha("1623807");
				page.acessar();
				// driver.getDriver().close(); //closing child window

				// driver.getDriver().switchTo().window(parentWindow); //cntrl to parent window

			}
		}

	}
}
