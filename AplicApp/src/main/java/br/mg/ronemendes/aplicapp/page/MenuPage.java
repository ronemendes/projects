package br.mg.ronemendes.aplicapp.page;

import org.openqa.selenium.By;

import br.mg.ronemendes.aplicapp.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarMenu() {
		clicar(By.id("br.com.aplic.app:id/btnNavigationToggle"));
	}
	
	public void acessarMenuRecargas() {
		clicarPorTexto("Recargas");
	}
	
	
	
}
