package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionss {
	Actions act;
	WebDriver driver;

	public Actionss(WebDriver driver) {
		this.driver = driver;
	}

	public void waitTillElementVisibility(By byele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(byele));
	}

	public void waitTillElementClickable(By byele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(byele));
	}

	public void waitfluentlytillElementClickable(By byele) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(byele));
		// Wait for the element to be visible and interact with it
//        WebElement element = wait.until(driver -> driver.findElement(byele));
//        element.click();
	}

	public void typing(By byele, String info) {
		waitTillElementVisibility(byele, 20);
		driver.findElement(byele).sendKeys(info);
	}

	public void moveToElement(By byele) {
		waitTillElementVisibility(byele, 20);
		act = new Actions(driver);
		act.moveToElement(driver.findElement(byele)).perform();
	}

	public void clicking(By byele) {

		waitTillElementVisibility(byele, 20);
//		driver.findElement(byele).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(byele));
	}

	public void clickingElementInList(By byele, int index) {
		waitTillElementVisibility(byele, 20);
		List<WebElement> elements = driver.findElements(byele);
		for (int i = 0; i < elements.size(); i++) {
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", elements.get(index));
		}

	}

	public void clearContentByDeleteKey(By byele) {
		waitTillElementVisibility(byele, 20);
		if (!driver.findElement(byele).getAttribute("value").isEmpty()) {
			driver.findElement(byele).sendKeys(Keys.CONTROL + "A");
			driver.findElement(byele).sendKeys(Keys.DELETE);

		}
	}

	public void clearContentByBackSpaces(By byele) {
		waitTillElementVisibility(byele, 20);
		if (!driver.findElement(byele).getAttribute("value").isEmpty()) {
			driver.findElement(byele).sendKeys(Keys.END); // Move cursor to the end of the text
			while (!driver.findElement(byele).getAttribute("value").isEmpty()) {
				driver.findElement(byele).sendKeys(Keys.BACK_SPACE);
			}
		}
	}

	public void clearContent(By byele) {
		waitTillElementVisibility(byele, 20);
		driver.findElement(byele).clear();

	}

	public boolean isDisplayed(By ele) {
		waitTillElementVisibility(ele, 15);
		if (driver.findElement(ele).isDisplayed()) {
			return true;

		} else {
			return false;
		}
	}

	public void sendDownArrowKey(By byele) {
		waitTillElementVisibility(byele, 20);
		driver.findElement(byele).sendKeys(Keys.ARROW_DOWN);
	}

	public void sendEnter(By byele) {
		waitTillElementVisibility(byele, 20);
		driver.findElement(byele).sendKeys(Keys.ENTER);
	}

	public void selectDropDownListByID(By byele, int index) {
		waitTillElementVisibility(byele, 10);
		Select options = new Select(driver.findElement(byele));
		options.selectByIndex(index);
	}
	
	public String selectDropDownListByIDStatement(By byele, int index) {
		waitTillElementVisibility(byele, 10);
		Select options = new Select(driver.findElement(byele));
		options.selectByIndex(index);
		WebElement we=options.getFirstSelectedOption();
		return we.getText();
	}

}
