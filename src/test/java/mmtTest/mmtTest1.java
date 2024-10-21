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


public class mmtTest1 extends base 
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
	
	@AfterMethod
	public void closeApplication() throws InterruptedException
	{
		logger.info("Closing Browser");
		closeBrowser();
		Thread.sleep(3000);
	}
	
}
