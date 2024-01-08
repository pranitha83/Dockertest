package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_nature {
	@Test
	public static void main(String[]arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.natureserve.org/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	

}
