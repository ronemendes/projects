package br.mg.ronemendes.test;

import org.junit.Test;

import br.mg.ronemendes.core.BaseTest;
import br.mg.ronemendes.page.VotarPage;

public class VotarTest extends BaseTest {
	
	private VotarPage voto = new VotarPage();
	
	@Test
	public void testeVotarCategoriaDiversao() {
		voto.votarCategoriaDiversao();
	}

}
