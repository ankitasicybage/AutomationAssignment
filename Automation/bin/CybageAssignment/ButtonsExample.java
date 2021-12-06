package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();

		driver.findElement(By.xpath("//ul[@class='menu-list']//li[5]//span[text()='Buttons']")).click();
		
		Actions a= new Actions(driver);

		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		if (doubleClick.isEnabled()) {
			System.out.println("DoubleClick button is enabled");
			a.doubleClick(doubleClick).build().perform();
			System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		} 
		else {
			System.out.println("DoubleClick button is disabled");
		}

		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		if (rightClick.isEnabled()) {
			System.out.println("RightClick button is enabled");
			a.contextClick(rightClick).build().perform();
			System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		} else {
			System.out.println("RightClick button is disabled");
		}

		WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		if (clickMe.isEnabled()) {
			System.out.println("ClickMe Button is enabled");
			clickMe.click();
			System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
		} else {
			System.out.println("ClickMe Button is disabled");
		}
		
		driver.quit();

	}

}
