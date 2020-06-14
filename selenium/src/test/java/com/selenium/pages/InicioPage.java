package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;
	
	public InicioPage(WebDriver driver) {
		this.driver= driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void se�lecionarTipoFormul�rio() {
		inicioMap.selectTipoFormulario.select(driver,"Feedback");
		inicioMap.botaoviewDemo("Neighborhood Events Questionnaire Form Demo").click(driver);
	}
}
