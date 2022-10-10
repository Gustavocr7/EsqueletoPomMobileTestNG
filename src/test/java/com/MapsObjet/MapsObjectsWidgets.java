package com.MapsObjet;


import org.openqa.selenium.By;

import com.ClaseBase.ClasesBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectsWidgets extends ClasesBase
{
	
	//CONSTRUCTOR DE LA CLASE
	
	public MapsObjectsWidgets(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
	}	
	

	//ELEMENTOS DE PAGINA PRINCIPAL 
	
	protected By btnPestaña= By.xpath("//android.widget.ImageButton[@content-desc='Nueva pestaña']");
	protected By btnBusGoogle= By.xpath("//android.widget.EditText[@text='Busca o escribe la dirección web']");
	protected By btnWidgets= By.xpath("//android.widget.TextView[@text='Widgets']");
	protected By btnDatePicker= By.xpath("//android.widget.TextView[@text='Date Picker']");
	protected By btnSelectDate= By.xpath("//android.widget.EditText[@resource-id='datePickerMonthYearInput']");
	protected By btnDateAndTime= By.xpath("//android.widget.EditText[@resource-id='dateAndTimePickerInput']");

	
	
}
