package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("#username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.name("#password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
//		driver.findElement(By.tagName("button")).click();
		boolean isdisp = driver.findElement(By.cssSelector(".flash.success")).isDisplayed();
		String msgdisp = driver.findElement(By.cssSelector(".flash.success")).getText();
		if(isdisp) {
			System.out.println(msgdisp);
		}
		driver.findElement(By.linkText("Elemental Selenium")).click();
//		driver.findElement(By.partialLinkText("Elemental Selenium")).click();
		////*[@id="content"]/div/h2
		}

}
