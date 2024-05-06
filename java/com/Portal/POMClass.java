package com.Portal;

import org.openqa.selenium.WebDriver;

import com.patientbugs.Patient_Bugs;

public class POMClass {
	public static WebDriver driver;

	private Pages pa;

	public POMClass(WebDriver driver2) {
		this.driver = driver2;

	}

	public Pages getPages() {

		if (pa == null) {

			pa = new Pages(driver);

		}
		return pa;

	}

}
