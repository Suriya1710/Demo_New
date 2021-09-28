package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver; // null
	
	public static String value;  

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void getUrl(String url) {

		// driver.get(url);

		driver.get(url);

	}

	public static void close() {

		driver.close();

	}

	public static void dropdown(String type, WebElement element, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {

			int index = Integer.parseInt(value);

			s.selectByIndex(index);
		}

		else if (type.equalsIgnoreCase("visible text")) {

			s.selectByVisibleText(value);

		}

		else if (type.equalsIgnoreCase("value")) {

			s.selectByValue(value);

		}
	}

	public static String particular_Data(String path, int row_Index, int column_Index) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis); // Up casting

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(column_Index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String value = cell.getStringCellValue();


			//return value;
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			String value = Double.toString(numericCellValue);

			//return value;

		}
		return value;

	}
	
	
	public static String particular_Data_From_Excel(String path, int row_Index, int cell_Index) throws Throwable {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis); // Up casting

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(cell_Index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			 value = cell.getStringCellValue();

		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			 value = Double.toString(numericCellValue);

		}
		
		return value;

		
	}
	
	
	
	
	
	
	

}
