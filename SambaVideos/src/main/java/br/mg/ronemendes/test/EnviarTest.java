//*****************************************Descrição Geral***********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: EnviarTest.java
// Descrição: Contém os métodos referente aos envios de vídeos ao site, realizados pelo usuário. 
//*************************************************************************************************************************


package br.mg.ronemendes.test;

import org.junit.Assert;
import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.EnviarPage;
import br.mg.ronemendes.pages.MenuPage;

public class EnviarTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private EnviarPage env = new EnviarPage();
	
	
	@Test
	public void uparArquivo() throws InterruptedException {
		menu.acessarTelaEnviarArquivos();
		env.clicarUpload();
		Assert.assertEquals("CLIQUE OU ARRASTE PARA ADICIONAR NOVOS VÍDEOS.", env.obterMensagem());
	}

}
