package testScripts;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.opencart.com/");
//		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
//		WebElement item = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
//		actions.moveToElement(comp).click(item).build().perform();
//		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("Apple Cinema")).click();
//		actions.scrollByAmount(10, 500).perform();
	}

}
