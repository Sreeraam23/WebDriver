package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\WebDriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
		String parentwin = driver.getWindowHandle();
		System.out.println("The parent window handle:"+parentwin);
		driver.findElement(By.xpath("(//div/a[@class='btn btn-primary followeasy'])[1]")).click();
		String win = driver.getWindowHandle();
		System.out.println("The window handle:"+win);
//		driver.close();
//		driver.switchTo().window(parentwin);
		driver.findElement(By.xpath("//div/a[@class='btn btn-primary btn-lg']")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("No of tabs opened: "+windows.size());
		for(String window:windows) {
			if(win.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(window);
				System.out.println("The window handles are: "+driver.getWindowHandle());
			}
		}



		
	}

}
