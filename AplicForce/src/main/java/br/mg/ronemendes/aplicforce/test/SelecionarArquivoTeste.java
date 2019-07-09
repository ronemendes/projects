package br.mg.ronemendes.aplicforce.test;

import org.junit.Test;

import br.mg.ronemendes.aplicforce.core.BaseTest;
import br.mg.ronemendes.aplicforce.page.ArquivosPage;
import br.mg.ronemendes.aplicforce.page.RealizarVisitaPage;

public class SelecionarArquivoTeste extends BaseTest {

	private RealizarVisitaPage page = new RealizarVisitaPage(); 
	private ArquivosPage arq = new ArquivosPage();
	
	@Test
	public void selecionarArquivoTeste() throws InterruptedException {
		
		page.clicarBotaoVisita();
		arq.acessarArquivos();
		arq.permitirCamera();
		arq.acessarGaleria();
		arq.acessarGaleriaCelular();
		arq.selecionarArquivo("Este Computador\\ASUS_X017DA\\Armazenamento interno\\Pictures.Foto.jpg");
	}
	
}
