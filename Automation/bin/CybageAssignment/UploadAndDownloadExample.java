package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadAndDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();

		driver.navigate().to("https://demoqa.com/");
		
		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();
	
		WebElement updownLink = driver.findElement(By.xpath("//ul[@class='menu-list']//li[8]//span[text()='Upload and Download']"));
		
		js.executeScript("arguments[0].scrollIntoView();", updownLink);

		updownLink.click();
		
		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();
			
		WebElement upload = driver.findElement(By.id("uploadFile"));

        upload.sendKeys("C:\\MyData\\dummyfile.docx");
        
        driver.quit();

	}

}
