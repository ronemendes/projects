package br.mg.ronemendes.aplicapp.page;

import org.openqa.selenium.By;

import br.mg.ronemendes.aplicapp.core.BasePage;
import io.appium.java_client.MobileBy;

public class RecargaTelefoniaPage extends BasePage {

	public void clicarOpcaoTIM() {
		clicarPorTexto("TIM");
	}

	public void clicarOpcaoCLARO() {
		clicarPorTexto("CLARO");
	}

	public void clicarOpcaoVIVO() {
		clicarPorTexto("VIVO");
	}

	public void clicarOpcaoOI() {
		clicarPorTexto("OI");
	}

	public void clicarOpcaoALGARCEL() {
		clicarPorTexto("ALGAR CEL");
	}

	public void clicarOpcaoNEXTEL() {
		clicarPorTexto("NEXTEL");
	}
	
	public void preencherCampoCel() {
		escrever(By.id("br.com.aplic.app:id/txtAction"), "31993556699");
	}
	
	public void clicarBotaoConfirmCel() {
		clicar(By.id("br.com.aplic.app:id/btnActionImageView"));
	}
	
	public String obterNome() {
		//return obterTexto(MobileBy.AccessibilityId("br.com.aplic.app:id/lblNavigationTitle"));
		return obterTexto(By.id("br.com.aplic.app:id/lblNavigationTitle"));
	}

}
