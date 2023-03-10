package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String label = driver.findElement(By.cssSelector("label span")).getText();
		System.out.println("The label is "+label);
		
		//Frame 1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Hello");
		
		//Frame1 to Frame3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//Frame3 to Frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).clear();
		driver.findElement(By.xpath("//input")).sendKeys("Helo World");
		
		//MainFrame to Frame2
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//select")).click();
		Select sel = new Select(driver.findElement(By.id("animals")));
		sel.selectByVisibleText("Avatar");
		String str = sel.getFirstSelectedOption().getText();
		System.out.println("The selected options is: "+str);
	}

}
