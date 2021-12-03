package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextboxExample {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
//		Actions a = new Actions(driver);
	      
		
		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();
		
		driver.findElement(By.xpath("//ul[@class='menu-list']//li[1]//span[text()='Text Box']")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Test Name");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("testemail@test.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("TestCurrentAddress");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("TesttPermanentAddress");
		
//		a.moveToElement(driver.findElement(By.xpath("//button[@id='submit']"))).click();
		
		Thread.sleep(7000); 
		
	driver.quit();

	}

}
