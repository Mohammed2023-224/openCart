package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import pageObjects.HomePage;
import pageObjects.NaviagationBar;
import pageObjects.RegisterPage4;

public class RegisterTests extends SetupDriver {
	HomePage homepage;
	RegisterPage4 registerpage;
	NaviagationBar navbar;
	@Feature("registration")
	@Description("successful register")
	@Test
	public void successful_register() {
		homepage=new HomePage();
		registerpage =new RegisterPage4();
		navbar=new NaviagationBar();
		homepage.navigation();
		navbar.clicking_my_account();
		navbar.clicking_register_sublink();
		registerpage.typing_first_name("sarag");
		registerpage.typing_last_name("saragBeh");
		registerpage.typing_email("sa@sa.sa");
		registerpage.typing_password("sa");
		registerpage.clicking_news_letter_no_button();
		registerpage.clicking_agree_terms();
		registerpage.clicking_send_button();	
		Assert.assertTrue(registerpage.check_continue_btn_dispay());
	}
	
	@Feature("registration")
	@Description("unsuccessful register")
	@Test
	public void unsuccessful_register() {
		homepage=new HomePage();
		registerpage =new RegisterPage4();
		navbar=new NaviagationBar();
		homepage.navigation();
		navbar.clicking_my_account();
		navbar.clicking_register_sublink();
		registerpage.typing_first_name("sarag");
		registerpage.typing_last_name("saragBeh");
		registerpage.typing_email("sa");
		registerpage.typing_password("sa");
		registerpage.clicking_news_letter_no_button();
		registerpage.clicking_agree_terms();
		registerpage.clicking_send_button();	
		Assert.assertTrue(registerpage.check_continue_btn_dispay());
	}


}
