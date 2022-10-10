package com.MapsObjet;


import org.openqa.selenium.By;

import com.ClaseBase.ClasesBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectsAlerts extends ClasesBase
{
	
	//CONSTRUCTOR DE LA CLASE
	
	public MapsObjectsAlerts(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
	}	
	

	//ELEMENTOS DE PAGINA PRINCIPAL 
	
	protected By btnPestaña= By.xpath("//android.widget.ImageButton[@content-desc='Nueva pestaña']");
	protected By btnBusGoogle= By.xpath("//android.widget.EditText[@text='Busca o escribe la dirección web']");
	protected By btnAlertsFrame= By.xpath("//android.widget.TextView[@text='Alerts, Frame & Windows']");
	protected By btnAlerts= By.xpath("//android.widget.TextView[@text='Alerts']");
	protected By btnClick= By.xpath("(//android.widget.Button[@text='Click me'])[1]");
	protected By btnClickAceptar= By.xpath("//android.widget.Button[@text='Aceptar']");
	protected By btnClickCancelar= By.xpath("//android.widget.Button[@text='Cancelar']");
	protected By btnClick2= By.xpath("(//android.widget.Button[@text='Click me'])[2]");
	protected By btnClick3= By.xpath("(//android.widget.Button[@text='Click me'])[3]");
	protected By btnClick4= By.xpath("(//android.widget.Button[@text='Click me'])[4]");
	protected By btnInput= By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/js_modal_dialog_prompt']");
	
	
}
