package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	public static WebDriver driver;
	public static FileReader fr;
	public static Properties prop;
	@Parameters("browsername")
	@BeforeMethod
	public void setupDriver(String browsername) throws IOException {
		fr = new FileReader(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources"
				+ File.separator + "config.properties");
		prop=new Properties();
		prop.load(fr);
//		prop.getProperty("browser")
		
		if(browsername.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			Threading.setDriver(driver);
			Loggers.logger.info("start chrome browser and add it to safe thread");
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			Threading.setDriver(driver);
			Loggers.logger.info("start firefox browser and add it to safe thread");
			
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("start-maximized");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(options);
			Threading.setDriver(driver);
			Loggers.logger.info("start edge browser and add it to safe thread");
		}
		else if(browsername.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
			Threading.setDriver(driver);
			Loggers.logger.info("start safari browser and add it to safe thread");
		}
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		Threading.getDriver().quit();
		Threading.unload();
		Loggers.logger.info("close browser and remove the safe thread");
	}

}
