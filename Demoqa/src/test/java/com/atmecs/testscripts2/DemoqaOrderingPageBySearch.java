package com.atmecs.testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.shoptools.locatorspath.LocatorsPath;
import com.atmecs.testsuite.TestBaseClass;
import com.atmecs.util.CommonUtilities;

public class DemoqaOrderingPageBySearch extends TestBaseClass {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
	}

	@Test
	public void bysearch() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		CommonUtilities obj = new CommonUtilities();
		LocatorsPath path = new LocatorsPath();
		obj.click(driver, path.productBySearch);
		WebElement firstProduct = driver.findElement(By.xpath(path.firstProductTypeBySearch));
		firstProduct.sendKeys(path.firstProductSendKeys);// testdata
		firstProduct.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollBy(0,500)");
		obj.click(driver, path.firstProductColorBySearch);
		obj.click(driver, path.firstProductColorBySearchChooseAnOption);
		obj.click(driver, path.firstProductBySearchSize);
		obj.click(driver, path.firstProductBySearchSizeChooseAnOption);
		obj.click(driver, path.firstProductBySearchAddToCart);

		obj.click(driver, path.productBySearch);
		WebElement secondProduct = driver.findElement(By.xpath(path.secondProductTypeBySearch));
		secondProduct.sendKeys(path.secondProductSendKeys);// testdata
		secondProduct.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollBy(0,500)");
		obj.click(driver, path.secondProductColorBySearch);
		obj.click(driver, path.secondProductColorBySearchChooseAnOption);
		obj.click(driver, path.secondProductBySearchSize);

		obj.click(driver, path.secondProductBySearchSizeChooseAnOption);
		obj.click(driver, path.secondProductBySearchAddToCart);

		obj.click(driver, path.productBySearchViewCart);

		js.executeScript("window.scrollBy(0,500)");

		WebElement firstProductValidation = driver.findElement(By.xpath(path.firstProductValidationNameBySearch));
		String firstProductName = firstProductValidation.getText();
		obj.verifyassert(firstProductName, path.expectedFirstProductNameBySearch,
				"OverSized t-shirt is present in the cart ");

		WebElement secondProductValidation = driver.findElement(By.xpath(path.secondProductValidationNameBySearch));
		String secondProductName = secondProductValidation.getAttribute(path.secondProductAttribute);
		obj.verifyassert(secondProductName, path.expectedSecondProductNameBySearch,
				"fitted t-shirt is present in the cart ");

		WebElement firstProductPrice = driver.findElement(By.xpath(path.firstProductValidationPriceBySearch));
		String textFirstPrice = firstProductPrice.getText();
		String valu1 = textFirstPrice.replaceAll("[^0-9.]", "");
		double i = Double.parseDouble(valu1);
		System.out.println("1First_Product Price is: " + i);

		WebElement SecondProductPrice = driver.findElement(By.xpath(path.secondProductValidationPriceBySearch));
		String textSecondPrice = SecondProductPrice.getText();
		String valu2 = textSecondPrice.replaceAll("[^0-9.]", "");
		double j = Double.parseDouble(valu2);
		System.out.println("2First_Product Price is: " + j);

		WebElement FinalProductPrice = driver.findElement(By.xpath(path.finalProductPriceValidationBySearch));
		String textGrantTotalPrice = FinalProductPrice.getText();
		String valu3 = textGrantTotalPrice.replaceAll("[^0-9.]", "");
		double k = Double.parseDouble(valu3);
		System.out.println("GrantTotalPriceis: " + k);

		obj.click(driver, path.removeAnItemBySearch);

		js.executeScript("window.scrollBy(0,500)");

		WebElement afterRemovalFinalProductPrice = driver.findElement(By.xpath(path.removalPriceBySearch));
		String textAfterRemovalGrantTotalPrice = afterRemovalFinalProductPrice.getText();
		String valu4 = textAfterRemovalGrantTotalPrice.replaceAll("[^0-9.]", "");
		double l = Double.parseDouble(valu4);
		System.out.println("GrantTotalPriceis: " + l);

	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
