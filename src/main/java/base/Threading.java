package base;

import org.openqa.selenium.WebDriver;

public class Threading {

	protected static  ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();

	
	public static WebDriver getDriver() {
		Loggers.logger.debug("get the driver from ThreadLocal variable");
		return driver.get();
	}
	public static void setDriver(WebDriver ddr) {
        Loggers.logger.debug("save the driver to ThreadLocal variable");
        driver.set(ddr);
	}
	public static void unload() {

        driver.remove();
        Loggers.logger.debug("remove the driver from ThreadLocal variable");
	}
	
}
