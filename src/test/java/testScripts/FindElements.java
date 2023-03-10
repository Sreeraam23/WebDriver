package testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set the property that is set the path of type of driver and its path in the local
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		//Create an instance of webdriver(parent class) chromedriver(subclass) this method is called as dynamic overloading or polymorphism
		WebDriver driver = new ChromeDriver();
		//Maximize the windows size
		driver.manage().window().maximize();
		//get the mentioned URL in the browser
		driver.get("https://automationbookstore.dev/");
		//Instantiate an obj of web element	
		List<WebElement> elements = driver.findElements(By.xpath("//h2[starts-with(@id,'pid')]"));
		for(WebElement ele:elements) {
			System.out.println("The elements whose id starts with pid are: "+ele.getText());
			System.out.println("The elements whose id starts with pid are: "+ele.getAttribute("id"));
			if(ele.getText().equalsIgnoreCase("Agile Testing")) {
				ele.click();
			}
		}
//		TimeUnit.SECONDS.sleep(4);
//		driver.close();
	}

}
