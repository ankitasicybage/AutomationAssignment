package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();

		driver.findElement(By.xpath("//ul[@class='menu-list']//li[3]//span[text()='Radio Button']")).click();

		WebElement yes = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		if (yes.isEnabled()) {
			System.out.println("Yes is enabled");
			driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
			System.out.println(driver.findElement(By.className("mt-3")).getText());
		} else {
			System.out.println("Yes disabled");
		}

		WebElement impressive = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
		if (impressive.isEnabled()) {
			System.out.println("Impressive is enabled");
			driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
			System.out.println(driver.findElement(By.className("mt-3")).getText());
		} else {
			System.out.println("Impressive disabled");
		}

		WebElement no = driver.findElement(By.xpath("//input[@id='noRadio']"));
		if (no.isEnabled()) {
			System.out.println("No is enabled");
			driver.findElement(By.xpath("//label[@for=noRadio']")).click();
			System.out.println(driver.findElement(By.className("mt-3")).getText());
		} else {
			System.out.println("No  is disabled");
		}

		driver.quit();

	}

}
