package br.mg.ronemendes.pages;

import org.openqa.selenium.By;

import br.mg.ronemendes.core.BasePage;

public class PerfilPage extends BasePage{

	
	public void atualizarPerfil() {
		clicarBotao(By.xpath("//*[@class='refresh__button refresh__disabled']"));
	}
}
