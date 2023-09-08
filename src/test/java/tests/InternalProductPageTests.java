package tests;

import org.testng.annotations.Test;

import base.SetupDriver;
import pageObjects.HomePage;
import pageObjects.Inventory;
import pageObjects.ProductInternalPage;

public class InternalProductPageTests extends SetupDriver{
	HomePage homepage;
	Inventory inventory;
	ProductInternalPage internalpage;
	
	
	@Test
	public void change_quantity() {
		homepage=new HomePage();
		inventory=new Inventory();
		internalpage=new ProductInternalPage();
		homepage.navigation();
		homepage.clicking_tablets_link();
		inventory.clicking_products_title(0);
		internalpage.typing_quantity("3");
		
	}
	@Test
	public void product_add_to_cart() {
		homepage=new HomePage();
		inventory=new Inventory();
		internalpage=new ProductInternalPage();
		homepage.navigation();
		homepage.clicking_tablets_link();
		inventory.clicking_products_title(0);
		internalpage.clicking_add_to_cart();
	}
	
	
	
	@Test
	public void product_write_review() {
		homepage=new HomePage();
		inventory=new Inventory();
		internalpage=new ProductInternalPage();
		homepage.navigation();
		homepage.clicking_tablets_link();
		inventory.clicking_products_title(0);
		internalpage.clicking_reviews();
		internalpage.typing_name("salah");
		internalpage.typing_review("good products");
		internalpage.clicking_rating_circle(3);
		internalpage.clicking_continue_review();
	}
}
