package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class FooterPage extends SetupDriver{

	Actionss act=new Actionss(Threading.getDriver());
	
	By termsAndConditionsLink=(By.xpath("//a[text()='Terms & Conditions']"));
	By aboutUsLink=(By.xpath("//a[text()='About Us']"));
	By contactUsLink=(By.xpath("//a[text()='Contact Us']"));
	By brandsLink=(By.xpath("//a[text()='Brands']"));
	By myAccountLink=(By.xpath("//a[text()='My Account']"));
	By orderHistoryLink=(By.xpath("//a[text()='Order History']"));
	
	
	@Step("click on terms and conditions link from footer")
	public void clicking_terms_and_condition() {
		act.clicking(termsAndConditionsLink);
		Loggers.logger.info("clicking terms& conditions from footer links");
	}
	
	@Step("click on about us link from footer")
	public void clicking_about_us() {
		act.clicking(aboutUsLink);
		Loggers.logger.info("clicking about us from footer links");
	}
	
	
	@Step("click on contact us link from footer")
	public void clicking_contact_us() {
		act.clicking(contactUsLink);
		Loggers.logger.info("clicking contact us from footer links");
	}
	
	
	@Step("click on brands link from footer")
	public void clicking_brands_link() {
		act.clicking(brandsLink);
		Loggers.logger.info("clicking nrands link from footer links");
	}
	
	
	
	@Step("click on my account link from footer")
	public void clicking_my_account() {
		act.clicking(myAccountLink);
		Loggers.logger.info("clicking my account from footer links");
	}
	
	
	@Step("click on order history link from footer")
	public void clicking_order_history() {
		act.clicking(orderHistoryLink);
		Loggers.logger.info("clicking order history from footer links");
	}
	
}
