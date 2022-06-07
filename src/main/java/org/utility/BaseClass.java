package org.utility;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;

	}

	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}

	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	// sendkeys
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);

	}

	// click
	public static void click(WebElement e) {
		e.click();
	}

	// move to element
	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	// drag and drop
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}

	// title
	public static String title() {
		String title = driver.getTitle();
		return title;
	}

	// current url
	public static String currentUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}

	// getAttribute
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;

	}

	// double click
	public static void doubleClick(WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	// context click(Right click)
	public static void contextClick(WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}

	// release
	public static void release(WebElement target) {
		Actions a = new Actions(driver);
		a.release(target).perform();
	}

	// click and Hold
	public static void clickAndHold(WebElement target) {
		Actions a = new Actions(driver);
		a.clickAndHold(target).perform();
	}

	// accept
	public static Alert accept() {
		Alert a1 = driver.switchTo().alert();
		return a1;
	}

	// dismiss
	public static Alert disMiss() {
		Alert a1 = driver.switchTo().alert();
		return a1;
	}

	// get text by alert
	public static Alert getText() {
		Alert a1 = driver.switchTo().alert();
		return a1;

	}
	// sendkeys by alert

	public static Alert sendKeys() {
		Alert a1 = driver.switchTo().alert();
		return a1;

	}

	// select by index
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	// select by value
	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	// select by visible text
	public static void selectByVisibleText(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	// quite
	public static void quite() {
		driver.quit();

	}

	// getScreenshotAs
	public static void getScreenshotAs() {
		TakesScreenshot ts = (TakesScreenshot) driver;
          ts.getScreenshotAs(OutputType.FILE);
	}

	//execute script
	public static void executeScript(String script, WebElement e) {
      JavascriptExecutor js=(JavascriptExecutor)driver;	
       js.executeScript(script, e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static String getExcel(String filename, String sheet, int r, int c) throws IOException {
//		File f = new File("D:\\Eclipse\\MavenProject\\src\\test\\resources\\Excel2.xlsx");
//		// file to code
//		FileInputStream f1 = new FileInputStream(f);
//
//		Workbook w = new XSSFWorkbook(f1);
//
//		Sheet s = w.getSheet("Sheet1");
//
//		Row row = s.getRow(1);
//
//		Cell c1 = row.getCell(0);
//		
//		int type = c1.getCellType();
//		
//		String value;
//		
//		if(type==1) {
//			 value = c1.getStringCellValue();
//		}
//		
//		else {
//			
//			if (DateUtil.isCellDateFormatted(c1)) {
//
//				Date d = c1.getDateCellValue();
//				SimpleDateFormat si = new SimpleDateFormat("dd-MMM-YY");
//				 value = si.format(d);
//
//		}
//			else {
//				
//				double d = c1.getNumericCellValue();
//				long l=(long)d;
//				 value = String.valueOf(l);
//				}
//		
//		}
//		
//		return value;
//		

}
