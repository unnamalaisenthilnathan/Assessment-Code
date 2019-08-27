package com.atmecs.shoptools.testscripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.atmecs.logreports.LogReportInformation;
import com.atmecs.shoptools.locatorspath.LocatorsPath;
import com.atmecs.shoptools.testsuite.TestBaseClass;
import com.atmecs.shoptools.util.CommonUtilities;

public class DemoqaOrderingPage extends TestBaseClass {
	// String a=locatorprops.getProperty("loc_pinkdropoversizedtshirt_color");
	WebDriver driver;
	WebElement ele;
	LogReportInformation log = new LogReportInformation();
	LocatorsPath path = new LocatorsPath();

	@BeforeTest
	public void setup() {
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();

	}

	@Test
	public void orders() {
		CommonUtilities obj = new CommonUtilities();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		obj.click(driver, path.firstProductName);
		js.executeScript("window.scrollBy(0,500)");
		obj.click(driver, path.firstProductColor);
		obj.click(driver, path.firstProductColorChooseAnOption);
		obj.click(driver, path.firstProductSize);
		obj.click(driver, path.firstProductSizeChooseAnOption);
		obj.click(driver, path.firstProductAddToCart);
		driver.navigate().back();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,1000)");
		obj.click(driver, path.secondProductName);
		js.executeScript("window.scrollBy(0,500)");
		obj.click(driver, path.secondProductColor);
		obj.click(driver, path.secondProductColorChooseAnOption);
		obj.click(driver, path.secondProductSize);
		obj.click(driver, path.secondProductSizeChooseAnOption);
		obj.click(driver, path.secondProductAddToCart);
		obj.click(driver, path.totalProductViewCart);
		js.executeScript("window.scrollBy(0,500)");

		WebElement firstProductValidation = driver.findElement(By.xpath(path.firstProductValidationName));
		String firstProductName = firstProductValidation.getText();
		obj.verifyassert(firstProductName, path.expectedFirstProductName, "OverSized t-shirt is present in the cart ");
		WebElement secondProductValidation = driver.findElement(By.xpath(path.secondProductValidationName));
		String secondProductName = secondProductValidation.getText();
		obj.verifyassert(secondProductName, path.expectedSecondProductName, "Maxi dress is present in the cart ");

		WebElement firstProductPriceValidation = driver.findElement(By.xpath(path.firstProductPrice));

		String textFirstPrice = firstProductPriceValidation.getText();

		String valu1 = textFirstPrice.replaceAll("[^0-9.]", "");
		double i = Double.parseDouble(valu1);
		System.out.println("1First_Product Price is: " + i);

		WebElement SecondProductPrice = driver.findElement(By.xpath(path.secondProductPrice));
		String textSecondPrice = SecondProductPrice.getText();

		String valu2 = textSecondPrice.replaceAll("[^0-9.]", "");
		double j = Double.parseDouble(valu2);
		System.out.println("2First_Product Price is: " + j);

		WebElement FinalProductPrice = driver.findElement(By.xpath(path.grantTotalPrice));
		String textGrantTotalPrice = FinalProductPrice.getText();

		String valu3 = textGrantTotalPrice.replaceAll("[^0-9.]", "");
		double k = Double.parseDouble(valu3);
		System.out.println("GrantTotalPriceis: " + k);

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
