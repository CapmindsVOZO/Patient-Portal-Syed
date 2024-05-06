package com.patientbugs;

import org.openqa.selenium.WebDriver;

public class Pom_Class {
	public static WebDriver driver;

	private Patient_Bugs pb;

	public Pom_Class(WebDriver driver2) {
		this.driver = driver2;

	}

	public Patient_Bugs getpatipobugs() {

		if (pb == null) {

			pb = new Patient_Bugs(driver);

		}
		return pb;

	}

}
