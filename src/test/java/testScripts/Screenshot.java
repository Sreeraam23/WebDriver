package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File scr = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("F:\\Screenshots_folder\\test.png"));
		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
		File compscr = comp.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(compscr,new File("F:\\Screenshots_folder\\comptest.png"));
		WebElement item = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
		actions.moveToElement(comp).click(item).build().perform();
		Thread.sleep(2000);
		actions.scrollByAmount(10, 500).perform();
	}

}
