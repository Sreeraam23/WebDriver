package testScripts;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numbers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set the property that is set the path of type of driver and its path in the local
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		//Create an instance of webdriver(parent class) chromedriver(subclass) this method is called as dynamic overloading or polymorphism
		WebDriver driver = new ChromeDriver();
		//Maximize the windows size
		driver.manage().window().maximize();
		//get the mentioned URL in the browser
		driver.get("https://the-internet.herokuapp.com/inputs");
		//Instantiate an obj of web element	
		WebElement inputbox = driver.findElement(By.tagName("input"));
		inputbox.sendKeys("100");
		inputbox.sendKeys(Keys.ENTER);
		driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
		for(int i = 0;i<20;i++) {
			driver.findElement(By.tagName("button")).click();
		}
		for(int i = 0;i<20;i++) {
			driver.findElement(By.className("added-manually")).click();
		}
		TimeUnit.SECONDS.sleep(2);
	    driver.close();	
	}

}
