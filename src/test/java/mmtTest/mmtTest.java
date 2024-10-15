package mmtTest;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mmtBase.base;
import mmtPOM.mmtMainPage;
import mmtUtility.Utility;


public class mmtTest extends base 
{
	String excelPath = System.getProperty("user.dir") + "\\Data\\TestExcel.xlsx";
	String mySheet = "mmt";
	
	public static Logger logger;
	
	mmtMainPage mainPage;
	
	@BeforeMethod
	public void launch() throws IOException
	{	
		launchBrowser();
		   
		mainPage = new mmtMainPage(driver);	
	    logger= Logger.getLogger("MyMavenProject");
		PropertyConfigurator.configure("log4j.properties");	
	}
	
	@Test(priority = -1)
	public void validateFlightsText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of flights");
		String actualMmtText = mainPage.getTextOfFligts();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,0);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test
	public void validateHotelsText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of hotels");
		String actualMmtText = mainPage.getTextOfHotels();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,1);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void validateStaysText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of stays");
		String actualMmtText = mainPage.getTextOfStays();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,2);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void validateHolidayPackagesText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of holiday packages");
		String actualMmtText = mainPage.getTextOfHolidayPackages();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,3);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void validateTrainsText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of trains");
		String actualMmtText = mainPage.getTextOfTrains();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,4);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void validateBusesText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of buses");
		String actualMmtText = mainPage.getTextOfBuses();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,5);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void validateCabsText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of cabs");
		String actualMmtText = mainPage.getTextOfCabs();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,6);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 6)
	public void validateCardsText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of cards");
		String actualMmtText = mainPage.getTextOfCards();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,7);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void validateInsuranceText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of insurance");
		String actualMmtText = mainPage.getTextOfInsurance();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,8);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 8)
	public void validateOneWayButtonText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of oneWay button");
		String actualMmtText = mainPage.getTextOfOneWay();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,9);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
		mainPage.clickOnOneWayButton();
		Thread.sleep(3000);
	}
	
	@Test(priority = 9)
	public void validateMultiCityButtonText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of multiCity button");
		String actualMmtText = mainPage.getTextOfMultiCity();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,11);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
		mainPage.clickOnMultiCityButton();
		Thread.sleep(3000);
	}
	
	@Test(priority = 10)
	public void validateRoundTripButtonText() throws EncryptedDocumentException, IOException, InterruptedException
	{
		logger.info("Getting text of round trip button");
		String actualMmtText = mainPage.getTextOfRoundTrip();
		String expectedMmtText = Utility.readExcelData(excelPath, mySheet, 0,10);
		Assert.assertEquals(actualMmtText, expectedMmtText, "Both text are different, TC Failed");
		Thread.sleep(2000);
		mainPage.clickOnRoundTripButton();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closeApplication() throws InterruptedException
	{
		logger.info("Closing Browser");
		closeBrowser();
		Thread.sleep(3000);
	}
	
}
