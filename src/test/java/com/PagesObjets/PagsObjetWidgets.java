package com.PagesObjets;

import java.io.File;


import com.MapsObjet.MapsObjectsWidgets;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetWidgets extends MapsObjectsWidgets
{
//	String busquedas = null;
	//CREAR EL CONSTRUCTOR DE LA CLASE
	public PagsObjetWidgets(AppiumDriver<MobileElement> driver)
	{
		super (driver);
		this.driver =(AppiumDriver<MobileElement>) driver;
	}

	public void widgets(String url,File rutaCarpeta,String generarEvidencia) throws InterruptedException, Exception
	{
		//TIEMPO DE ESPERA
		tiempoEspera(2000);
		//REALIZAR CLICK EN NUEVA PESTAÑA
		click(btnPestaña,rutaCarpeta,generarEvidencia,"Se da click en nueva pestaña");
		//REALIZAR CLICK EN EL BUSCADOR
		click(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se da click en el buscador");
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//ESCRIBIR EN EL INPUT
		sendkey(url,btnBusGoogle,rutaCarpeta,generarEvidencia,"Se escribe lo que va a buscar");
		//DAR ENTER A LA BUSQUEDA
		enter(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se realiza la busqueda");
		//REALIZAR SCROLL
		scrollVertical(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se realiza un sroll",532,960,0,4);
		//REALIZAR CLICK EN WIDGETS
		click(btnWidgets,rutaCarpeta,generarEvidencia,"Se realiza click en widgets");
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//REALIZAR SCROLL
		scrollVertical(btnWidgets,rutaCarpeta,generarEvidencia,"Se realiza un sroll",532,540,1400,3);
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//REALIZAR CLICK EN DATE PICKER
		click(btnDatePicker,rutaCarpeta,generarEvidencia,"Se realiza click en date picker");
		//SELECCIONAR EL INPUT DE SELECT DATE
		click(btnSelectDate,rutaCarpeta,generarEvidencia,"Se selecciona el input de select date");
		//BORRAR CAMPO
		borrar(btnSelectDate,rutaCarpeta,generarEvidencia,"Se borra el campo");
		//ESCRIBIR EN EL INPUT
		sendkey(fechaDateWidgets(),btnSelectDate,rutaCarpeta,generarEvidencia,"Se escribe la nueva fecha");
		//DAR ENTER AL CAMPO
		enter(btnSelectDate,rutaCarpeta,generarEvidencia,"Se da enter para que se agregue la nueva fecha");
		//SELECCIONAR EL INPUT DE DATE AND TIME
		click(btnDateAndTime,rutaCarpeta,generarEvidencia,"Se selecciona el input de date and time");
		//BORRAR CAMPO
		borrar(btnDateAndTime,rutaCarpeta,generarEvidencia,"Se borra el campo");
		//ESCRIBIR EN EL INPUT
		sendkey(fechaDateWidgets(),btnDateAndTime,rutaCarpeta,generarEvidencia,"Se escribe la nueva fecha");
		//DAR ENTER A LA BUSQUEDA
		enter(btnDateAndTime,rutaCarpeta,generarEvidencia,"Se da enter para que se agregue la nueva fecha");
		
				
	}
		

}
