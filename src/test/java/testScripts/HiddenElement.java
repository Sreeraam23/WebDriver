package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Clear text')]"));
		WebElement search = driver.findElement(By.xpath("//input[contains(@id,'searchBar')]"));
		boolean isthere = text.isDisplayed();
		search.sendKeys("Agile Testing");
		search.sendKeys(Keys.ENTER);
		if(isthere) {
			System.out.println("The clear text is displayed after entering in search box");
		}
		else {
			System.out.println("The clear text is not displayed after entering in search box");
		}
		Thread.sleep(2000);
		search.clear();
		if(isthere) {
			System.out.println("The clear text is displayed after clearing text in search box");
		}
		else {
			System.out.println("The clear text is not displayed after clearing text in search box");
		}
	}

}
