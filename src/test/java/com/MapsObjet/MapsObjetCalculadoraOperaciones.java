package com.MapsObjet;


import org.openqa.selenium.By;

import com.ClaseBase.ClasesBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetCalculadoraOperaciones extends ClasesBase
{
	
	//CONSTRUCTOR DE LA CLASE
	
	public MapsObjetCalculadoraOperaciones(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
	}	
	

	//ELEMENTOS DE PAGINA PRINCIPAL 
	
	protected By btnNumero= By.xpath("//android.widget.Button[@text = '{0}']");
	protected By btnOperacion= By.xpath("//android.widget.Button[@content-desc='{0}']");
	protected By btnIgual= By.xpath("//android.widget.Button[@content-desc='Igual']");
		
	

}
