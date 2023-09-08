package pageObjects;

import org.openqa.selenium.By;

import base.Actionss;
import base.Loggers;
import base.SetupDriver;
import base.Threading;
import io.qameta.allure.Step;

public class ProductInternalPage extends SetupDriver{

	Actionss act=new Actionss( Threading.getDriver());
	
	By productTitle=(By.xpath("//div[@class='col-sm']//h1"));
	By brandName=(By.xpath("//div[@class='col-sm']//li[text()='Brand: ']//a"));
	By compareProductButton=(By.xpath("//div[@class='col-sm']//i[@class='fas fa-exchange-alt']"));
	By addToWishList=(By.xpath("//div[@class='col-sm']//i[@class='fas fa-heart']"));
	By qtyField=(By.id("input-quantity"));
	By addToCartButton=(By.xpath("//div[@class='col-sm']//button[text()='Add to Cart']"));
	By bigPic=(By.xpath("(//div[@class='col-sm']//img)[1]"));
	By descriptionButton=(By.xpath("//ul[@class='nav nav-tabs']//a[text()='Description']"));
	By specificationButton=(By.xpath("//ul[@class='nav nav-tabs']//a[text()='Specification']"));
	By reviewButton=(By.xpath("//ul[@class='nav nav-tabs']//a[contains(text(),'Review')]"));
	By nameField=(By.id("input-name"));
	By reviewField=(By.id("input-text"));
	By continueReviewButton=(By.id("button-review"));
	//always a list
	By smallPics=(By.xpath("//div[@class='col-sm']//img[@class='img-thumbnail']"));
	By ratingCircles=(By.xpath("//div[@id='input-rating']//input"));
	
	@Step("click on brand title")
	public void clicking_brand_title() {
		act.clicking(brandName);
		Loggers.logger.info("click on brand title");
	}
	
	@Step("click on compare product")
	public void clicking_compare_product() {
		act.clicking(compareProductButton);
		Loggers.logger.info("click on compare product");
	}
	
	@Step("click on add to wish list")
	public void clicking_ad_to_wish_list() {
		act.clicking(addToWishList);
		Loggers.logger.info("click on add to wish list");
	}
	
	@Step("click on add to cart")
	public void clicking_add_to_cart() {
		act.clicking(addToCartButton);
		Loggers.logger.info("click on add to cart");
	}
	
	
	@Step("click on description tab")
	public void clicking_description_tab() {
		act.clicking(descriptionButton);
		Loggers.logger.info("click on description tab");
	}
	
	
	@Step("click on specification tab")
	public void clicking_specification() {
		act.clicking(specificationButton);
		Loggers.logger.info("click on specification tab");
	}
	
	
	@Step("click on reviews tab")
	public void clicking_reviews() {
		act.clicking(reviewButton);
		Loggers.logger.info("click on reviews tab");
	}
	
	@Step("click on continue reviews ")
	public void clicking_continue_review() {
		act.clicking(continueReviewButton);
		Loggers.logger.info("click on continue reviews ");
	}
	
	@Step("click on the big pic ")
	public void clicking_big_pic() {
		act.clicking(bigPic);
		Loggers.logger.info("click on big pic");
	}

	@Step("typing review")
	public void typing_review(String info) {
		act.typing(reviewField,info);
		Loggers.logger.info("typing review: "+info);
	}
	@Step("typing name")
	public void typing_name(String info) {
		act.typing(nameField,info);
		Loggers.logger.info("typing name: "+info);
	}
	@Step("typing quantity")
	public void typing_quantity(String info) {
		act.typing(qtyField,info);
		Loggers.logger.info("typing quantity: "+info);
	}
	@Step("click on the samll pic ")
	public void clicking_small_pic(int index) {
		act.clickingElementInList(smallPics,index);
		Loggers.logger.info("click on small pic");
	}
	
	@Step("select rating circle")
	public void clicking_rating_circle(int index) {
		act.clickingElementInList(ratingCircles,index);
		Loggers.logger.info("select rating circle");
	}
}
