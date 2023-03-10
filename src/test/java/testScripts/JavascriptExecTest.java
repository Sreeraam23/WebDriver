package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Chrome110\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();	
		driver.get("https://demo.opencart.com");
		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
		WebElement item = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("alert('HI')");
		
//		String title = (String)js.executeScript("return document.title");
//		System.out.println("Title: "+title);
//		actions.moveToElement(comp).click(item).build().perform();
//		js.executeScript("history.go(-1)");	
	}

}
