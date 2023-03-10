package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set the property that is set the path of type of driver and its path in the local
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		//Create an instance of webdriver(parent class) chromedriver(subclass) this method is called as dynamic overloading or polymorphism
		WebDriver driver = new ChromeDriver();
		//Maximize the windows size
		driver.manage().window().maximize();
		//get the mentioned URL in the browser
		driver.get("https://www.youtube.com/");
		//Instantiate an obj of web element	
		WebElement seabox = driver.findElement(By.tagName("input"));
		seabox.sendKeys("Selenium");
		seabox.sendKeys(Keys.ENTER);
		TimeUnit.SECONDS.sleep(4);
		driver.close();
		//this will close the opened window	
	}

}
