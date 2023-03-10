package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\WebDriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver); 
		driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
		Select sel = new Select (driver.findElement(By.id("country")));
		sel.selectByValue("Australia");
		WebElement country = sel.getFirstSelectedOption();
		System.out.println(country.getText());
		Select mul = new Select(driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']")));
		mul.selectByVisibleText("Alabama");
		mul.selectByVisibleText("Alaska");
		mul.selectByVisibleText("Hawaii");
		List <WebElement> multi = mul.getAllSelectedOptions();
		for(WebElement uni:multi) {
			System.out.println("The Selected option is: "+uni.getText());
		}
		Select dissel = new Select(driver.findElement(By.xpath("//select[@class='js-example-disabled-results select2-hidden-accessible']")));
		dissel.selectByVisibleText("Virgin Islands");
		//if Guam is selected it shows Exception in thread "main" java.lang.UnsupportedOperationException: You may not select a disabled option
		WebElement disable = dissel.getFirstSelectedOption();
		System.out.println("The Selected option is: "+disable.getText());
		Select nested = new Select(driver.findElement(By.xpath("//select[@id='files']")));
		List<WebElement> options = nested.getOptions();
		for(WebElement option:options) {
		System.out.println(option.getText());
		}
		nested.selectByIndex(3);
	}

}
