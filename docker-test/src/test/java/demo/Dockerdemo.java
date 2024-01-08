package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Dockerdemo {

	public static void main(String[] args) throws MalformedURLException {
		//WebDriver driver;
		//driver= new ChromeDriver();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://44.212.95.111:4444/wd/hub"),capabilities);
		
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(((Capabilities) driver).getBrowserVersion());
		//System.out.println();
driver.close();
	}

}
