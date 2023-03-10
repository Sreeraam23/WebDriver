package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenCartReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\WebDriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("er");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Tester123");
		action.sendKeys(Keys.PAGE_DOWN);
		action.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("input-newsletter-yes")).click();
		driver.findElement(By.className("form-check-input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
//		WebElement radiobtn = driver.findElement(By.xpath("(//input[@id='input-newsletter-yes']"));
//		action.click(radiobtn).perform();
//		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		button.click();
//		driver.findElement(By.xpath("(//div/input)[6]")).click();
//		driver.findElement(By.xpath("(//div/input)[8]")).click();
//		driver.findElement(By.xpath("(//button)[4]")).click();
		
//		Select radio = new Select(driver.findElement(By.name("newsletter")));
//		radio.selectByValue("1");
//		Select chkbox = new Select(driver.findElement(By.xpath("//input[@class='form-check-input']")));
//		chkbox.selectByValue("1");
//		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		button.click();
	}

}
