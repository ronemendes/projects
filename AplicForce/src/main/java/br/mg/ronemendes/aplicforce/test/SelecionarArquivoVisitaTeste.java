//*************************************************Descrição Geral*******************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: SelecionarArquivoVisitaTeste.java
// Descrição: responsável pelos testes na tela de anexo de documentos
//*******************************************************************************************************************************

package br.mg.ronemendes.aplicforce.test;

import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.ArquivosPage;
import br.mg.ronemendes.aplicforce.page.RealizarVisitaPage;

public class SelecionarArquivoVisitaTeste extends BaseTest {

	private RealizarVisitaPage page = new RealizarVisitaPage(); 
	private ArquivosPage arq = new ArquivosPage();
	
	@Test
	public void selecionarArquivoTeste() throws InterruptedException {
		
		page.clicarBotaoVisita();
		arq.acessarArquivos();
		arq.permitirCamera();
		arq.acessarGaleria();
//		arq.acessarGaleriaCelular();
//		arq.selecionarArquivo();
		arq.enviarArquivo();
		//concluir
	}
	
}
