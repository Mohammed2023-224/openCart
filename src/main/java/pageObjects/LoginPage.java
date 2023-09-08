package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class LoginPage extends SetupDriver {

	Actionss act=new Actionss(Threading.getDriver());
	
	By newCustomerRegistrationButton=(By.xpath("//div[@class='col-sm-6']//a[text()='Continue']"));
	By customerLoginButton=(By.xpath("//div[@class='col-sm-6']//button[text()='Login']"));
	By forgetPasswordLink=(By.xpath("//div[@class='col-sm-6']//a[text()='Forgotten Password']"));
	By emailField=(By.name("email"));
	By passwordField=(By.name("password"));
	//side menu links
	By loginSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Login']"));
	By registerSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Register']"));
	By forgottenPasswordSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Forgotten Password']"));
	By myAccountSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='My Account']"));
	By addressBookSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Address Book']"));
	By wishListSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Wish List']"));
	By orderHistorySideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Order History']"));
	By downloadsSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Downloads']"));
	By subscriptionsSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Subscriptions']"));
	By rewardPointsSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Reward Points']"));
	By returnsSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Returns']"));
	By transactionsSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Transactions']"));
	By newsletterSideMenuLink=(By.xpath("//div[@class='list-group mb-3']//child::a[text()='Newsletter']"));
	
	
	@Step("click on register button")
	public void clicking_register_button() {
		act.clicking(newCustomerRegistrationButton);
		Loggers.logger.info("click on new customer registration");
	}
	@Step("click on login button")
	public void clicking_login_button() {
		act.clicking(customerLoginButton);
		Loggers.logger.info("click on login button");
	}
	
	@Step("click on forget password link")
	public void clicking_forget_password() {
		act.clicking(forgetPasswordLink);
		Loggers.logger.info("click on forget password");
	}
	@Step("typing email")
	public void typing_email(String info) {
		act.typing(emailField,info);
		Loggers.logger.info("typing email: "+info);
	}

	@Step("typing password")
	public void typing_password(String info) {
		act.typing(passwordField,info);
		Loggers.logger.info("typing password: "+info);
	}

	
	@Step("click on transactions")
	public void clicking_transactions() {
		act.clicking(transactionsSideMenuLink);
		Loggers.logger.info("click on transactions");
	}
	
	
	@Step("click on returns")
	public void clicking_returns() {
		act.clicking(returnsSideMenuLink);
		Loggers.logger.info("click on returns");
	}
	
	@Step("click on subscriptions")
	public void clicking_subscriptions() {
		act.clicking(subscriptionsSideMenuLink);
		Loggers.logger.info("click on subscriptions");
	}
	
	
	
	@Step("click on order history")
	public void clicking_order_history() {
		act.clicking(orderHistorySideMenuLink);
		Loggers.logger.info("click on order history");
	}
	
	
	
	@Step("click on my account link")
	public void clicking_my_account_link() {
		act.clicking(myAccountSideMenuLink);
		Loggers.logger.info("click on my account link");
	}
	
	public boolean checking_email_field() {
		return act.isDisplayed(emailField);
	}
}
