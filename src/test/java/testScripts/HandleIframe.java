package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\WebDriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.tagName("p")).sendKeys(" For Testing purpose I enter this text");
		driver.switchTo().defaultContent();
		WebElement bold = driver.findElement(By.xpath("(//div/button)[8]"));
		bold.click();
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.tagName("p")).sendKeys(" I enter this text in bold");
		//(//div[@class='tox-collection__item-label'])[6]
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div/button)[11]")).click();
	}

}
