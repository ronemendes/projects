//*****************************************Descrição Geral*********************************************************************
// Autor: Rone Mendes
// Data: 06/2019
//
// Classe: DriverFactory.java
// Descrição: Utilizada centralizar o driver. Padrões Singleton e Factory. 
//*****************************************************************************************************************************

package br.mg.ronemendes.aplicforce.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement>getDriver(){
		if(driver == null) { 
			createDriver();
		}
		
		return driver;
	}
	
	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		//desiredCapabilities.setCapability("deviceName", "Teste"); //device nome apenas para IOS
		desiredCapabilities.setCapability("deviceName", "J8AXB60249577J6");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
//	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
//	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); //sem activity e package, ele tenta instalar o app. Se ja estiver instalado, ele da reset
		//desiredCapabilities.setCapability("appWaitActivity", "afv.aplic.com.br.activity.LoginActivity");
		desiredCapabilities.setCapability("appWaitActivity", "afv.aplic.com.br.ui.activity.LoginActivity");
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Rone\\eclipse-workspace-appium\\AplicForce\\src\\main\\resources\\app-dev-release1.0.33.apk");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Rone\\eclipse-workspace-appium\\AplicForce\\src\\main\\resources\\app-dev-v23.apk");
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\roneh\\eclipse-workspace\\AplicForce\\src\\main\\resources\\app-dev.apk");
		
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities); //onde ele irá conectar. LocalHost
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
