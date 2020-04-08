package com.cogemnto.pages.home;

import org.openqa.selenium.WebDriver;

import com.tricentis.automation.pages.AutomobilePages.Automobile_EnterInsuranceData;
import com.tricentis.automation.pages.AutomobilePages.Automobile_EnterProductData;
import com.tricentis.automation.pages.AutomobilePages.Automobile_EnterVehicleData;
import com.tricentis.automation.pages.AutomobilePages.Automobile_SelectPriceOption;
import com.tricentis.automation.pages.AutomobilePages.Automobile_SendQuote;

public class Homes {



public Automobile_EnterInsuranceData insuranceData ;
public Automobile_EnterProductData productData ;
public Automobile_EnterVehicleData vehicleData;
public Automobile_SelectPriceOption selectPrice ;
public Automobile_SendQuote sendQuote;

public Automobile(WebDriver dr)
{
	insuranceData = new Automobile_EnterInsuranceData(dr);
	productData = new Automobile_EnterProductData(dr);
	vehicleData = new Automobile_EnterVehicleData(dr);
	selectPrice = new Automobile_SelectPriceOption(dr);
	sendQuote=new Automobile_SendQuote(dr);
}


}
