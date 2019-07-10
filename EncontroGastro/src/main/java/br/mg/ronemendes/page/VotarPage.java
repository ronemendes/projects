package br.mg.ronemendes.page;

import org.openqa.selenium.By;

import br.mg.ronemendes.core.BasePage;

public class VotarPage extends BasePage {

	public void votarCategoriaDiversao(){
//		clicar(By.className("mdc-categoria-title rounded"));
		clicar(By.xpath("//*[@class = 'mdc-categorias']//h4[@onclick='mostrar(1);']"));
		selecionarCombo("mdc-sub-categoria-10", "Kanpai ");
	}
	
}
