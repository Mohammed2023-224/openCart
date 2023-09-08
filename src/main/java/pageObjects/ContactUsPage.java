package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class ContactUsPage  extends SetupDriver{
	Actionss act=new Actionss(Threading.getDriver());

	By nameField=(By.name("name"));
	By emailField=(By.name("email"));
	By enquiryField=(By.name("enquiry"));
	By submitButton=(By.xpath("//button[@type='submit']"));	
	By nameError=(By.id("error-name"));
	By emailError=(By.id("error-email"));
	By enquiryError=(By.id("error-enquiry"));
	By continueShopping=(By.xpath("//div[@class='float-end']"));
	
	@Step("typing name")
	public void type_name(String info) {
		act.typing(nameField, info);
		Loggers.logger.info("typing name in the name field:"+ info );
	}
	
	@Step("typing email")
	public void type_email(String info) {
		act.typing(emailField, info);
		Loggers.logger.info("typing email in the email field:"+ info );
	}
	
	
	@Step("typing enquiry")
	public void type_enquiry(String info) {
		act.typing(enquiryField, info);
		Loggers.logger.info("typing enquiry in the textarea field:"+ info );
	}
	
	
	@Step("pressing the submit button")
	public void clicking_submit_button() {
		act.clicking(submitButton);
		Loggers.logger.info("clicking the submit burron" );
	}
	
	public boolean check_continue_shooping_button() {
		return act.isDisplayed(continueShopping);
	}
	
	
	
	public boolean check_email_error() {
		return act.isDisplayed(emailError);
	}
	
	
	
	public boolean check_name_error() {
		return act.isDisplayed(nameError);
	}
	
	
	
	public boolean check_enquiry_error() {
		return act.isDisplayed(enquiryError);
	}
	
	public boolean check_name_field() {
		return act.isDisplayed(nameField);
	}
}
