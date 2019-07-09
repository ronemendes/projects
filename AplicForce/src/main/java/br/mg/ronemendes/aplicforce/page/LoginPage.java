package br.mg.ronemendes.aplicforce.page;

import org.openqa.selenium.By;

import br.mg.ronemendes.aplicforce.core.BasePage;

public class LoginPage extends BasePage {

	public void clicarMudarAmbiente() {
		for(int x = 0; x < 8; x++) {
			clicar(By.id("afv.aplic.com.br.dev:id/imageView"));
		}
	}

	public void digitarUsuario(String usuario) {
		// escrever(By.className("android.widget.EditText"), usuario);
		escrever(By.id("afv.aplic.com.br.dev:id/txtUsername"), usuario);
	}

	public void digitarSenha(String senha) {
		// escrever(By.className("android.widget.EditText"), senha);
		escrever(By.id("afv.aplic.com.br.dev:id/txtPassword"), senha);
	}

	public void clicarAcessarConta() {
		clicar(By.className("android.widget.Button"));
	}
}
