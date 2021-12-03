package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();

		driver.findElement(By.xpath("//ul[@class='menu-list']//li[6]//span[text()='Links']")).click();
		String parent = driver.getWindowHandle();
		
		System.out.println("Following links will open new tab");
		driver.findElement(By.id("simpleLink")).click();
		System.out.println("Link opened in a new tab");
		Thread.sleep(1000); // wait is added in the script to see what is getting clicked and opened
		driver.switchTo().window(parent);
		System.out.println("Switched to Parent window");
		Thread.sleep(1000);
		
		driver.findElement(By.id("dynamicLink")).click();
		System.out.println("Link opened in a new tab");
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		System.out.println("Switched to Parent window");
		Thread.sleep(1000);

		
		
		driver.quit();

	}

}
