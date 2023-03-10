package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTCtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\WebDriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("(//span/input)[1]")).sendKeys("ERODE JN - ED");
		driver.findElement(By.xpath("(//span/input)[2]")).sendKeys("YESVANTPUR JN - YPR");
		driver.findElement(By.xpath("(//label[@class='css-label_c t_c'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[contains(text(),'Search')]")).click();
	}

}
