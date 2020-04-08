package com.cogemnto.pages.calls;

import org.openqa.selenium.WebDriver;

public class Calls {

	public Calls_ShowFilters callsshowfilters;
	public Calls_Export callsexport;
	public Calls_New callsnew;

	public Calls(WebDriver dr) {
		callsshowfilters = new Calls_ShowFilters(dr);
		callsexport = new Calls_Export(dr);
		callsnew = new Calls_New(dr);

	}

}
