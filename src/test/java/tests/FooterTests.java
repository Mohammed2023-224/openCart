package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageObjects.ContactUsPage;
import pageObjects.FooterPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class FooterTests extends SetupDriver {
HomePage homepage;
FooterPage footerpage;
ContactUsPage contactus;
LoginPage login;

@Test
public void check_about_us_link() {
	homepage=new HomePage();
	footerpage=new FooterPage();
	homepage.navigation();
	footerpage.clicking_about_us();
}


@Test
public void check_contact_us_link() {
	homepage=new HomePage();
	footerpage=new FooterPage();
	contactus=new ContactUsPage();
	homepage.navigation();
	footerpage.clicking_contact_us();
	Assert.assertTrue(contactus.check_name_field());
}



@Test
public void check_avout_us_link() {
	homepage=new HomePage();
	footerpage=new FooterPage();
	login=new LoginPage();
	homepage.navigation();
	footerpage.clicking_my_account();
	Assert.assertTrue(login.checking_email_field());
}
}
