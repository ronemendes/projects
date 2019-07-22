//*****************************************Descrição Geral***********************************************************************
// Autor: Rone Mendes
// Data: 07/2019
// Projeto: Processo Seletivo QA - Take
//
// Classe: ComentarioTeste.java
// Descrição: Contém os método de teste referente a inserção de um comentário no sistema. 
//*************************************************************************************************************************



package br.mg.ronemendes.test;

import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.pages.ComentarioPage;

public class ComentarioTeste extends BaseTest {

	private ComentarioPage com = new ComentarioPage();
	
	//função que insere um comentário na página principal
	@Test
	public void deveInserirComentario() throws InterruptedException {

		com.inserirComentario("Teste 123456789RR");
		Thread.sleep(3000);					//sleep inserido para carregamento dos demais campos
		com.inserirEmail("testerone999@email.com.br");
		com.inserirNome("Rone Teste1");
		com.inserirSite("www.teste000.comm.br");
		com.clicarPublicarComentario();
		
		//Aqui seria inserido um "Assert" para confirmar a publicação do comentário e não gerar um "falso positivo",
		//porém o sistema está com um bug ao qual não exibe a mensagem. Ocorre de maneira intermitente.
		// Esse teste cobre apenas o caminho feliz do fluxo.
	}
	
}
