package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.SetupDriver;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.NaviagationBar;

public class ContactUsTests extends SetupDriver {
	HomePage homepage;
	NaviagationBar navbar;
	ContactUsPage contactus;
	@Test
	public void send_message() {
		 homepage=new HomePage();
		 navbar=new NaviagationBar();
		contactus=new ContactUsPage();
		homepage.navigation();
		navbar.clicking_contact_us();
		contactus.type_name("salah");
		contactus.type_email("hamada@5.com");
		contactus.type_enquiry("ur products are shit");
		contactus.clicking_submit_button();
		Assert.assertTrue(contactus.check_continue_shooping_button());
	}
	
	@DataProvider
	public Object[][] invalid_Data(){
		return new Object[][]
				{
			{"","sh@sh.com","ur products are shit","Name must be between 3 and 32 characters!"},
			{"salah","","ur products are shit","E-Mail Address does not appear to be valid!"},
			{"salah","sh@sh.com","","Enquiry must be between 10 and 3000 characters!"}
				};
	}
	
	@Test(dataProvider = "invalid_Data")
	public void wrong_info_contacting(String name,String email,String enquiry,String error) {
		 homepage=new HomePage();
		 navbar=new NaviagationBar();
		contactus=new ContactUsPage();
		homepage.navigation();
		navbar.clicking_contact_us();
		contactus.type_name(name);
		contactus.type_email(email);
		contactus.type_enquiry(enquiry);
		contactus.clicking_submit_button();
		if(name=="") {
			Assert.assertTrue(contactus.check_name_error());
		}
		else if(email=="") {
			Assert.assertTrue(contactus.check_email_error());
		}
		else if(enquiry=="") {
			Assert.assertTrue(contactus.check_enquiry_error());
		}
	}

}
