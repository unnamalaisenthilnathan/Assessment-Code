package com.atmecs.shoptools.locatorspath;



import com.atmecs.shoptools.testsuite.TestBaseClass;

public class LocatorsPath extends TestBaseClass {
	//ordering
	public static String firstProductName=locatorprops.getProperty( "loc_pinktshirt_homepage");
	public static String firstProductColor=locatorprops.getProperty("loc_pinkdropoversizedtshirt_color");
	public static String firstProductColorChooseAnOption=locatorprops.getProperty("loc_pinkdropoversizedtshirt_color_chooseanoption");
	public static String  firstProductSize= locatorprops.getProperty("loc_pinkdropoversizedtshirt_size");  
	public static String  firstProductSizeChooseAnOption=locatorprops.getProperty("loc_pinkdropoversizedtshirt_size_chooseansizeoption");
	public static String  firstProductAddToCart=locatorprops.getProperty("loc_pinkdropoversizedtshirt_addtocart");
	
	public static String secondProductName=locatorprops.getProperty("loc_tokyotalkies_homepage");
	public static String secondProductColor=locatorprops.getProperty("loc_tokyotalkies_color");
	public static String secondProductColorChooseAnOption=locatorprops.getProperty("loc_tokyotalkies_color_chooseanoption");
	public static String  secondProductSize= locatorprops.getProperty("loc_tokyotalkies_size");  
	public static String  secondProductSizeChooseAnOption=locatorprops.getProperty("loc_tokyotalkies_size_chooseanoption");
	public static String  secondProductAddToCart=locatorprops.getProperty("loc_tokyotalkies_addtocart");
	
	public static String totalProductViewCart=locatorprops.getProperty("loc_product_viewcart");
	public static String firstProductValidationName=locatorprops.getProperty("loc_pinktshirt_firstproductvalidationpage");
	
	public static String expectedFirstProductName=locatorprops.getProperty("loc_pinktshirt_homepage_firstProductName");
	public static String secondProductValidationName=locatorprops.getProperty("loc_tokyotalkies_secondproductvalidationpage");
	public static String expectedSecondProductName=locatorprops.getProperty("loc_tokyotalkies_homepage_secondProductName");
	
	public static String firstProductPrice=locatorprops.getProperty("loc_pinkdropoversizedtshirt_priceforthefirstproduct");
	public static String secondProductPrice=locatorprops.getProperty("loc_tokyotalkies_priceforthesecondproduct");
	public static String grantTotalPrice=locatorprops.getProperty("loc_directgranttotalprice");
	//orderingbysearch
	public static String productBySearch=locatorprops.getProperty("loc_shoptools_searchoption");
	public static String firstProductTypeBySearch=locatorprops.getProperty("loc_shoptools_searchoption_type");
	public static String firstProductSendKeys="pink drop shoulder oversized t shirt";
	public static String firstProductColorBySearch=locatorprops.getProperty("loc_pinkdropoversizedtshirt_color");
	public static String firstProductColorBySearchChooseAnOption=locatorprops.getProperty("loc_pinkdropoversizedtshirt_color_chooseanoption");
	public static String  firstProductBySearchSize= locatorprops.getProperty("loc_pinkdropoversizedtshirt_size");  
	public static String  firstProductBySearchSizeChooseAnOption=locatorprops.getProperty("loc_pinkdropoversizedtshirt_size_chooseansizeoption");
	public static String  firstProductBySearchAddToCart=locatorprops.getProperty("loc_pinkdropoversizedtshirt_addtocart");
	
	public static String secondProductTypeBySearch=locatorprops.getProperty("loc_shoptools_searchoption_type");
	public static String secondProductSendKeys="pink fruit graphic fitted t shirt";
	public static String secondProductColorBySearch=locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_color");
	public static String secondProductColorBySearchChooseAnOption=locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_color_chooseanoption");
	public static String  secondProductBySearchSize= locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_size");  
	public static String  secondProductBySearchSizeChooseAnOption=locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_size_chooseanoption");
	public static String  secondProductBySearchAddToCart=locatorprops.getProperty("loc_pinkdropoversizedtshirt_addtocart");
	public static String productBySearchViewCart=locatorprops.getProperty("loc_product_viewcart");
	
    public static String firstProductValidationNameBySearch=locatorprops.getProperty("loc_pinktshirt_firstproductvalidationpage");
	
	public static String expectedFirstProductNameBySearch=locatorprops.getProperty("loc_pinktshirt_homepage_firstProductName");
	
	public static String secondProductValidationNameBySearch	=locatorprops.getProperty("loc_graphicfittedtshirt_secondproductvalidationpage");
	public static String secondProductAttribute=locatorprops.getProperty("loc_graphicfittedtshirt_secondProductValidation_attribute");
	public static String expectedSecondProductNameBySearch=(locatorprops.getProperty("loc_graphicfittedtshirt_homepage_secondProductName"));
	public static String firstProductValidationPriceBySearch=locatorprops.getProperty("loc_pinkdropoversizedtshirt_priceforthefirstproduct");
	public static String secondProductValidationPriceBySearch=locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_priceforthesecondproduct");
	public static String finalProductPriceValidationBySearch=locatorprops.getProperty("loc_granttotalprice");
	public static String removeAnItemBySearch=locatorprops.getProperty("loc_pinkdropoversizedtshirt_removeanitem");
	public static String removalPriceBySearch=locatorprops.getProperty("loc_afterremoval_granttotalprice");
}