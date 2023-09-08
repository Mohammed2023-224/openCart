package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageObjects.HomePage;
import pageObjects.Inventory;
import pageObjects.NaviagationBar;

public class InventoryTests extends SetupDriver{
HomePage homepage;
Inventory inventory;
NaviagationBar navbar;


@Test
public void checkin_limit_functionality() {
	homepage=new HomePage();
	inventory=new Inventory();
	homepage.navigation();
	homepage.clicking_tablets_link();
	inventory.limit_page(2);
//	System.out.println(inventory.checking_filter_value(2));
	Assert.assertTrue(inventory.checking_filter_value(2).equals("50"));
	
}

@Test
public void checkin_sorting_functionality() {
	homepage=new HomePage();
	inventory=new Inventory();
	homepage.navigation();
	homepage.clicking_tablets_link();
	inventory.clicking_sorting_options(3);
//	System.out.println(inventory.checking_filter_value(2));
	Assert.assertTrue(inventory.checking_sorting_value(3).equals("Price (Low > High)"));
	
}
}
