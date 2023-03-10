package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		for (Integer i = 1; i <= 4; i++) {
			driver.findElement(By.xpath("//span/a["+i.toString()+"]")).click();//clicks the  page button at each iteration 1 2 3 4
//			boolean ispre = driver.findElement(By.xpath("//tr/td[contains(text(),'San Francisco')]")).isDisplayed();
			List<WebElement> data = driver.findElements(By.xpath("//tr/td[contains(text(),'San Francisco')]/following-sibling::td[contains(text(),'y')]"));
			List<WebElement> name = driver.findElements(By.xpath("//tr/td[contains(text(),'San Francisco')]/preceding-sibling::td[@class]"));
			for (int j = 0; j < name.size(); j++) {
				System.out.println(name.get(j).getText()+" is the employee salary who work in San Francisco with the salary : "+data.get(j).getText());
			}
		}
		

	}
}
