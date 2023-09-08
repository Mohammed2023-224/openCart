package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.SetupDriver;
import pageObjects.HomePage;
import pageObjects.Inventory;

public class HomePageTests extends SetupDriver{
HomePage homepage;
Inventory inventory;


@Test
public void checking_tablets_link() {
	homepage=new HomePage();
	inventory=new Inventory();
	homepage.navigation();
	homepage.clicking_tablets_link();
	Assert.assertTrue(inventory.checking_filter());
}

@Test
public void checking_desktops_sublink() {
	homepage=new HomePage();
	inventory=new Inventory();
	homepage.navigation();
	homepage.clicking_desktop_link();
	homepage.clicking_sublinks(1);
	Assert.assertTrue(inventory.checking_filter());
}


@Test
public void checking_next_page_aarow() {
	homepage=new HomePage();
	inventory=new Inventory();
	homepage.navigation();
	homepage.clicking_next_pic_top_banner();
	homepage.clicking_previous_pic_top_banner();
	homepage.clicking_next_pic_top_banner();
	
}
}
