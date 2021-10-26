package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ExecuteTestZalenium {
	
	@Test
	public void test () throws MalformedURLException, InterruptedException {
		
		System.out.println("Thread which is running" +Thread.currentThread().getId()); 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		cap.setPlatform(Platform.LINUX);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), cap);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
}
}
