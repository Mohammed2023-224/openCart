package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class Inventory  extends SetupDriver{

	Actionss act=new Actionss(Threading.getDriver());
	
	By listButtonFilter=(By.id("button-list"));
	
	By gridButtonFilter=(By.id("button-grid"));
	By sortingOptions=(By.id("input-sort"));
	By limitOptions=(By.id("input-limit"));
	By goToLastPage=(By.xpath("//a[@class='page-link' and text()='>|']"));
	By goToNextPage=(By.xpath("//a[@class='page-link' and text()='>']"));
	By goToFirstPage=(By.xpath("//a[@class='page-link' and text()='|<']"));
	By goToPreviousPage=(By.xpath("//a[@class='page-link' and text()='<']"));
	
	By desktoplink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Desktops')]"));
	By laptopsAndNotebookslink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Laptops & Notebooks')]"));
	By componentslink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Components')]"));
	By tabletsLink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Tablets')]"));
	By softwareLink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Software')]"));
	By phonesAndPDAlink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Phones & PDAs')]"));
	By Cameraslink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'Cameras')]"));
	By mp3Playerslink=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'MP3 Players')]"));
	//always list
	By addToCartButtons=(By.xpath("//button[@data-bs-original-title='Add to Cart']"));	
	By addToWishListButtons=(By.xpath("//button[@data-bs-original-title='Add to Wish List']"));
	By compareProductsButtons=(By.xpath("//button[@data-bs-original-title='Compare this Product']"));
	By produtsTitles=(By.xpath("//div[@class='product-thumb']//h4//a"));
	By productsLinksSubLinks=(By.xpath("//div[@class='list-group mb-3']//child::a[contains(text(),'-')]"));

	
	   @Step("clicking grid filter")
	   public void clicking_grid_filter() {
		   act.clicking(gridButtonFilter);
		   Loggers.logger.info("clicking grid filter");
	   }
	   
	   @Step("clicking list filter")
	   public void clicking_list_filter() {
		   act.clicking(listButtonFilter);
		   Loggers.logger.info("clicking list filter");
	   }
	   
	   
	   @Step("clicking nexr page")
	   public void clicking_next_page() {
		   act.clicking(goToNextPage);
		   Loggers.logger.info("clicking nexr page");
	   }
	   
	   
	   @Step("clicking last page")
	   public void clicking_last_page() {
		   act.clicking(goToLastPage);
		   Loggers.logger.info("clicking last page");
	   }
	   
	   
	   @Step("clicking previous page")
	   public void clicking_previous_page() {
		   act.clicking(goToPreviousPage);
		   Loggers.logger.info("clicking previous page");
	   }
	   
	   
	   @Step("filter products")
	   public void clicking_sorting_options(int index) {
		   act.clicking(sortingOptions);
		   act.selectDropDownListByID(sortingOptions, index);
		   Loggers.logger.info("filters products");
	   }
	   
	   @Step("limiting page")
	   public void limit_page(int index) {
		   act.clicking(limitOptions);
		   act.selectDropDownListByID(limitOptions, index);
		   Loggers.logger.info("limit page ");
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
	   
		
		@Step("click on product compare product button")
		public void clicking_product_compare_product_button(int index) {
			act.clickingElementInList(compareProductsButtons,index);
			Loggers.logger.info("click product compare product button");
		}
		
		
		
		@Step("click on product add to wish list button")
		public void clicking_products_add_to_wish_list(int index) {
			act.clickingElementInList(addToWishListButtons,index);
			Loggers.logger.info("click product add to wish list button");
		}
		
		
		@Step("click on product add to cart button")
		public void clicking_product_add_to_cart(int index) {
			act.clickingElementInList(addToCartButtons,index);
			Loggers.logger.info("click product add to cart button");
		}
		
		
		
		@Step("click on products title")
		public void clicking_products_title(int index) {
			act.clickingElementInList(produtsTitles,index);
			Loggers.logger.info("click product title");
		}
		
		
		@Step("click on featured products title")
		public void clicking_sub_links(int index) {
			act.clickingElementInList(productsLinksSubLinks,index);
			Loggers.logger.info("click sub links in filters");
		}
		
		public boolean checking_filter() {
			return act.isDisplayed(limitOptions);
		}
		
		public String checking_filter_value(int index) {
			return act.selectDropDownListByIDStatement(limitOptions, index);
		}
		
		public String checking_sorting_value(int index) {
			return act.selectDropDownListByIDStatement(sortingOptions, index);
		}
}
