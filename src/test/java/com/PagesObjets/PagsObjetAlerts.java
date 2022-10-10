package com.PagesObjets;

import java.io.File;



import com.MapsObjet.MapsObjectsAlerts;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetAlerts extends MapsObjectsAlerts
{

	//CREAR EL CONSTRUCTOR DE LA CLASE
	public PagsObjetAlerts(AppiumDriver<MobileElement> driver)
	{
		super (driver);
		this.driver =(AppiumDriver<MobileElement>) driver;
	}

	public void alerts(String url,String text,File rutaCarpeta,String generarEvidencia) throws InterruptedException, Exception
	{
		//TIEMPO DE ESPERA
		tiempoEspera(3000);
		//REALIZAR CLICK EN NUEVA PESTAÑA
		click(btnPestaña,rutaCarpeta,generarEvidencia,"Se da click en nueva pestaña");
		//REALIZAR CLICK EN EL BUSCADOR
		click(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se da click en el buscador");
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//ESCRIBIR EN EL INPUT
		sendkey(url,btnBusGoogle, rutaCarpeta,generarEvidencia,"Se escribe lo que va a buscar");
		//DAR ENTER A LA BUSQUEDA
		enter(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se realiza la busqueda");
		//REALIZAR SCROLL
		scrollVertical(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se realiza un sroll",532,760,0,4);
		//REALIZAR CLICK EN ALERTS,FRAME
		click(btnAlertsFrame,rutaCarpeta,generarEvidencia,"Se realiza click en alerts,frame");
		//REALIZAR CLICK EN ALERTS
		click(btnAlerts,rutaCarpeta,generarEvidencia,"Se realiza click en alerts");
		//REALIZAR CLICK EN EL PRIMER CLICK ME
		click(btnClick,rutaCarpeta,generarEvidencia,"Se realiza click en el primer boton");
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//REALIZAR CLICK EN ACEPTAR
		click(btnClickAceptar,rutaCarpeta,generarEvidencia,"Se realiza click en aceptar");
		//REALIZAR CLICK EN EL SEGUNDO CLICK ME
		click(btnClick2,rutaCarpeta,generarEvidencia,"Se realiza click en el segundo boton");
		//TIEMPO DE ESPERA
		tiempoEspera(6000);
		//REALIZAR CLICK EN ACEPTAR
		click(btnClickAceptar,rutaCarpeta,generarEvidencia,"Se realiza click en aceptar");
		//REALIZAR CLICK EN EL TERCER CLICK ME
		click(btnClick3,rutaCarpeta,generarEvidencia,"Se realiza click en el tercer boton");
		//REALIZAR CLICK EN ACEPTAR
		click(btnClickAceptar,rutaCarpeta,generarEvidencia,"Se realiza click en aceptar");
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//REALIZAR CLICK EN EL TERCER CLICK ME
		click(btnClick3,rutaCarpeta,generarEvidencia,"Se realiza click en el tercer boton");
		//REALIZAR CLICK EN CANCELAR
		click(btnClickCancelar,rutaCarpeta,generarEvidencia,"Se realiza click en cancelar");
		//TIEMPO DE ESPERA
		tiempoEspera(1000);
		//REALIZAR CLICK EN EL CUARTO CLICK ME
		click(btnClick4,rutaCarpeta,generarEvidencia,"Se realiza click en el cuarto boton");
		//ESCRIBIR EN EL INPUT
		sendkey(text,btnInput, rutaCarpeta,generarEvidencia,"Se escribe en el input");
		//REALIZAR CLICK EN ACEPTAR
		click(btnClickAceptar,rutaCarpeta,generarEvidencia,"Se realiza click en aceptar");
				
	}
		


}
