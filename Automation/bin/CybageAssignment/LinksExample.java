package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		System.out.println("Simple link with link text " +driver.findElement(By.id("simpleLink")).getText()+ " opened in a new tab");
		Thread.sleep(1000); // wait is added in the script to see what is getting clicked and opened
		driver.switchTo().window(parent);
		System.out.println("Switched to Parent window");
		Thread.sleep(1000);
		
		driver.findElement(By.id("dynamicLink")).click();
		System.out.println("Dynamic link with link text " +driver.findElement(By.id("dynamicLink")).getText() +" opened in a new tab");
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		System.out.println("Switched to Parent window");
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		System.out.println("Following links will send an api call");
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='created']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='no-content']")).click();
	    Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='moved']")).click();
	    Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='bad-request']")).click();
	    Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='unauthorized']")).click();
	    Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='forbidden']")).click();
	    Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.findElement(By.xpath("//div[@id='linkWrapper']//a[@id='invalid-url']")).click();
	    Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		
		driver.quit();

	}

}
