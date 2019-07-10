package br.mg.ronemendes.pages;

import br.mg.ronemendes.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarEspecificarCasosdeTeste() {
		clicarLink("Especificar Casos de Teste");
	}
	
	public void acessarPesquisarCasosdeTeste() {
		clicarLink("Pesquisar Casos de Teste");
	}
	
	public void acessarCasosdeTesteUsuario() {
		clicarLink("Casos de teste criados por usuário");
	}
}
