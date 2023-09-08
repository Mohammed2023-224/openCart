package tests;

import org.testng.annotations.Test;

import base.SetupDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.NaviagationBar;

public class LoginTests  extends SetupDriver{
	HomePage homepage;
	LoginPage login;
	NaviagationBar navbar;
	
	@Test
	public void unsuccessful_login() {
		homepage=new HomePage();
		navbar=new NaviagationBar();
		login=new LoginPage();
		homepage.navigation();
		navbar.clicking_my_account();
		navbar.clicking_login_sub_link();
		login.typing_email("hamad");
		login.typing_password("fff");
		login.clicking_login_button();
		login.checking_email_field();
		
	}

}
