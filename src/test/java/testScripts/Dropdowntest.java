package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select sel = new Select(driver.findElement(By.id("select-demo")));
		sel.selectByValue("Tuesday");
//		sel.selectByIndex(5);
		Select mulsel = new Select(driver.findElement(By.id("multi-select")));
		mulsel.selectByIndex(0);
		mulsel.selectByValue("New York");	
		mulsel.deselectByValue("New York");
		mulsel.selectByVisibleText("Washington");
		List<WebElement> multisel = mulsel.getAllSelectedOptions();
		for(WebElement item:multisel) {
			System.out.println(item.getText());
		}
//		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//		driver.findElement(By.xpath("(//label[contains(text(),'Male')])[1]")).click();
//		driver.findElement(By.xpath("(//label[contains(text(),'15 to 50')])")).click();
	}

}
