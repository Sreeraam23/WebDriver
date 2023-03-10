package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleJqueryMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\WebDriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
		WebElement btn = driver.findElement(By.xpath("//a[text()='Disabled']"));
		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Enabled']"));
//		if(btn.isEnabled()) {
//			System.out.println("The button function is disabled");
//		}
		actions.moveToElement(btn1).perform();
//		btn1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Downloads = driver.findElement(By.xpath("//a[text()='Downloads']"));
//		actions.moveToElement(Downloads).perform();
		Downloads.click();
		driver.findElement(By.xpath("//a[text()='PDF']")).click();
	}

}
