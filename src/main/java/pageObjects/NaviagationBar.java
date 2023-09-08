package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class NaviagationBar extends SetupDriver {


	Actionss act = new Actionss(Threading.getDriver());

	By contactUsButton = (By.xpath("//i[@class='fas fa-phone']"));
	By currencyButton = (By.xpath("(//nav[@id='top']//i[@class='fas fa-caret-down'])[1]"));
	By myaccountButton = (By.xpath("//nav[@id='top']//i[@class='fas fa-user']"));
	By wishListButton = (By.xpath("//i[@class='fas fa-heart']"));
	By shoppingCartButton = (By.xpath("//i[@class='fas fa-shopping-cart']"));
	By checkOutButton = (By.xpath("//i[@class='fas fa-share']"));
	By registerSubLink = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//a[text()='Register']"));
	By LoginSubLink = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']//a[text()='Login']"));
	// list
	By currencyDropDownList = (By.xpath("//ul[@class='dropdown-menu show']"));
	By myAccountDropDownList = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right show']"));

	@Step("click on navigation bar contact us button")
	public void clicking_contact_us() {
		act.clicking(contactUsButton);
		Loggers.logger.info("click navigation bar contact us button");
	}

	@Step("click on navigation bar wish list button")
	public void clicking_wish_list() {
		act.clicking(wishListButton);
		Loggers.logger.info("click navigation bar wish list button");
	}

	@Step("click on navigation bar shoping cart button")
	public void clicking_shopping_cart() {
		act.clicking(shoppingCartButton);
		Loggers.logger.info("click navigation bar shoping cart button");
	}

	@Step("click on navigation bar check out button")
	public void clicking_check_out() {
		act.clicking(checkOutButton);
		Loggers.logger.info("click navigation bar check out button");
	}

	@Step("choose currency")
	public void choosing_currency(int index) {
		act.clicking(currencyButton);
		for (int i = 0; i < index; i++) {
			act.sendDownArrowKey(currencyDropDownList);
		}
		act.sendEnter(currencyDropDownList);
		Loggers.logger.info("choosing currency");
	}

	@Step("clicking on nav bar my account sub links")
	public void clicking_my_account() {
		act.clicking(myaccountButton);
		
		Loggers.logger.info("clicking on nav bar my account sub links");
	}
	
	
	@Step("clicking on nav bar register sub links")
	public void clicking_register_sublink() {
		act.clicking(registerSubLink);
		Loggers.logger.info("clicking on nav bar register sub links");
	}
	
	
	
	@Step("clicking on nav bar login sub links")
	public void clicking_login_sub_link() {
		act.clicking(LoginSubLink);
		Loggers.logger.info("clicking on nav bar login sub links");
	}
}
