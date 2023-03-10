package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set the property that is set the path of type of driver and its path in the local
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		//Create an instance of webdriver(parent class) chromedriver(subclass) this method is called as dynamic overloading or polymorphism
		WebDriver driver = new ChromeDriver();
		//Maximize the windows size
		driver.manage().window().maximize();
		//get the mentioned URL in the browser
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		//Instantiate an obj of web element
		String salary = driver.findElement(By.xpath("//td[contains(text(),'Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary of Wagner "+salary);
	}

}
