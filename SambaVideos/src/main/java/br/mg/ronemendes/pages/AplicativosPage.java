package br.mg.ronemendes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.mg.ronemendes.core.BasePage;
import br.mg.ronemendes.core.DriverFactory;

public class AplicativosPage extends BasePage {

	public String obterTextoTela() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='page-header marginBottom20px']")));
		return obterTexto(By.xpath("//div[@class='page-header marginBottom20px']"));
	}
}
