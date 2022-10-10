package com.PagesObjets;

import java.io.File;

import com.MapsObjet.MapsObjetMercadoLibre;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetMercadoLibre extends MapsObjetMercadoLibre
{
//	String busquedas = null;
	//CREAR EL CONSTRUCTOR DE LA CLASE
	public PagsObjetMercadoLibre(AppiumDriver<MobileElement> driver)
	{
		super (driver);
		this.driver =(AppiumDriver<MobileElement>) driver;
	}

	public void mercadoLibre(String url,String producto,String email,File rutaCarpeta,String generarEvidencia) throws InterruptedException, Exception
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
		//TOCAR PANTALLA
		//tocarPantalla(325,387);
		//DAR ENTER A LA BUSQUEDA
		enter(btnBusGoogle,rutaCarpeta,generarEvidencia,"Se realiza la busqueda");
		//REALIZAR CLICK EN EL BUSCADOR
		click(btnBusObjeto,rutaCarpeta,generarEvidencia,"Se da click en el buscador");
		//ESCRIBIR EN EL INPUT DE BUSQUEDA DE MERCADO LIBRE
		sendkey(producto,btnBusObjeto, rutaCarpeta,generarEvidencia,"Se escribe el producto que se va a buscar");
		//DAR ENTER A LA BUSQUEDA
		enter(btnBusObjeto,rutaCarpeta,generarEvidencia,"Se realiza la busqueda");
		//TIEMPO DE ESPERA
		tiempoEspera(3000);
		//ESCOGER ALGUNA OPCION
		click(btnProducto,rutaCarpeta,generarEvidencia,"Se escoge la primera opcion");
		//REALIZAR SCROLL
		scrollVertical(btnProducto,rutaCarpeta,generarEvidencia,"Se realiza un sroll",532,400,0,7);
		//REALIZAR CLICK EN EL BOTON DE AGREGAR A CARRITO
		click(btnAddCarrito,rutaCarpeta,generarEvidencia,"Se realiza click en agregar a carrito");
		//TIEMPO DE ESPERA
		tiempoEspera(2000);
		//REALIZAR CLICK EN EL BOTON DE CREAR CUENTA
		click(btnCrearCuenta,rutaCarpeta,generarEvidencia,"Se realiza click en crear cuenta");
		//TIEMPO DE ESPERA
		tiempoEspera(2000);
		//REALIZAR CLICK EN EL CHECKBOX
		click(btnCheckBox,rutaCarpeta,generarEvidencia,"Se realiza click en el checkbox");
		//REALIZAR CLICK EN EL BOTON DE CONTINUAR
		click(btnContinuar,rutaCarpeta,generarEvidencia,"Se realiza click en continuar");
		//REALIZAR CLICK EN EL BOTON DE VALIDAR
		click(btnValidar,rutaCarpeta,generarEvidencia,"Se realiza click en validar");
		//ESCRIBIR EN EL INPUT DE GMAIL
		sendkey(email,btnInput, rutaCarpeta,generarEvidencia,"Se escribe el correo");
				
	}
		


}
