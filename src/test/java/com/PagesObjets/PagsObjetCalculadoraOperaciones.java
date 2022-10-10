package com.PagesObjets;

import java.io.File;

import com.MapsObjet.MapsObjetCalculadoraOperaciones;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetCalculadoraOperaciones extends MapsObjetCalculadoraOperaciones
{

	//CREAR EL CONSTRUCTOR DE LA CLASE
	public PagsObjetCalculadoraOperaciones(AppiumDriver<MobileElement> driver)
	{
		super (driver);
		this.driver =(AppiumDriver<MobileElement>) driver;
	}

	public void OperacionSuma(String num1,String operacion,String num2,File rutaCarpeta,String generarEvidencia) throws InterruptedException, Exception
	{
	
		//CLICk AL PRIMER NUMERO
		numeroSeparados(num1,btnNumero,rutaCarpeta,generarEvidencia,"Se escribe el primer numero");
		// CLICK EN EL OPERADOR
		click(localizadorVariable(btnOperacion,operacion),rutaCarpeta,generarEvidencia,"Se escoge la operacion a realizar");
		//CLIC AL SEGUNDO NUMERO
		numeroSeparados(num2,btnNumero,rutaCarpeta,generarEvidencia,"Se escribe el segundo numero");
		//CLIC EN EL SIGNO IGUAL
		click(btnIgual,rutaCarpeta,generarEvidencia,"Se selecciona la opcion igual");
		tiempoEspera(1000);
		
	}
 	


}
