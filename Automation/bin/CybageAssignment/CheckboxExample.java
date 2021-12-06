package CybageAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckboxExample {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
	      
		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();
		
		driver.findElement(By.xpath("//span[@class='text' and text()='Check Box']")).click();
		
		WebElement chckbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']")); 
		chckbox.click();
//		if (chckbox.isSelected())
//		{					
//            System.out.println("Checkbox is Toggled On");					
//        }
//		else 
//		{			
//            System.out.println("Checkbox is Toggled Off");	
//		
//		       }
	    driver.findElement(By.xpath("//button[@title='Expand all']")).click();
	    driver.findElement(By.xpath("//label[@for='tree-node-notes']//span")).click();
	    driver.findElement(By.xpath("//label[@for='tree-node-react']//span")).click();
	    driver.findElement(By.xpath("//label[@for='tree-node-public']//span")).click();
	    driver.findElement(By.xpath("//label[@for='tree-node-wordFile']//span")).click();
	    
	    Thread.sleep(3000); // wait is added just to see what is being clicked
	    
	    driver.findElement(By.xpath("//button[@title='Toggle']")).click();
	    
	    Thread.sleep(3000);  // wait is added just to see what is being clicked
		
    	driver.quit();

	}
	
}
