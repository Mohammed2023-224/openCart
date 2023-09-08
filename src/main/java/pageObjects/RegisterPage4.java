package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class RegisterPage4  extends SetupDriver{

	Actionss act=new Actionss(Threading.getDriver());
	
	By  firstNameField =(By.id("input-firstname"));
	By   lastNameField=(By.id("input-lastname"));
	By   emailField=(By.id("input-email"));
	By   passwordField=(By.id("input-password"));
	By   subsctibeNewsLetter=(By.xpath("//div[@class='form-check form-check-inline']//label[text()='Yes']"));
	By   dontSubscribeNewsLetter=(By.xpath("//div[@class='form-check form-check-inline']//label[text()='No']"));
	By   sendButton=(By.xpath("//button[@class='btn btn-primary']"));
	By   privacyCheckBox=(By.name("agree"));
	
	@Step("typing first name")
	public void typing_first_name(String info) {
		act.clearContent(firstNameField);
		act.typing(firstNameField ,info);
		Loggers.logger.info("typing first name: "+info);
	}
	
	
	@Step("typing last name")
	public void typing_last_name(String info) {
		act.clearContent(lastNameField);
		act.typing(lastNameField,info);
		Loggers.logger.info("typing last name: "+info);
	}
	
	
	
	@Step("typing email")
	public void typing_email(String info) {
		act.clearContent(emailField);
		act.typing(emailField,info);
		Loggers.logger.info("typing email: "+info);
	}
	
	
	@Step("typing password")
	public void typing_password(String info) {
		act.clearContent(passwordField);
		act.typing(passwordField,info);
		Loggers.logger.info("typing password: "+info);
	}
	
	
	@Step("click yes news letter")
	public void clicking_news_letter_yes_button() {
		
		act.clicking(subsctibeNewsLetter);
		Loggers.logger.info("click on yes news letter");
	}
	
	
	
	@Step("click on no news letter")
	public void clicking_news_letter_no_button() {
		act.clicking(dontSubscribeNewsLetter);
		Loggers.logger.info("click on no news letter");
	}
	
	
	
	
	@Step("click on agree terms")
	public void clicking_agree_terms() {
		act.clicking(privacyCheckBox);
		Loggers.logger.info("click on agree terms");
	}
	
	
	
	
	
	@Step("click on send button")
	public void clicking_send_button() {
		act.clicking(sendButton);
		Loggers.logger.info("click on send button");
	}
	
	public boolean check_continue_btn_dispay() {
		return act.isDisplayed(sendButton);
	}
	
}
