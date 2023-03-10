package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set the property that is set the path of type of driver and its path in the local
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		//Create an instance of webdriver(parent class) chromedriver(subclass) this method is called as dynamic overloading or polymorphism
		WebDriver driver = new ChromeDriver();
		//Maximize the windows size
		driver.manage().window().maximize();
		//get the mentioned URL in the browser
		driver.get("https://www.lambdatest.com/blog/");
		//Instantiate an obj of web element
		List<WebElement> preceding_siblings = driver.findElements(By.xpath("//li[@id='menu-item-31219']//preceding-sibling::li"));
		for(WebElement item:preceding_siblings) {
			System.out.println("The preceding siblings to the playwrite : "+item.getText());
		}
		List<WebElement> following_siblings = driver.findElements(By.xpath("//li[@id='menu-item-31219']//following-sibling::li"));
		for(WebElement item:following_siblings) {
			System.out.println("The following siblings to the playwrite : "+item.getText());
		}
	}

}
