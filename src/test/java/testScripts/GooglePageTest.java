package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
//		searchBox.sendKeys(Keys.ENTER);
		System.out.println("Page Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();	
		driver.navigate().back();
		driver.navigate().to("https://www.selenium.dev");
		System.out.println("Page Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		
		
		
		
		
	}

}
