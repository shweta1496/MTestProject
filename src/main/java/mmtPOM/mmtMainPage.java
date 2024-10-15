package mmtPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class mmtMainPage 
{
	@FindBy (xpath = "(//span[text()='Flights'])[1]") private WebElement flights;
	@FindBy (xpath = "(//span[text()='Hotels'])[1]") private WebElement hotels;
	@FindBy (xpath = "(//span[text()='Homestays & Villas'])[1]") private WebElement stay;
	@FindBy (xpath = "(//span[text()='Holiday Packages'])[1]") private WebElement holidayPackage;
	@FindBy (xpath = "(//span[text()='Trains'])[1]") private WebElement trains;
	@FindBy (xpath = "(//span[text()='Buses'])[1]") private WebElement buses;
	@FindBy (xpath = "(//span[text()='Cabs'])[1]") private WebElement cabs;
	@FindBy (xpath = "(//span[text()='Forex Card & Currency'])[1]") private WebElement cards;
	@FindBy (xpath = "(//span[text()='Travel Insurance'])[1]") private WebElement insurance;
	@FindBy (xpath = "//li[text()='One Way']") private WebElement oneWay;
	@FindBy (xpath = "(//span[contains(@class,'tabsCircle')])[1]") private WebElement clickOneWay;
	@FindBy (xpath = "//li[text()='Round Trip']") private WebElement roundTrip;
	@FindBy (xpath = "(//span[contains(@class,'tabsCircle')])[2]") private WebElement clickRoundTrip;
	@FindBy (xpath = "//li[text()='Multi City']") private WebElement multiCity;
	@FindBy (xpath = "(//span[contains(@class,'tabsCircle')])[3]") private WebElement clickMultiWay;
	
	public mmtMainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTextOfFligts()
	{
		Reporter.log("get text flights", true);
		String actualText =flights.getText();
		return actualText;
	}
	
	public String getTextOfHotels()
	{
		Reporter.log("get text hotels", true);
		String actualText =hotels.getText();
		return actualText;
	}

	public String getTextOfStays()
	{
		Reporter.log("get text stays", true);
		String actualText =stay.getText();
		return actualText;
	}

	public String getTextOfHolidayPackages()
	{
		Reporter.log("get text holiday packages", true);
		String actualText =holidayPackage.getText();
		return actualText;
	}

	public String getTextOfTrains()
	{
		Reporter.log("get text trains", true);
		String actualText =trains.getText();
		return actualText;
	}

	public String getTextOfBuses()
	{
		Reporter.log("get text buses", true);
		String actualText =buses.getText();
		return actualText;
	}

	public String getTextOfCabs()
	{
		Reporter.log("get text cabs", true);
		String actualText =cabs.getText();
		return actualText;
	}

	public String getTextOfCards()
	{
		Reporter.log("get text cards", true);
		String actualText =cards.getText();
		return actualText;
	}

	public String getTextOfInsurance()
	{
		Reporter.log("get text insurance", true);
		String actualText =insurance.getText();
		return actualText;
	}	
	
	public String getTextOfOneWay()
	{
		Reporter.log("get text oneWay button", true);
		String actualText =oneWay.getText();
		return actualText;
	}
	
	public void clickOnOneWayButton()
	{
		Reporter.log("clicking on oneWay button", true);
		clickOneWay.click();		
	}
	
	public String getTextOfRoundTrip()
	{
		Reporter.log("get text roundTrip button", true);
		String actualText =roundTrip.getText();
		return actualText;
	}
	
	public void clickOnRoundTripButton()
	{
		Reporter.log("clicking on roundTrip button", true);
		clickRoundTrip.click();
	}
	
	public String getTextOfMultiCity()
	{
		Reporter.log("get text multiCity button", true);
		String actualText =multiCity.getText();
		return actualText;
	}
	
	public void clickOnMultiCityButton()
	{
		Reporter.log("clicking on multiCity button", true);
		clickMultiWay.click();
		
	}
}
