//*****************************************Descrição Geral***********************************************************************
// Autor: Rone Mendes
// Data: 07/2019
// Projeto: Processo Seletivo QA - Take
//
// Classe: ComentarioPage.java
// Descrição: Contém os métodos base para a classe "ComentarioTest.java". 
//*************************************************************************************************************************
package br.mg.ronemendes.pages;

import org.openqa.selenium.By;

import br.mg.ronemendes.core.BasePage;

public class ComentarioPage extends BasePage {

	
	public void inserirComentario(String texto) {
		escrever(By.id("comment"), texto);
	}
	
	public void inserirEmail(String texto) {
		escrever(By.id("email"),texto);
	}
	
	public void inserirNome(String texto) {
		escrever(By.id("author"),texto);
	}
	
	public void inserirSite(String texto) {
		escrever(By.id("url"),texto);
	}
	
	public void clicarPublicarComentario() {
		clicar(By.id("comment-submit"));
	}
	
	
}
