package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://demoqa.com/");
		
		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();

		driver.findElement(By.xpath("//ul[@class='menu-list']//li[7]//span[text()='Broken Links - Images']")).click();
		
		driver.findElement(By.linkText("Click Here for Valid Link")).click();
		System.out.println("Valid Link clicked and opened in same tab");
		driver.navigate().back();
		driver.findElement(By.linkText("Click Here for Broken Link")).click();
		System.out.println("Broken Link clicked and opened in same tab");
		driver.navigate().back();
	
		

		
		driver.quit();

	}

}
