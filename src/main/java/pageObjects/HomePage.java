package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class HomePage extends SetupDriver{


	Actionss act=new Actionss(Threading.getDriver());
	
	
	By topBannerPreviousArrow=(By.xpath("//div[@id='carousel-banner-0']//child::button[@class='carousel-control-prev']"));
	By topBannerNextArrow=(By.xpath("//div[@id='carousel-banner-0']//child::button[@class='carousel-control-next']"));
	By bottomBannerNextArrow=(By.xpath("//div[@id='carousel-banner-1']//child::button[@class='carousel-control-next']"));
	By bottomBannerPreviousArrow=(By.xpath("//div[@id='carousel-banner-1']//child::button[@class='carousel-control-prev']"));
	By logo=(By.id("logo"));
	By searchField=(By.xpath("//input[@name='search']"));	
	By searchButton=(By.xpath("//div[@id='search']//button"));
	By cartButton=(By.xpath("//div[@id='header-cart']//button"));
	By topPic=(By.xpath("//div[@id='carousel-banner-0']"));
	
	By desktoplink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Desktops']"));
	By laptopsAndNotebookslink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Laptops & Notebooks']"));
	By componentslink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Components']"));
	By tabletsLink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Tablets']"));
	By softwareLink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Software']"));
	By phonesAndPDAlink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Phones & PDAs']"));
	By Cameraslink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='Cameras']"));
	By mp3Playerslink=(By.xpath("//div[@id='narbar-menu']//child::a[text()='MP3 Players']"));
	
	// always list
	By topBannerSmallCircles=(By.xpath("//div[@id='carousel-banner-0']//child::div[@class='carousel-indicators']//child::button"));
	By bottomBannerSmallCircles=(By.xpath("//div[@id='carousel-banner-1']//child::div[@class='carousel-indicators']//child::button"));
	By topBannerProductsImgs=(By.xpath("//div[@id='carousel-banner-0']//child::img"));
	By featuredProductsImages=(By.xpath("//div[@id='content']//child::div[@class='row']//child::img"));
	By featuredProductsTitles=(By.xpath("//div[@id='content']//child::div[@class='row']//child::div[@class='description']//child::h4//child::a"));
	By featuredProductsAddToWishList=(By.xpath("//div[@id='content']//child::div[@class='row']//child::button[@data-bs-original-title='Add to Wish List']"));
	By featuredProductsAddToCart=(By.xpath("//div[@id='content']//child::div[@class='row']//child::button[@data-bs-original-title='Add to Cart']"));
	By featuredProductsCompareProductButton=(By.xpath("//div[@id='content']//child::div[@class='row']//child::button[@data-bs-original-title='Compare this Product']"));
	By navigationLinksSubLinks=(By.xpath("//div[@class='dropdown-menu show']//a"));
	
	@Step("click on next pic arrow")
	public void clicking_next_pic_top_banner() {
		act.moveToElement(topPic);
		act.clicking(topBannerNextArrow);
		Loggers.logger.info("click next pic top banner arrow");
	}
	
	@Step("click on previous pic arrow")
	public void clicking_previous_pic_top_banner() {
		act.moveToElement(topBannerPreviousArrow);
		act.clicking(topBannerPreviousArrow);
		Loggers.logger.info("click previous pic top banner");
	}
	
	
	@Step("click on next pic arrow")
	public void clicking_next_pic_bottpm_banner() {
		act.moveToElement(bottomBannerNextArrow);
		act.clicking(bottomBannerNextArrow);
		Loggers.logger.info("click next pic bottom baner");
	}
	
	
	@Step("click on previous pic arrow")
	public void clicking_previous_pic_bottom_banner() {
		act.clicking(bottomBannerPreviousArrow);
		Loggers.logger.info("click previous pic bottom banner arrow");
	}
	
	@Step("click on small circles top banner")
	public void clicking_small_circles_top_banner(int index) {
		act.clickingElementInList(topBannerSmallCircles,index);
		Loggers.logger.info("click small circles in top banner");
	}
	
	@Step("click on images top banner")
	public void clicking_images_top_banner(int index) {
		act.clickingElementInList(topBannerProductsImgs,index);
		Loggers.logger.info("click images in top banner");
	}
	
	@Step("click on small circles bottom banner")
	public void clicking_small_circles_bottom_banner(int index) {
		act.clickingElementInList(bottomBannerSmallCircles,index);
		Loggers.logger.info("click small circles in bottom banner");
	}
	
	

	
	
	@Step("click on featured product compare product button")
	public void clicking_featured_product_compare_product_button(int index) {
		act.clickingElementInList(featuredProductsCompareProductButton,index);
		Loggers.logger.info("click featured product compare product button");
	}
	
	
	
	@Step("click on featured product add to wish list button")
	public void clicking_featured_products_add_to_wish_list(int index) {
		act.clickingElementInList(featuredProductsAddToWishList,index);
		Loggers.logger.info("click featured product add to wish list button");
	}
	
	
	@Step("click on featured product add to cart button")
	public void clicking_featured_product_add_to_cart(int index) {
		act.clickingElementInList(featuredProductsAddToCart,index);
		Loggers.logger.info("click featured product add to cart button");
	}
	
	
	
	@Step("click on featured products title")
	public void clicking_featured_products_title(int index) {
		act.clickingElementInList(featuredProductsTitles,index);
		Loggers.logger.info("click featured product title");
	}
	
	
	@Step("click on featured products image")
	public void clicking_featured_products_image(int index) {
		act.clickingElementInList(featuredProductsImages,index);
		Loggers.logger.info("click featured product image");
	}
	
   @Step("navigate to website")
   public void navigation() {
	   driver.navigate().to(prop.getProperty("URL"));
	   Loggers.logger.info("navigate to website");
   }
	
   
   @Step("clicking logo")
   public void clicking_logo() {
	   act.clicking(logo);
	   Loggers.logger.info("clicking logo");
   }

   @Step("typing in search field")
   public void typing_in_search_field(String info) {
	   act.typing(searchField,info);
	   Loggers.logger.info("typing in search field"+info);
   }
   
   @Step("clicking search button")
   public void clicking_search_button() {
	   act.clicking(searchButton);
	   Loggers.logger.info("clicking search button");
   }
   
   
   @Step("clicking cart")
   public void clicking_cart() {
	   act.clicking(cartButton);
	   Loggers.logger.info("clicking cart");
   }

   
   
   @Step("clicking desktop link")
   public void clicking_desktop_link() {
	   act.clicking(desktoplink);
	   Loggers.logger.info("clicking desktop link");
   }
   
   
   @Step("clicking tablets link")
   public void clicking_tablets_link() {
	   act.clicking(tabletsLink);
	   Loggers.logger.info("clicking tablets link");
   }
   
   
   @Step("clicking phones link")
   public void clicking_phones_link() {
	   act.clicking(phonesAndPDAlink);
	   Loggers.logger.info("clicking phones link");
   }
   
   
   @Step("clicking software link")
   public void clicking_software_link() {
	   act.clicking(softwareLink);
	   Loggers.logger.info("clicking software link");
   }
   
   @Step("clicking laptops& notebooks link")
   public void clicking_laptops_and_notebooks_link() {
	   act.clicking(laptopsAndNotebookslink);
	   Loggers.logger.info("clicking laptops& notebooks link");
   }
   
   
   @Step("clicking components link")
   public void clicking_components_link() {
	   act.clicking(componentslink);
	   Loggers.logger.info("clicking components link");
   }
   
   
   @Step("clicking cameras link")
   public void clicking_cameras_link() {
	   act.clicking(Cameraslink);
	   Loggers.logger.info("clicking cameras link");
   }
   
   
   @Step("clicking mp3 players link")
   public void clicking_mp3_players() {
	   act.clicking(mp3Playerslink);
	   Loggers.logger.info("clicking mp3 players link");
   }
	@Step("click on navigation bar sublinks")
	public void clicking_sublinks(int index) {
		int attempts=0;
		
		@SuppressWarnings("unused")
		boolean succ=false;
		int max=2;
		try {
			while(attempts<max) {
				act.clickingElementInList(navigationLinksSubLinks,index);
				succ=true;
				break;
			}
		}
		catch(StaleElementReferenceException e) { attempts++;}
		finally {}
		
		Loggers.logger.info("click navigation bar sublinks");
	}

}
