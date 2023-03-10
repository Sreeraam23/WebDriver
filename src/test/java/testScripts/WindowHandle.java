package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentwin = driver.getWindowHandle();
		System.out.println("Parent ID: "+parentwin);
		driver.findElement(By.xpath("(//div//a/button[@class='btn btn-info'])[1]")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("No of tabs opened: "+windows.size());
		for(String win:windows) {
			if(!win.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]")).click();
			}
		}
		driver.close();
		driver.switchTo().window(parentwin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
		Thread.sleep(2000);
		driver.quit();
	}

}
