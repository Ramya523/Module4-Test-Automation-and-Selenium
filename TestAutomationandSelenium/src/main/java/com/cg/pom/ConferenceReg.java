//entering the details into the web browser
package com.cg.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ConferenceReg {
	
	static WebDriver driver;
	public ConferenceReg(WebDriver driver) {
		this.driver=driver;
	}
	
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	
	public void giveFirstName() {
		System.out.println(driver.getTitle());
		driver.findElement(firstName).sendKeys("Ramya");//entering the first name
	}
	
	public void giveLastName() {
		driver.findElement(lastName).sendKeys("Koppisetti");//entering the last name
	}
	
	public void giveEmail() {
		driver.findElement(email).sendKeys("ramya@gmail.com");//entering the email address
	}
	
	public void giveContact() {
		driver.findElement(contactNo).sendKeys("9876543272");//entering the contact number
	}
	
	public void giveNoOfPeople() {
		//driver.findElement(noOfPeople).sendKeys("");
		Select country = new Select(driver.findElement(noOfPeople));//selecting the number of people
		country.selectByVisibleText("1");
	}
	
	public void giveBuildingName() {
		driver.findElement(buildingName).sendKeys("ramya apts");// entering the building name
	}
	
	public void giveAreaName() {
		driver.findElement(areaName).sendKeys("mehdipatnam");//entering the area name
	}
	
	public void giveCity() {
		Select typeCity = new Select(driver.findElement(city));//selecting the city
		typeCity.selectByVisibleText("Hyderabad");
	}
	
	public void giveState() {
		Select typeState = new Select(driver.findElement(state));//selecting the state
		typeState.selectByVisibleText("Telangana");
	}
	
	public void giveCconferenceAccess() {
		WebElement radio1 = driver.findElement(conferenceAccess);//selecting the conference access
		radio1.click();
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
